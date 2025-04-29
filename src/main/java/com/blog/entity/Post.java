package com.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="posts")
@Data //instead of using getter and setter method, we can use this annotation
@AllArgsConstructor //instead of using constructors
@NoArgsConstructor  //instead of using constructors
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true) //this annotation helps one post to map to many comments and cascade helps for updation in 2 classes in a single time
    private List<Comment> comments = new ArrayList<>();
}
