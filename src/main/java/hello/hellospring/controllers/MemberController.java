package hello.hellospring.controllers;

import hello.hellospring.domain.Member;
import hello.hellospring.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    private final MemberService memberService;


    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("login")
    public Long Login(Member member) {
        return memberService.login(member);
    }
}
