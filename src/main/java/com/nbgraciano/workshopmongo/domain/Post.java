package com.nbgraciano.workshopmongo.domain;

import com.nbgraciano.workshopmongo.dto.AuthorDTO;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Post {
    @Id
    private String id;
    private Date data;
    private String title;
    private String body;
    private AuthorDTO author;
    public Post(){};

    public Post(String id,Date data, String title, String body,AuthorDTO author) {
        this.data = data;
        this.title = title;
        this.body = body;
        this.id = id;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;
        return getId().equals(post.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
