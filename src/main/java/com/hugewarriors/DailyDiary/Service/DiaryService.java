package com.hugewarriors.DailyDiary.Service;

import com.hugewarriors.DailyDiary.Model.Diary;
import com.hugewarriors.DailyDiary.Repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DiaryService {
    private final DiaryRepository diaryRepository;

    @Autowired
    public DiaryService(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }

    public Diary insertData(Diary diary) {
        diary.setCreatedAt(LocalDateTime.now());
        diary.setUpdatedAt(LocalDateTime.now());
        return diaryRepository.save(diary);
    }

    public List<Diary> getDiaries(Integer userId){
        return diaryRepository.getDiaries(userId);
    }

    public Diary getDiaryBySn(Integer sn){
        return diaryRepository.getDiaryBySn(sn);
    }
}