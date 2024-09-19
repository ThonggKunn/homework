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
group by course.title, chapter.title, lesson.title


