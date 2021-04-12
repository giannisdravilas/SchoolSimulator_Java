import Areas.*;
import People.*;
import java.util.Random; 

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */
public class Main {
    public static void main(String[] args){
        // Initialize the parameters of the simulation according to the command line arguments
        // given by the user
        int Cclass = Integer.parseInt(args[0]);
        int Lj = Integer.parseInt(args[1]);
        int Ls = Integer.parseInt(args[2]);
        int Lt = Integer.parseInt(args[3]);
        int N = Integer.parseInt(args[4]);

//        int Cclass = 10;
//        int Lj = 1;
//        int Ls = 2;
//        int Lt = 3;
//        int N = 10;
        
        // Create a yard and a stairs
        Yard yard = new Yard();
        Stairs stairs = new Stairs();
        
        // Create a corridor and six classrooms, insert the classrooms in an array and create a floor with them
        // Repeat for three floors     
        Corridor corridor1 = new Corridor();
        Classroom classroom1_1 = new Classroom(1);
        Classroom classroom1_2 = new Classroom(2);
        Classroom classroom1_3 = new Classroom(3);
        Classroom classroom1_4 = new Classroom(4);
        Classroom classroom1_5 = new Classroom(5);
        Classroom classroom1_6 = new Classroom(6);
        Classroom[] classrooms1 = new Classroom[6];
        classrooms1[0] = classroom1_1;
        classrooms1[1] = classroom1_2;
        classrooms1[2] = classroom1_3;
        classrooms1[3] = classroom1_4;
        classrooms1[4] = classroom1_5;
        classrooms1[5] = classroom1_6;
        Floor floor1 = new Floor(1, corridor1, classrooms1);
        
        Corridor corridor2 = new Corridor();
        Classroom classroom2_1 = new Classroom(1);
        Classroom classroom2_2 = new Classroom(2);
        Classroom classroom2_3 = new Classroom(3);
        Classroom classroom2_4 = new Classroom(4);
        Classroom classroom2_5 = new Classroom(5);
        Classroom classroom2_6 = new Classroom(6);
        Classroom[] classrooms2 = new Classroom[6];
        classrooms2[0] = classroom2_1;
        classrooms2[1] = classroom2_2;
        classrooms2[2] = classroom2_3;
        classrooms2[3] = classroom2_4;
        classrooms2[4] = classroom2_5;
        classrooms2[5] = classroom2_6;
        Floor floor2 = new Floor(2, corridor2, classrooms2);
        
        Corridor corridor3 = new Corridor();
        Classroom classroom3_1 = new Classroom(1);
        Classroom classroom3_2 = new Classroom(2);
        Classroom classroom3_3 = new Classroom(3);
        Classroom classroom3_4 = new Classroom(4);
        Classroom classroom3_5 = new Classroom(5);
        Classroom classroom3_6 = new Classroom(6);
        Classroom[] classrooms3 = new Classroom[6];
        classrooms3[0] = classroom3_1;
        classrooms3[1] = classroom3_2;
        classrooms3[2] = classroom3_3;
        classrooms3[3] = classroom3_4;
        classrooms3[4] = classroom3_5;
        classrooms3[5] = classroom3_6;
        Floor floor3 = new Floor(3, corridor3, classrooms3);
        
        // Create an array with these three floors
        Floor[] floors = new Floor[3];
        floors[0] = floor1;
        floors[1] = floor2;
        floors[2] = floor3;
        
        // Create the school, using the yard, the stairs and the array with the floors
        School school = new School(yard, stairs, floors);
        
        // Create 36 students (assume two for each classroom, just for testing purposes),
        // and access them through an array of students
        Student[] students = new Student[36];
        
        // Students of the first floor
        students[0] = new StudentJunior("student0", floor1, classroom1_1, Lj);
        students[1] = new StudentJunior("student1", floor1, classroom1_1, Lj);
        students[2] = new StudentJunior("student2", floor1, classroom1_2, Lj);
        students[3] = new StudentJunior("student3", floor1, classroom1_2, Lj);
        students[4] = new StudentJunior("student4", floor1, classroom1_3, Lj);
        students[5] = new StudentJunior("student5", floor1, classroom1_3, Lj);
        students[6] = new StudentSenior("student6", floor1, classroom1_4, Ls);
        students[7] = new StudentSenior("student7", floor1, classroom1_4, Ls);
        students[8] = new StudentSenior("student8", floor1, classroom1_5, Ls);
        students[9] = new StudentSenior("student9", floor1, classroom1_5, Ls);
        students[10] = new StudentSenior("student10", floor1, classroom1_6, Ls);
        students[11] = new StudentSenior("student11", floor1, classroom1_6, Ls);

        // Students of the second floor
        students[12] = new StudentJunior("student12", floor2, classroom2_1, Lj);
        students[13] = new StudentJunior("student13", floor2, classroom2_1, Lj);
        students[14] = new StudentJunior("student14", floor2, classroom2_2, Lj);
        students[15] = new StudentJunior("student15", floor2, classroom2_2, Lj);
        students[16] = new StudentJunior("student16", floor2, classroom2_3, Lj);
        students[17] = new StudentJunior("student17", floor2, classroom2_3, Lj);
        students[18] = new StudentSenior("student18", floor2, classroom2_4, Ls);
        students[19] = new StudentSenior("student19", floor2, classroom2_4, Ls);
        students[20] = new StudentSenior("student20", floor2, classroom2_5, Ls);
        students[21] = new StudentSenior("student21", floor2, classroom2_5, Ls);
        students[22] = new StudentSenior("student22", floor2, classroom2_6, Ls);
        students[23] = new StudentSenior("student23", floor2, classroom2_6, Ls);

        // Students of the third floor
        students[24] = new StudentJunior("student24", floor3, classroom3_1, Lj);
        students[25] = new StudentJunior("student25", floor3, classroom3_1, Lj);
        students[26] = new StudentJunior("student26", floor3, classroom3_2, Lj);
        students[27] = new StudentJunior("student27", floor3, classroom3_2, Lj);
        students[28] = new StudentJunior("student28", floor3, classroom3_3, Lj);
        students[29] = new StudentJunior("student29", floor3, classroom3_3, Lj);
        students[30] = new StudentSenior("student30", floor3, classroom3_4, Ls);
        students[31] = new StudentSenior("student31", floor3, classroom3_4, Ls);
        students[32] = new StudentSenior("student32", floor3, classroom3_5, Ls);
        students[33] = new StudentSenior("student33", floor3, classroom3_5, Ls);
        students[34] = new StudentSenior("student34", floor3, classroom3_6, Ls);
        students[35] = new StudentSenior("student35", floor3, classroom3_6, Ls);
        
        // Create 18 teachers (one for each classroom) and access them through an array of teachers
        Teacher[] teachers = new Teacher[18];
        
        teachers[0] = new Teacher("teacher0", floor1, classroom1_1, Lt);
        teachers[1] = new Teacher("teacher1", floor1, classroom1_2, Lt);
        teachers[2] = new Teacher("teacher2", floor1, classroom1_3, Lt);
        teachers[3] = new Teacher("teacher3", floor1, classroom1_4, Lt);
        teachers[4] = new Teacher("teacher4", floor1, classroom1_5, Lt);
        teachers[5] = new Teacher("teacher5", floor1, classroom1_6, Lt);
        teachers[6] = new Teacher("teacher6", floor2, classroom2_1, Lt);
        teachers[7] = new Teacher("teacher7", floor2, classroom2_2, Lt);
        teachers[8] = new Teacher("teacher8", floor2, classroom2_3, Lt);
        teachers[9] = new Teacher("teacher9", floor2, classroom2_4, Lt);
        teachers[10] = new Teacher("teacher10", floor2, classroom2_5, Lt);
        teachers[11] = new Teacher("teacher11", floor2, classroom2_6, Lt);
        teachers[12] = new Teacher("teacher12", floor3, classroom3_1, Lt);
        teachers[13] = new Teacher("teacher13", floor3, classroom3_2, Lt);
        teachers[14] = new Teacher("teacher14", floor3, classroom3_3, Lt);
        teachers[15] = new Teacher("teacher15", floor3, classroom3_4, Lt);
        teachers[16] = new Teacher("teacher16", floor3, classroom3_5, Lt);
        teachers[17] = new Teacher("teacher17", floor3, classroom3_6, Lt);
        
        Random rand = new Random();
        
        // Insert each student at a random order to the school building, until all 36 students are inside
        int counter = 0;
        while(counter != 36){
            int index = rand.nextInt(36);
            if(!students[index].is_inside_school()){
                school.enter(students[index]);
                counter++;
            }
        }

        // Place each teacher at a random order to the school building, until all 18 teachers are inside
        counter = 0;
        while(counter != 18){
            int index = rand.nextInt(18);
            if(!teachers[index].is_inside_school()){
                school.place(teachers[index]);
                counter++;
            }
        }
        
        // Operate the school building for N hours
        school.operate(N);
        
        // Print school life
        school.print();
        
        System.out.println("=========================");
        System.out.println("\nEVACUATION\n");
        System.out.println("=========================");
        // Evacuate the school
        school.empty();
        
        // Print school life
        school.print();
    }
}
