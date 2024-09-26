
CREATE SCHEMA elearning;
USE elearning;

CREATE TABLE admin
(
    id           BIGINT PRIMARY KEY AUTO_INCREMENT,
    status       VARCHAR(50)                         NOT NULL,
    username     VARCHAR(255) NULL,
    password     VARCHAR(255) NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_date TIMESTAMP NULL
);

CREATE TABLE student
(
    id           BIGINT PRIMARY KEY AUTO_INCREMENT,
    name         VARCHAR(255)                        NOT NULL,
    status       VARCHAR(50)                         NOT NULL,
    age          INT NULL,
    username     VARCHAR(255) NULL,
    password     VARCHAR(255) NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_date TIMESTAMP NULL
);

CREATE TABLE teacher
(
    id           BIGINT PRIMARY KEY AUTO_INCREMENT,
    name         VARCHAR(255)                        NOT NULL,
    status       VARCHAR(50)                         NOT NULL,
    username     VARCHAR(255) NULL,
    password     VARCHAR(255) NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_date TIMESTAMP NULL
);


CREATE TABLE course
(
    id           BIGINT PRIMARY KEY AUTO_INCREMENT,
    name         VARCHAR(255)                        NOT NULL,
    description  VARCHAR(1000) NULL,
    status       VARCHAR(50)                         NOT NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_date TIMESTAMP NULL,
    teacher_id   BIGINT,
    FOREIGN KEY (teacher_id) REFERENCES teacher (id)
);

CREATE TABLE chapter
(
    id           BIGINT PRIMARY KEY AUTO_INCREMENT,
    name         VARCHAR(255)                        NOT NULL,
    description  VARCHAR(1000) NULL,
    status       VARCHAR(50)                         NOT NULL,
    `order`      INT                                 NOT NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_date TIMESTAMP NULL,
    course_id    BIGINT,
    FOREIGN KEY (course_id) REFERENCES course (id)
);

select * from chapter;

CREATE TABLE lesson
(
    id           BIGINT PRIMARY KEY AUTO_INCREMENT,
    name         VARCHAR(255)                        NOT NULL,
    description  VARCHAR(1000) NULL,
    status       VARCHAR(50)                         NOT NULL,
    type         VARCHAR(50)                         NOT NULL,
    url          VARCHAR(50) NULL,
    `order`      INT                                 NOT NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_date TIMESTAMP NULL,
    chapter_id   BIGINT,
    FOREIGN KEY (chapter_id) REFERENCES chapter (id)
);

select * from lesson;

CREATE TABLE student_course
(
    student_id   BIGINT,
    course_id    BIGINT,
    rating       INT NULL,
    review       VARCHAR(5000) NULL,
    status       VARCHAR(50)                         NOT NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_date TIMESTAMP NULL,
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES student (id),
    FOREIGN KEY (course_id) REFERENCES course (id)
);


CREATE TABLE student_course_lesson
(
    user_course_user_id   BIGINT,
    user_course_course_id BIGINT,
    lesson_id             BIGINT,
    status                VARCHAR(50)                         NOT NULL,
    created_date          TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_date          TIMESTAMP NULL,
    PRIMARY KEY (user_course_user_id, user_course_course_id, lesson_id),
    FOREIGN KEY (user_course_user_id, user_course_course_id) REFERENCES student_course (student_id, course_id),
    FOREIGN KEY (lesson_id) REFERENCES lesson (id)
);

INSERT INTO admin (status, username, password, created_date, updated_date)
VALUES ('active', 'admin1', 'hashed_password_1', NOW(), NULL),
       ('active', 'admin2', 'hashed_password_2', NOW(), NULL);

INSERT INTO student (name, status, age, username, password, created_date, updated_date)
VALUES ('John Doe', 'active', 19, 'johndoe', 'hashed_password_3', NOW(), NULL),
       ('Jane Smith', 'active', 20, 'janesmith', 'hashed_password_4', NOW(), NULL),
       ('Alice Brown',  'inactive', 18, 'alicebrown', 'hashed_password_5', NOW(), NULL),
       ('Alice X',  'inactive', 18, 'alicebrown', 'hashed_password_5', NOW(), NULL);

INSERT INTO teacher (name, status, username, password, created_date, updated_date)
VALUES ('Mr. Anderson', 'active', 'mr_anderson', 'hashed_password_6', NOW(), NULL),
       ('Ms. Johnson', 'active', 'ms_johnson', 'hashed_password_7', NOW(), NULL),
       ('Mr. X', 'active', 'ms_x', 'hashed_password_7', NOW(), NULL);

INSERT INTO course (name, description, status, created_date, updated_date, teacher_id)
VALUES ('Introduction to Programming', 'Learn the basics of programming using Java.', 'active', NOW(), NULL, 1),
       ('Web Development Basics', 'An introduction to HTML, CSS, and JavaScript.', 'active', NOW(), NULL, 2),
       ('Data Structures and Algorithms', 'Understand essential data structures and algorithms.', 'inactive', NOW(), null,1),
       ('Kafka', 'kafka', 'inactive', NOW(), NULL, null);

