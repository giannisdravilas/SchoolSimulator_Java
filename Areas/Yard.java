package Areas;

import People.Student;

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */

// A class Yard derived from the abstract class Space
public class Yard extends Space{
    // Empty print() method for the derived class of the abstract class Space
    // Print() at the abstract class is an abstract method
    public void print(){}
    // Constructor
    public Yard(){
        System.out.println("A New Yard has been created!");
    }
    // Overriding methods used by the simulation for the navigation of the students through the School
    public void enter(Student student_){
        System.out.println(student_.get_name() + " enters schoolyard!");
    }
    public Student exit(Student student_){
        System.out.println(student_.get_name() + " exits schoolyard!");
        return student_;
    }
}
