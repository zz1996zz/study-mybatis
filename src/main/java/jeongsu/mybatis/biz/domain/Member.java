package jeongsu.mybatis.biz.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    private Long memberId;
    private String name;
    private String phone;
    private String email;
    private Blog blog;

    @Builder
    public Member(Long memberId, String name, String phone, String email, Blog blog) {
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.blog = blog;
    }
}
