package com.spring.ems.repository;

import com.spring.ems.models.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepo extends JpaRepository<Leaves,Integer> {

}
