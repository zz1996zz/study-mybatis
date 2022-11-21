package jeongsu.mybatis.biz.service;

import jeongsu.mybatis.biz.repository.MemberMapperRepository;
import jeongsu.mybatis.web.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapperRepository memberMapperRepository;

    public int join(MemberDto memberDto) {
        return memberMapperRepository.insertMember(memberDto.toEntity());
    }

    public int withdraw(Long memberId) {
        return memberMapperRepository.deleteMember(memberId);
    }
}
