package ru.sbt.twitter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(TweetsCompositeKey.class)
@Table(name = "tweets")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tweet {
    @Id
    @Column(name = "userid")
    private Long userid;

    @Id
    @Column(name = "tweetid")
    private Long tweetid;

    @Column(name = "content")
    private String content;

    @Column(name = "date")
    private Timestamp date;
}
