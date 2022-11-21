package jeongsu.mybatis.biz.service;

import jeongsu.mybatis.biz.domain.Member;
import jeongsu.mybatis.biz.repository.MemberMapperRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    MemberMapperRepository memberMapperRepository;

    @Test
    void 회원가입() {
        //given
        Member member = new Member(1L,"김유신", "01012341234", "lee@naver.com", null);

        //when
        memberMapperRepository.insertMember(member);
        Member findMember = memberMapperRepository.selectMemberByName("김유신").get();

        //then
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }
}