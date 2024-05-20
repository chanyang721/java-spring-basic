//package hello.hellospring.repository;
//
//import hello.hellospring.domain.Member;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class MemoryMemberRepositoryTest {
//
//    MemoryMemberRepository repository = new MemoryMemberRepository();
//
//    @AfterEach
//    public void afterEach() {
//        repository.clearStore();
//    }
//
//    @Test
//    public void save () {
//        // given
//        Member member = new Member();
//        member.setName("chanyang");
//
//        // when
//        repository.save(member);
//
//        // then
//        Member result = repository.findById(member.getId()).get();
//        result.equals(member.getId());
//    }
//}
