CREATE TABLE student (student_id INTEGER PRIMARY KEY,
    roll_number VARCHAR(50) NOT NULL UNIQUE,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50),
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) ,
    photograph_path VARCHAR(50),
    cgpa INTEGER,
    total_credits INTEGER,
    gradaution_year INTEGER);

CREATE TABLE courses (course_id INTEGER PRIMARY KEY,
    course_code VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(50),
    year INTEGER NOT NULL,
    term INTEGER NOT NULL,
    faculty VARCHAR(50) NOT NULL,
    credits INTEGER,
    capacity INTEGER);

CREATE TABLE course_prerequisite (Id SERIAL PRIMARY KEY,
    course_id INTEGER ,
    prerequisite INTEGER,
    description VARCHAR(50),
    FOREIGN KEY (courseId) REFERENCES courses (courseId),
    FOREIGN KEY (prerequisite) REFERENCES courses (courseId));

CREATE TABLE student_courses (Id SERIAL PRIMARY KEY,
    course_id INTEGER NOT NULL,
    student_id INTEGER NOT NULL,
    grade_id VARCHAR(10),
    comments VARCHAR(50),
    FOREIGN KEY (courseId) REFERENCES courses (courseId),
    FOREIGN KEY (student_id) REFERENCES student (student_id));