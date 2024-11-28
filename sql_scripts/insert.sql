INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(101,'CS101','ML','Study of patterns',1,1,'Raghuram Sir',4,150);

INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(102,'CS102','SS','Full Stack',1,1,'RC Sir',4,150);

INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(103,'CS103','MML','Maths',1,1,'Suchit Sir',4,150);

INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(104,'CS104','Algo','Algorithms',1,1,'Murali Sir',4,150);

INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(105,'CS105','Concrete Maths','Recurrence Relations',1,1,'Vivek Sir',4,150);

INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(106,'CS106','PA','Study of programming',1,1,'Suchit Sir',4,150);

INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(107,'CS107','HAD','Full Stack',1,2,'Sumanth Sir',4,150);

INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(108,'CS108','RL','Study of RL',1,2,'Raghuram Sir',4,150);

INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(109,'CS109','RS','Study of RS',1,2,'Raghuram Sir',4,150);

INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(110,'CS110','FSL','Less Data',1,2,'Op Sir',4,150);

INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(111,'CS111','NLP','Study of speeach',1,2,'RC Sir',4,150);



INSERT INTO courses (course_id,course_code,name,description,year,term,faculty,credits,capacity)
VALUES 
(112,'CS112','VR','Study of Visuals',1,2,'Vishwanath Sir',4,150);

INSERT INTO course_prerequisite (Id,course_id,prerequisite,description)
VALUES 
(1,108,101,'Study of RL');

INSERT INTO course_prerequisite (Id,course_id,prerequisite,description)
VALUES 
(2,109,101,'Study of RS');

INSERT INTO course_prerequisite (Id,course_id,prerequisite,description)
VALUES 
(3,111,101,'Study of speach');


INSERT INTO course_prerequisite (Id,course_id,prerequisite,description)
VALUES 
(4,109,108,'RS depend on RL');


INSERT INTO student_courses (Id,course_id,student_id,grade_id,comments)
VALUES 
(1,101,1,1,'ML');

INSERT INTO student_courses (Id,course_id,student_id,grade_id,comments)
VALUES
(2,102,1,1,'SS');

INSERT INTO student_courses (Id,course_id,student_id,grade_id,comments)
VALUES
(3,103,1,1,'MML');

INSERT INTO student_courses (Id,course_id,student_id,grade_id,comments)
VALUES
(4,104,1,1,'Algo');