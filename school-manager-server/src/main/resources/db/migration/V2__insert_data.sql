INSERT INTO students (student_name, student_phone, student_email)
VALUES ("Alice", "0967656789", "alice@gmail.com"),
       ("Petr", "0945690145", "tom@gmail.com"),
       ("Alex", "0894534890", "alex@gmail.com"),
       ("Sergiy", "0985674884", "serj@gmail.com");

INSERT INTO teachers (teacher_name, teacher_phone, teacher_email)
VALUES ("Kate", "0940000089", "kate@gmail.com"),
       ("Tom", "0942345678", "tom@gmail.com");

INSERT INTO courses(course_name, course_cost)
VALUE ("Java", 10500.80),
      ("Python", 13000.23);

INSERT INTO studygroups(group_name, students, teacher_id, course_id)
VALUE ("JavaPro 08.09", "Petr, Alice", 2, 1),
      ("Python 09.10", "Alex, Sergiy", 1, 2);



