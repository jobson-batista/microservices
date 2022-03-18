package com.jobson.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobson.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
