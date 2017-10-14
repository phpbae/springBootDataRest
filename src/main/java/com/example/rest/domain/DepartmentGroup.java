package com.example.rest.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "departmentsOfGroup")
@EqualsAndHashCode(exclude = "departmentsOfGroup")
@Entity
@Table(name = "department_group")
public class DepartmentGroup {

    @Column(name = "department_group_idx", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int departmentGroupIdx;

    @Column(name = "department_group_name")
    String departmentGroupName;

    //FK가 만들어진다. (many 쪽에 FK가 생성)
    //mappedBy는 양방향 관계에서, 주체가 되는쪽(many)을 정의
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "departmentGroup")
    List<Department> departmentsOfGroup;
}
