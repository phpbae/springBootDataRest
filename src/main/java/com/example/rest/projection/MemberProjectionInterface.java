package com.example.rest.projection;


import com.example.rest.domain.Member;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "detail", types = {Member.class})
public interface MemberProjectionInterface {
    int getMemberIdx();
    String getMemberName();

    @Value("#{target.memberName} #{target.memberDescription}")
    String getMemberFullInfo();

}
