package entity.person;

/**
 * Created by shaobo.su on 2017/7/17.
 */
public class Article {
    private int id;
    private Person person;
    private String title;
    private String content;

    public Article(){

    }
    public Article(int id, Person person, String title, String content) {
        this.id = id;
        this.person = person;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", person=" + person +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
