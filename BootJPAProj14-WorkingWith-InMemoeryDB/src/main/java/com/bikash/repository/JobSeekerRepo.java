package com.bikash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikash.entity.JobSeeker;

public interface JobSeekerRepo extends JpaRepository<JobSeeker,Integer>{

}
