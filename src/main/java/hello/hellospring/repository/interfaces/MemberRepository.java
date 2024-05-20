package hello.hellospring.repository.interfaces;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

/*
* 함수 정의
* */
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
