package Areas;

import People.Student;
import People.Teacher;

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */

// A class Floor derived from the abstract class Space
public class Floor extends Space{
    // An array containing the classrooms of the Floor
    private Classroom[] classrooms = new Classroom[6];
     // The corridor of the Floor
    private Corridor corridor;
    // The id number of the floor (no comparisons are performed using the id, so it may not be unique)
    private int id;
    // Constructor
    public Floor(int id_, Corridor corridor_, Classroom[] classrooms_){
        id = id_;
        corridor = corridor_;
        System.arraycopy(classrooms_, 0, classrooms, 0, 6);
        System.out.println("A New Floor has been created!");
    }
    // Overriding methods used by the simulation for the navigation of the students and teachers through the School
    public void enter(Student student_){
        System.out.println(student_.get_name() + " enters floor!");
        this.corridor.enter(student_);
    }
    public void place(Teacher teacher_){
        teacher_.get_classroom().place(teacher_);
    }
    // The amount of hours for which the Floor operates
    public void operate(int hours_){
        // When a Floor operates for an amount of hours, its classrooms operate for the same time
        for(int i = 0; i < 6; i++){
            classrooms[i].operate(hours_);
        }
    }
    // A new print() method, using method overriding
    public void print(){
        System.out.println("=========================");
        System.out.println("Floor number " + id + " contains: ");
        System.out.println("=========================");
        // Print the classrooms of the Floor
        for(int i = 0; i < 6; i++){
            classrooms[i].print();
        }
    }
    // Returns the corridor of the floor
    public Corridor get_corridor(){
        return this.corridor;
    }
    public Student exit(){
        // Remove the first available student from the first available classroom
        for(Classroom classroom: classrooms){
            // If the classroom is not already empty
            if(!classroom.isEmpty()){
                Student student = classroom.exit();
                System.out.println(student.get_name() + " starts exiting!");
                corridor.enter(student);
                corridor.exit(student);
                return student;
            }
        }
        return null;
    }
    public void teachers_out(){
        // Remove every teacher from his classroom
        for(Classroom classroom: classrooms){
            classroom.teacher_out();
        }
    }
}
