package hello.hellospring.config;

import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.repository.interfaces.MemberRepository;
import hello.hellospring.services.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* 스프링 빈으로 DI
* */
@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
