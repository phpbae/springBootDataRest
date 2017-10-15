package com.example.rest.domain;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "departmentGroup")
@EqualsAndHashCode(exclude = "departmentGroup")
@Entity
@Table(name = "department")
public class Department {

    @Column(name = "department_idx", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentIdx;

    @Column(name = "department_name")
    private String departmentName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_group_idx", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private DepartmentGroup departmentGroup;

}
