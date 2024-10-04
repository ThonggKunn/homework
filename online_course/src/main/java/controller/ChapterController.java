package controller;

import entity.Chapter;
import entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ChapterService;

import java.util.List;

@RestController
@RequestMapping("/api/chapters")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;

    @PostMapping("/add")
    public ResponseEntity<Chapter> addChapter(@RequestBody Chapter chapter) {
        Chapter newChapter = chapterService.addChapter(chapter);
        return ResponseEntity.ok(newChapter);
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<Chapter>> getChaptersByCourse(@PathVariable Long courseId) {
        Course course = new Course();
        course.setId(courseId); // Tạo đối tượng Course với id của course truyền vào
        List<Chapter> chapters = chapterService.getChaptersByCourse(course);
        return ResponseEntity.ok(chapters);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChapter(@PathVariable Long id) {
        chapterService.deleteChapter(id);
        return ResponseEntity.noContent().build();
    }
}

