package People;

import Areas.Floor;
import Areas.Classroom;

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */

// A class Teacher derived from the base class Person
public class Teacher extends Person{
    // Constructor
    public Teacher(String name_, Floor floor_, Classroom classroom_, int Lindex_){
        super(name_, floor_, classroom_, Lindex_);
        // Also change the teacher of the classroom to which this teacher belongs
        classroom_.set_teacher(this);
        System.out.println("A New Teacher has been created! " + name_ + ", Classroom id is " + classroom_.get_id());
    }
    // A Teacher teaches for an amount of hours
    public void teach(int hours_){
        tired += Lindex * hours_;
    }
}
