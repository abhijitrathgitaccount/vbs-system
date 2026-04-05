package com.vbs.vbs.repository;

import com.vbs.vbs.entity.BreakdownRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreakdownRepository extends JpaRepository<BreakdownRequest, Long> {
}