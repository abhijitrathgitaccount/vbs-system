package com.vbs.vbs.service;

import com.vbs.vbs.entity.BreakdownRequest;
import java.util.List;

public interface BreakdownService {

    void saveRequest(BreakdownRequest request);

    List<BreakdownRequest> getAllRequests();

    void markCompleted(Long id);
}