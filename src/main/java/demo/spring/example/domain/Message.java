package demo.spring.example.domain;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;
    private String tag;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    private String filename;

    public Message() {
    }

    public Message(String text, String tag, User author) {
        this.author = author;
        this.text = text;
        this.tag = tag;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFilename(String filename)
    {
        this.filename = filename;
    }

    public String getText() {
        return this.text;
    }

    public String getTag() {
        return this.tag;
    }

    public Long getId() {
        return this.id;
    }

    public String getFilename()
    {
        return this.filename;
    }

    public User getAuthor(){
        return this.author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getAuthorName() {
        return this.author != null ? this.author.getUsername() : "<none>";
    }
}

