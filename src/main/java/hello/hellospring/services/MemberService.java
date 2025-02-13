package hello.hellospring.services;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.interfaces.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long login(Member member) {
        validationDuplicateName(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validationDuplicateName (Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다");
                });
    }

    public Member findById(Member member) {
        return memberRepository.findById(member.getId()).get();
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
