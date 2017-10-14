package com.example.rest.repository;

import com.example.rest.domain.DepartmentGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartmentGroupRepository extends JpaRepository<DepartmentGroup, Integer> {
}
