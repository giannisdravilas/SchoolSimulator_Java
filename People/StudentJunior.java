package People;

import Areas.Floor;
import Areas.Classroom;

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */

// A class for Junior Students derived from the base class Student
public class StudentJunior extends Student{
    // Constructor
    public StudentJunior(String name_, Floor floor_, Classroom classroom_, int Lindex_){
        super(name_, floor_, classroom_, Lindex_);
    }
}