INSERT INTO chapter (name, description, status, `order`, created_date, updated_date, course_id)
VALUES ('Getting Started with Java', 'Introduction to Java programming language.', 'active', 1, NOW(), NULL, 1),
       ('HTML Basics', 'Understanding the structure of a webpage.', 'active', 1, NOW(), NULL, 2),
       ('Sorting Algorithms', 'Learn about different sorting algorithms.', 'inactive', 1, NOW(), NULL, 3);

INSERT INTO lesson (name, description, status, type, url, `order`, created_date, updated_date, chapter_id)
VALUES ('Setting Up Java', 'How to install and configure Java.', 'active', 'video', 'http://example.com/java-setup', 1,
        NOW(), NULL, 1),
       ('Creating Your First HTML Page', 'Step by step guide to create an HTML page.', 'active', 'video',
        'http://example.com/html-first-page', 1, NOW(), NULL, 2),
       ('Bubble Sort', 'Explaining bubble sort algorithm with examples.', 'inactive', 'video',
        'http://example.com/bubble-sort', 1, NOW(), NULL, 3);

INSERT INTO student_course (student_id, course_id, rating, review, status, created_date, updated_date)
VALUES (1, 1, 5, 'Great course! Very informative.', 'active', NOW(), NULL),
       (1, 2, 4, 'Good introduction, but could use more examples.', 'active', NOW(), NULL),
       (2, 1, 3, 'Decent course, but not engaging.', 'active', NOW(), NULL),
       (3, 3, NULL, NULL, 'inactive', NOW(), NULL);

INSERT INTO student_course_lesson (user_course_user_id, user_course_course_id, lesson_id, status, created_date,
                                   updated_date)
VALUES (1, 1, 1, 'completed', NOW(), NULL),
       (1, 1, 2, 'in_progress', NOW(), NULL),
       (2, 1, 1, 'not_started', NOW(), NULL),
       (1, 2, 3, 'completed', NOW(), NULL);


select student_id, student.name, course.name from student join student_course on student.id = student_course.student_id
                                                          join course on student_course.course_id = course.id group by student.name, course.name, student_id;

select course.id, course.name, student_course.rating from course join student_course
                                                                      on course.id = student_course.course_id group by course.id, course.name, student_course.rating
having avg(rating) >= 4;

select course.id, course.name, chapter.id, chapter.name, lesson.id, lesson.name, count(student_course_lesson.status) = 'active' as completed_user, count(student_course_lesson.status) = 'inactive' as in_progress_user
from course join chapter on course.id = chapter.course_id join lesson on chapter.id = lesson.chapter_id  join student_course on course.id = student_course.course_id
            join student_course_lesson on lesson.id = student_course_lesson.lesson_id group by course.id, course.name, chapter.id, chapter.name, lesson.id, lesson.name;

--tìm số môn học mà gvien duoc phan cong
select teacher.id, teacher.name, count(course.id) as course_count
from teacher join course on teacher.id = course.teacher_id
group by teacher.id, teacher.name;

--tìm số môn học mà gvien được phân công (tính từ trang thứ 2)
select teacher.id, teacher.name, count(course.id) as course_count
from teacher left join course on teacher.id = course.teacher_id
group by teacher.id order by teacher.id
    limit 2 offset 2;

--tìm danh sách sinh viên và khóa học đã đăng ký
select student.id, student.name, course.name from student
                                                      join student_course on student.id = student_course.student_id
                                                      join course on student_course.course_id = course.id
order by student.id;

--lấy xếp hạng trung bình của mỗi khóa học có xh trung bình trên 4
select course.id, course.name, avg(student_course.rating) as avg_score
from course join student_course on course.id = student_course.course_id
group by course.id, course.name
having avg_score > 4;

-- lấy danh sách sinh viên, các khóa học họ đã đăng ký và tên của giáo viên khóa học đó
select student.id, student.name, course.name, teacher.name from student
                                                                    join student_course on student.id = student_course.student_id
                                                                    join course on student_course.course_id = course.id
                                                                    join teacher on course.teacher_id = teacher.id
order by student.id;

--lấy danh sách tất cả sinh viên, các khóa học đã đăng ký, danh sách các chapter và trạng thái từng sinh viên
select course.id, course.name, chapter.id, chapter.name, lesson.id, lesson.name,user_course_user_id, chapter.status, student.name as name
from course join chapter on course.id = chapter.course_id
            join lesson on chapter.id = lesson.chapter_id
            join student_course_lesson on lesson.id = student_course_lesson.lesson_id
            join student_course on course.id = student_course.course_id
            join student on student_course.student_id = student.id
