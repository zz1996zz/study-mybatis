package jeongsu.mybatis.biz.repository;

import jeongsu.mybatis.biz.domain.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapperRepository {
    int insertMember(Member member);
}