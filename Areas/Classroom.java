package Areas;
import People.Student;
import People.Teacher;
import java.util.ArrayList;

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */

// A class Classroom derived from the abstract class Space
public class Classroom extends Space{
    // The teacher of the classroom
    private Teacher teacher;
    // The id number of the classroom (no comparisons are performed using the id, so it may not be unique)
    private int id;
    // Constructor
    public Classroom(int id_){
        id = id_;
        System.out.println("A New Classroom has been created!");
    }
    // Returns the id of the Classroom
    public int get_id(){
        return id;
    }
    // Sets a teacher for the Classroom
    public void set_teacher(Teacher teacher_){
        teacher = teacher_;
    }
    // An ArrayList containing the students of the Classroom
    private ArrayList<Student> students = new ArrayList<Student>();
    public boolean isEmpty(){
        return (students.isEmpty());
    }
    // Overriding methods used by the simulation for the navigation of the students and teachers through the School
    public void enter(Student student_){
        System.out.println(student_.get_name() + " enters classroom!");
        // Add this student to the ArrayList of students of this classroom
        this.students.add(student_);
        student_.set_is_in_classroom(true);
    }
    public void place(Teacher teacher_){
        teacher_.set_is_in_classroom(true);
    }
    // The amount of hours for which the Classroom operates
    public void operate(int hours_){
        // When a Classroom operates for an amount of hours, its students attend classes for the same time
        for(Student student : students){
            student.attend(hours_);
        }
        // The teacher teaches for the same time
        teacher.teach(hours_);
    }
    // A new print() method, using method overriding
    public void print(){
        System.out.println("People in class " + id + " are: ");
        // ArrayList iteration to print each student of it
        for(Student student : students){
            student.print();
        }
        System.out.print("The teacher is: ");
        // The teacher may be null if the school has been evacuated
        if(teacher != null){
            teacher.print();
        }else{
            System.out.print("\n");
        }
    }
    public Student exit(){
        // If there are students in the classroom
        if(!students.isEmpty()){
            // Remove the first one in the ArrayList of students
            Student removed = students.remove(0);
            System.out.println(removed.get_name() + " exits classroom!");
            removed.set_is_in_classroom(false);
            return removed;
        }
        return null;
    }
    public Teacher teacher_out(){
        // If the teacher has not yet been removed
        if(teacher != null){
            teacher.set_is_in_classroom(false);
            System.out.println(teacher.get_name() + " teacher is out!");
            Teacher removed = teacher;
            // The current teacher of the class in now null
            teacher = null;
            return removed;
        }
        return null;
    }
}
