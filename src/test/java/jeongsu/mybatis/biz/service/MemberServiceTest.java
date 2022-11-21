package jeongsu.mybatis.biz.service;

import jeongsu.mybatis.biz.domain.Member;
import jeongsu.mybatis.biz.repository.MemberMapperRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
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

    @Test
    void 회원탈퇴() {
        //given
        Member member = new Member(1L,"김유신", "01012341234", "lee@naver.com", null);
        memberMapperRepository.insertMember(member);
        Member findMember = memberMapperRepository.selectMemberByName("김유신").get();
        Long memberId = findMember.getMemberId();

        //when
        memberMapperRepository.deleteMember(memberId);
        Member member1 = memberMapperRepository.selectMemberByName("김유신").orElse(null);

        //then
        assertThat(member1).isNull();
    }
}