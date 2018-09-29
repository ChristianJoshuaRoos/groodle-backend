CREATE TABLE COURSE (
	course_id BIGINT not null,
	course_name varchar(255) not null,
    credit_hours INT not null,
    course_description varchar(1000) not null,
    speciality varchar(30) not null,
);

insert into COURSE (course_id, course_name, credit_hours, course_description, speciality) values (6363, 'Agile Software Engineering', 3,
'Students will learn and exercise with various agile techniques and best practices adopted in the software industry. Topics include (but are not limited to) prototyping, scrum, version control, continuous integration, test driven development, feature-driven development, lean development, project estimation, evaluation, and iterative development', 
'Software Systems');

