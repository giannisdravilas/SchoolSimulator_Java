package Areas;

import People.Student;

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */

// An abstract base class which represents a space
public abstract class Space{
    // Every derived class has its own enter() method, so it is an abstract method
    public abstract void enter(Student student_);
    // Every derived class has its own print() method, so it is an abstract method
    public abstract void print();
}
