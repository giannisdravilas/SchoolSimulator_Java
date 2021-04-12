package Areas;

import People.Student;
import People.Teacher;

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */

// A class School derived from the abstract class Space
public class School extends Space{
    // The yard, the stairs and the floors of the School
    private Yard yard;
    private Stairs stairs;
    private Floor[] floors = new Floor[3];
    // Constructor
    public School(Yard yard_, Stairs stairs_, Floor[] floors_){
        yard = yard_;
        stairs = stairs_;
        floors[0] = floors_[0];
        floors[1] = floors_[1];
        floors[2] = floors_[2];
        System.out.println("A New School has been created!");
    }
    // The only navigation methods used by the user // Overriding
    public void enter(Student student_){
        System.out.println(student_.get_name() + " enters school!");
        // Do the rest for the navigation of the student through the school
        yard.enter(student_);
        yard.exit(student_);
        stairs.enter(student_);
        stairs.exit(student_);
        student_.get_floor().enter(student_);
        student_.get_floor().get_corridor().exit(student_);
        student_.get_classroom().enter(student_);
    }
    public void place(Teacher teacher_){
        // Do the rest for the navigation of the teacher through the school
        teacher_.get_floor().place(teacher_);
    }
    // The amount of hours for which the School operates
    public void operate(int hours_){
        // When a School operates for an amount of hours, its floors operate for the same time
        floors[0].operate(hours_);
        floors[1].operate(hours_);
        floors[2].operate(hours_);
    }
    // A new print() method, using method overriding
    public void print(){
        System.out.println("\n\nSchool life consists of: ");
        // Print the floors of the School
        floors[0].print();
        floors[1].print();
        floors[2].print();
    }
    // Evacuates the school
    public void empty(){
        // For every floor
        for(Floor floor: floors){
            while(true){
                // Try to remove a student
                Student student = floor.exit();
                // If a student is removed
                if(student != null){
                    stairs.enter(student);
                    stairs.exit(student);
                    yard.enter(student);
                    yard.exit(student);
                }else{
                    break;
                }
            }
        }
        // Remove all teachers
        for(Floor floor: floors){
            floor.teachers_out();
        }
    }
}