package jeongsu.mybatis.biz.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Blog {

    private Long blogId;
    private String name;
    private List<Post> postList;

    @Builder
    public Blog(Long blogId, String name, List<Post> postList) {
        this.blogId = blogId;
        this.name = name;
        this.postList = postList;
    }

    public void addPostList(Post post) {
        this.postList.add(post);
    }
}