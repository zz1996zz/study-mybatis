package jeongsu.mybatis.biz.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    private Long id;
    private String name;
    private String phone;
    private String email;
    private Blog blog;

    @Builder
    public Member(Long id, String name, String phone, String email, Blog blog) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.blog = blog;
    }
}
