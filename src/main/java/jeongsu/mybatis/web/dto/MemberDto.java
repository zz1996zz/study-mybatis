package jeongsu.mybatis.web.dto;

import jeongsu.mybatis.biz.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private String name;
    private String phone;
    private String email;

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .phone(phone)
                .email(email)
                .build();
    }
}
