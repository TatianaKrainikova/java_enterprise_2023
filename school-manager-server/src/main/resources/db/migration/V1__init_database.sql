create table students (
   student_id integer not null auto_increment,
   student_name varchar(255),
   student_phone varchar(255),
   student_email varchar(255),
   primary key (student_id)
   ) engine=InnoDB;

create table teachers (
   teacher_id integer not null auto_increment,
   teacher_name varchar(255),
   teacher_phone varchar(255),
   teacher_email varchar(255),
   primary key (teacher_id)
   ) engine=InnoDB;

create table courses (
   course_id integer not null auto_increment,
   course_name varchar(255),
   course_cost integer,
   primary key (course_id)
   ) engine=InnoDB;

create table studygroups (
   group_id integer not null auto_increment,
   group_name varchar(255),
   students varchar(255),
   teacher_id integer,
   course_id integer,
   primary key (group_id)
   ) engine=InnoDB;

create table students_groups_table(
   student_id integer not null,
   group_id integer not null,
   primary key(student_id, group_id)
   ) engine=InnoDB;

create table groups_seq (
       next_val bigint
    ) engine=InnoDB;

insert into groups_seq values ( 1 );

alter table students_groups_table
add constraint
foreign key (student_id)
references students (student_id);

alter table students_groups_table
add constraint
foreign key (group_id)
references studygroups (group_id);

