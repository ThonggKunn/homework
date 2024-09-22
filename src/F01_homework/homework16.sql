#tạo bảng student
create table student (
                         id bigint primary key,
                         name varchar(50) not null ,
                         status varchar(50)
);

#tạo bảng teacher
create table teacher (
                         id bigint primary key ,
                         name varchar(50) not null ,
                         status varchar(50)
);

#tạo bảng course
create table course (
                        id bigint primary key ,
                        description varchar(50),
                        title varchar(50) not null ,
                        status varchar(50)
);

#tạo bảng chapter
create table chapter (
                         id bigint primary key ,
                         description varchar(50),
                         title varchar(50) not null ,
                         status varchar(50),
                         course_id bigint references course(id)
);

#tạo bảng trung gian student_course
create table student_course (
                                student_id bigint not null ,
                                course_id bigint not null ,
                                primary key (student_id,course_id)
);

#tạo bảng trung gian teacher_course
create table teacher_course (
                                teacher_id bigint not null ,
                                course_id bigint not null,
                                primary key (teacher_id,course_id)
);
#tạo bảng lesson
create table lesson (
                        title varchar(50) not null,
                        description varchar(50),
                        chapter_id bigint references chapter(id)
);

#tạo bảng admin
create table admin (
                       id bigint primary key ,
                       name varchar(50) not null ,
                       status varchar(50)
);


# 1.Truy vấn thông tin của sinh viên và số lượng khóa học sinh viên đã đăng ký

select name, count(course_id) as soluong from student  join student_course join course
on student.id = student_course.student_id
and course.id = student_course.course_id
group by name;


# 2.Truy vấn thông tin giáo viên và khóa học giáo viên đã dạy

select teacher.name, course.title as monhoc from teacher join teacher_course join course
on teacher.id = teacher_course.teacher_id
and course.id = teacher_course.course_id
group by teacher.name, course.title;


# 3.Truy vấn các khóa học có số lượng sinh viên đang học trên 10 người

select course.title as khoahoc, count(student_id) as soluong from course join student_course join student
on student_course.student_id = student.id
and course.id = student_course.course_id
group by khoahoc
having soluong > 10;

# 4.Truy vấn toàn bộ thông tin của khóa học bao gồm: Tên khóa học, Tên chương(Chapter), và danh sách chi tiếp các lesson của từng chapter

select course.title,chapter.title, lesson.title from course join chapter join lesson
on course.id = chapter.course_id
and chapter.id = lesson.chapter_id
group by course.title, chapter.title, lesson.title;


    # 5. Tìm tất cả khóa học chưa có sinh viên học hoặc giáo viên nào dạy

select id, title from course
                          left join student_course on course.id = student_course.course_id
                          left join teacher_course on course.id = teacher_course.course_id
where student_course.student_id is null or teacher_course.teacher_id is null;


#6. truy vấn chi tiết khóa học và số lượng chappter và số lượng bài học trong khóa học, và số lượng user đã đăng ký khóa học

select course.id, course.title,
       count(distinct chapter.id) as soluongchuong ,
       count(distinct lesson.title) as soluongbai,
       count(distinct student_course.student_id) as soluonghocvien
from course left join chapter on course.id = chapter.course_id
            left join lesson on chapter.id = lesson.chapter_id
            left join student_course on course.id = student_course.course_id
group by course.id, course.title;

#7. truy vấn thông tin chi tiết về khóa học và chapter và số lượng bài học trong chapter

select course.id, course.title, chapter.id, chapter.title,
       count(distinct lesson.title) as soluongbai
from course left join chapter on course.id = chapter.course_id
            left join lesson on chapter.id = lesson.chapter_id
group by course.id, course.title, chapter.id, chapter.title;


#8. truy vấn thông tin chi tiết về khóa học và chapter và thông tin bài học và số lượng user đã hoàn thành bài học, và số lượng user đang học bài học.

select course.id, course.title, chapter.id, chapter.title, lesson.title,
       count(distinct student.status) as user_dahoanthanh
from course left join chapter  on course.id = chapter.course_id
left join lesson on chapter.id = lesson.chapter_id
left join student_course on course.id = student_course.course_id
left join student on student_course.student_id = student.id
group by course.id, course.title, chapter.id, chapter.title, lesson.title
having user_dahoanthanh = 'on' ;



