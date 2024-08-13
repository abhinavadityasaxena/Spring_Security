package com.hugewarriors.DailyDiary.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "diaries")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sn;
    private int userId;
    private String heading;
    private String data;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Diary(int userId, String heading, String data){
        this.userId = userId;
        this.heading = heading;
        this.data = data;
    }
}
