package Annotation.anno1;

/**
 * Created by shaobo.su on 2017/7/19.
 */
public class ForumService {
    @NeedTest(value = true)
    public void deleteForum(int forumId) {
        System.out.println("delete forum" + forumId);
    }

    @NeedTest(value = false)
    public void deleteTopic(int postId) {
        System.out.println("delete topic" + postId);
    }
}
