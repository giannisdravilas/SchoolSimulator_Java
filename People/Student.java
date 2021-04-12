package People;

import Areas.Floor;
import Areas.Classroom;

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */

// A class Student derived from the base class Person
public class Student extends Person{
    // Constructor
    public Student(String name_, Floor floor_, Classroom classroom_, int Lindex_){
        super(name_, floor_, classroom_, Lindex_);
        System.out.println("A New Student has been created! " + name + ", Classroom id is " + classroom.get_id());
    }
    // A Student attends classes for an amount of hours
    public void attend(int hours_){
        tired += Lindex * hours_;
    }
}