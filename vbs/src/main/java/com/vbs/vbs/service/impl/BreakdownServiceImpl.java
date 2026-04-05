package com.vbs.vbs.service.impl;

import com.vbs.vbs.entity.BreakdownRequest;
import com.vbs.vbs.repository.BreakdownRepository;
import com.vbs.vbs.service.BreakdownService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BreakdownServiceImpl implements BreakdownService {

    private final BreakdownRepository repo;

    public BreakdownServiceImpl(BreakdownRepository repo) {
        this.repo = repo;
    }

    @Override
    public void saveRequest(BreakdownRequest request) {
        request.setStatus("PENDING");
        request.setCreatedAt(LocalDateTime.now());
        repo.save(request);
    }

    @Override
    public List<BreakdownRequest> getAllRequests() {
        return repo.findAll();
    }

    @Override
    public void markCompleted(Long id) {
        BreakdownRequest req = repo.findById(id).orElseThrow();
        req.setStatus("COMPLETED");
        repo.save(req);
    }
}