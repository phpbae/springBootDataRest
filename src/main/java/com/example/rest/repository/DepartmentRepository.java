package com.example.rest.repository;


import com.example.rest.domain.Department;
import com.example.rest.projection.DepartmentProjectionInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = DepartmentProjectionInterface.class)
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @RestResource(path = "department_name")
    List<Department> findByDepartmentNameContaining(@Param("departmentName") String departmentName); //전체검색
}
