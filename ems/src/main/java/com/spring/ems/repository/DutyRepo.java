package com.spring.ems.repository;

import com.spring.ems.models.Duty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DutyRepo extends JpaRepository<Duty,Integer> {
}
