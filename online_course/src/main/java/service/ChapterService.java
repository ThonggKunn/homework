package service;

import entity.Chapter;
import entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ChapterRepository;

import java.util.List;

@Service
public class ChapterService {
    @Autowired
    private ChapterRepository chapterRepository;

    public Chapter addChapter(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    public List<Chapter> getChaptersByCourse(Course course) {
        return chapterRepository.findByCourse(course);
    }

    public void deleteChapter(Long id) {
        chapterRepository.deleteById(id);
    }
}
