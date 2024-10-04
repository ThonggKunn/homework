package controller;

import entity.Chapter;
import entity.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.LessonService;

import java.util.List;

@RestController
@RequestMapping("/api/lessons")
public class LessonController {
    @Autowired
    private LessonService lessonService;

    @PostMapping("/add")
    public ResponseEntity<Lesson> addLesson(@RequestBody Lesson lesson) {
        Lesson newLesson = lessonService.addLesson(lesson);
        return ResponseEntity.ok(newLesson);
    }

    @GetMapping("/chapter/{chapterId}")
    public ResponseEntity<List<Lesson>> getLessonsByChapter(@PathVariable Long chapterId) {
        Chapter chapter = new Chapter();
        chapter.setId(chapterId); // Tạo đối tượng Chapter với id của chapter truyền vào
        List<Lesson> lessons = lessonService.getLessonsByChapter(chapter);
        return ResponseEntity.ok(lessons);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLesson(@PathVariable Long id) {
        lessonService.deleteLesson(id);
        return ResponseEntity.noContent().build();
    }
}

