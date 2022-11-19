package jeongsu.mybatis.biz.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Blog {

    private Long id;
    private String name;
    private Member member;
    private List<Post> postList;

    @Builder
    public Blog(Long id, String name, Member member, List<Post> postList) {
        this.id = id;
        this.name = name;
        this.member = member;
        this.postList = postList;
    }

    public void addPostList(Post post) {
        this.postList.add(post);
    }
}