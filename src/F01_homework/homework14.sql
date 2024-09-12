create table Student (
                         name varchar(50) not null primary key,
                         age int not null,
                         class varchar(20) not null ,
                         address varchar(50) not null,
                         math_score varchar(10) not null,
                         literature_score varchar(10) not null ,
                         english_score varchar(10) not null ,
                         total_score varchar(10) not null
);

insert into Student (name, age, class, address, math_score, literature_score, english_score, total_score) values
('Nguyen Van A',12,'A','Ha Noi','9','8','7','5'),
('Le Van B',12,'A','Ha Noi','9','4','3','5'),
('Nguyen Van C',12,'B','Ha Noi','9','5','4','3'),
('Nguyen Van D',12,'B','Ha Noi','9','6','5','4'),
('Nguyen Van E',12,'C','Ha Noi','9','5','7','2'),
('Nguyen Van F',12,'C','Ha Noi','9','4','5','5'),
('Nguyen Van G',12,'D','Ha Noi','9','8','2','6'),
('Nguyen Van H',12,'D','Ha Noi','9','5','5','4'),
('Nguyen Van L',12,'E','Ha Noi','9','9','10','9'),
('Nguyen Van K',12,'E','Ha Noi','9','7','8','8'),
('Andrew L',12,'F','Ha Noi','8','5','10','7'),
('Ben H',12,'F','Ha Noi','7','9','6','9');


select * from Student;

select distinct class from Student;

select count(name) as number_of_student from Student;

select name, class, math_score+literature_score+english_score as Score
from Student;

select name, class, (math_score+literature_score+english_score)/3 as avarage_score
from Student;

select class, max(english_score),max(math_score),max(literature_score)
from Student group by class;

select class, min(english_score),min(math_score),min(literature_score)
from Student group by class;

select * from Student where name like 'A%';

select name, math_score from Student where math_score in ('9','10');

select distinct class, name, total_score from student
order by total_score desc;

select name, class,total_score from student
order by total_score desc
    limit 5;


select name from student where literature_score >= 8 and english_score < 6;

select name from student where math_score < 5 and total_score < 10;

update student
set class = 'A1' where total_score > 5 and literature_score > 0
                   and math_score > 0 and english_score > 0;

