package com.example.rest.domain;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "department", types = {Department.class})
public interface DepartmentProjectionInterface {
    int getDepartmentIdx();

    DepartmentGroup getDepartmentGroup();
}
