package jeongsu.mybatis.biz.repository;

import jeongsu.mybatis.biz.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapperRepository {
    int insertMember(Member member);
    Optional<Member> selectMemberByName(String name);
}