package com.example.rest.projection;


import com.example.rest.domain.Department;
import com.example.rest.domain.DepartmentGroup;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "department", types = {Department.class})
public interface DepartmentProjectionInterface {
    int getDepartmentIdx();
    DepartmentGroup getDepartmentGroup();
}
