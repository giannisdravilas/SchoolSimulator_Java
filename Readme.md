# SchoolSimulator in Java
📚🧑‍🎓👨‍🏫 A simple school simulator in Java, in which students arrive at a school, which operates for some hours and is evacuated afterwards. The fatigue of the students and the teachers is also computed.

### General description

A school consists of three floors, a yard and a staircase. Every floor consists of six classrooms and a corridor. Every classroom contains a maximum of Cclass students and a teacher.
Every student is classified either as a junior or a senior one.
Every student and teacher has a fatigue meter (Lj for junior students, Ls for senior students, Lt for teachers).
For every hour a student attends a lesson or a teacher teaches a lesson, the fatigue meter is increased by Lj, Ls or Lt correspondingly.
Finally, the students and teachers evacuate the school by exiting it.

In a `main()` function, a school and some students and teachers are created. Then the students the teachers enter at it in a random order and the school operates for N hours. Finally, the school life is printed and then the school is evacuated.

Compile with:<br/>
`javac Areas/Classroom.java`<br/>
`javac Areas/Corridor.java`<br/>
`javac Areas/Floor.java`<br/>
`javac Areas/School.java`<br/>
`javac Areas/Space.java`<br/>
`javac Areas/Stairs.java`<br/>
`javac Areas/Yard.java`<br/>
`javac People/Person.java`<br/>
`javac People/Student.java`<br/>
`javac People/StudentJunior.java`<br/>
`javac People/StudentSenior.java`<br/>
`javac People/Teacher.java`<br/>
`javac Main.java`<br/>
Execute `java Main Cclass Lj Ls Lt N`, where Cclass is the maximum number of students in each classroom, Lj, Ls and Lt are the fatigue meters according to which the fatigue of the junior and senior students and teachers are increased, and N are the hours for which the school operates. E.g. `java Main 10 1 2 3 10`.
