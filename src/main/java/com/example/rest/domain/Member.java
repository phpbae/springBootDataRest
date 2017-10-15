package com.example.rest.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "member")
public class Member {

    @Id
    @Column(name = "member_idx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberIdx;

    @Column(name = "member_description")
    private String memberDescription;

    @Column(name = "member_name")
    private String memberName;


}
