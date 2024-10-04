package service;

import entity.Chapter;
import entity.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LessonRepository;

import java.util.List;

@Service
public class LessonService {
    @Autowired
    private LessonRepository lessonRepository;

    public Lesson addLesson(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    public List<Lesson> getLessonsByChapter(Chapter chapter) {
        return lessonRepository.findByChapter(chapter);
    }

    public void deleteLesson(Long id) {
        lessonRepository.deleteById(id);
    }
}

