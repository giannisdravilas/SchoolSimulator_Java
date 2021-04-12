package People;

import Areas.Floor;
import Areas.Classroom;

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */

// A class for Senior Students derived from the base class Student
public class StudentSenior extends Student{
    // Constructor
    public StudentSenior(String name_, Floor floor_, Classroom classroom_, int Lindex_){
        super(name_, floor_, classroom_, Lindex_);
    }
}
