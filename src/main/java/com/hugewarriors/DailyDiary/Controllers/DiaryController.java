package com.hugewarriors.DailyDiary.Controllers;

import com.hugewarriors.DailyDiary.Model.Diary;
import com.hugewarriors.DailyDiary.Service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiaryController {
    private final DiaryService diaryService;

    @Autowired
    public DiaryController(DiaryService diaryService) { this.diaryService = diaryService; }
    @PostMapping(value = "/diary/insert")
    public ResponseEntity<Diary> insertDiary(@RequestBody Diary diary){
        Diary curDiary = diaryService.insertData(diary);
        return ResponseEntity.ok(curDiary);
    }

    @GetMapping(value = "/diary/get/{userId}")
    public List<Diary> getDiaries(@PathVariable("userId") Integer userId){
        return diaryService.getDiaries(userId);
    }

    @GetMapping(value = "diary/diaryBySn/{sn}")
    public Diary getDiaryBySn(@PathVariable Integer sn){
        return diaryService.getDiaryBySn(sn);
    }
}
