package com.himedia.g05;

import com.himedia.g05.dto.MemberDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Member;

@SpringBootTest
public class TestController {

    @Test
    public void testmethod(){


        //@AllArgsConstructor 사용
        //MemberDto mdto = new MemberDto( "scott","김하나" );

        //@Builder사용
        MemberDto mdto = MemberDto.builder()
                        .id("scott")
                        .name("홍길동")
                        .build();
        System.out.println(mdto.getId());
        System.out.println(mdto.getName());
        System.out.println(mdto);
    }

}

