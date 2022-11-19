package jeongsu.mybatis.web.controller;

import jeongsu.mybatis.biz.service.MemberService;
import jeongsu.mybatis.web.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/join")
    public ResponseEntity<MemberDto> join(MemberDto memberDto) {
        return ResponseEntity.ok(memberService.join(memberDto));
    }
}
