package com.example.rest.repository;


import com.example.rest.domain.Member;
import com.example.rest.domain.MemberProjectionInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = MemberProjectionInterface.class)
public interface MemberRepository extends JpaRepository<Member, Integer> {

    @RestResource(path = "desc")
    public List<Member> findAllByOrderByMemberIdxDesc();

    @RestResource(path = "asc")
    public List<Member> findAllByOrderByMemberIdxAsc();

    /**
     * 파라미터를 받는 검색 메소드
     */
    @RestResource(path = "test", rel = "한글도될까")
    public List<Member> findByMemberNameContaining(@Param("name") String name);
}
