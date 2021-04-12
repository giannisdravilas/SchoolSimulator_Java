package People;

import Areas.Floor;
import Areas.Classroom;

/**
 *
 * @author Ioannis Dravilas, sdi1900053
 */

// A base class which represents a person in the school
public abstract class Person{
    protected String name;
    // The floor to which this person belongs
    private Floor floor;
    // The classroom to which this person belongs
    protected Classroom classroom;  
    // A counter for how much tired this person is
    protected int tired;
    // The tiring rate of the person
    protected int Lindex;
    protected boolean is_in_classroom;
    // Constructor
    public Person(String name_, Floor floor_, Classroom classroom_, int Lindex_){
        name = name_;
        floor = floor_;
        classroom = classroom_;
        Lindex = Lindex_;
        is_in_classroom = false;
        tired = 0;
    }
    // Returns the name of this person
    public String get_name(){
        return name;
    }
    public void print(){
        System.out.println(name + ", " + tired);
    }
    public boolean is_inside_school(){
        return is_in_classroom;
    }
    // Set whether this person is in classroom or not
    public void set_is_in_classroom(boolean value_){
        is_in_classroom = value_;
    }
    // Return the floor and the classroom to which this person belongs
    public Floor get_floor(){
        return this.floor;
    }
    public Classroom get_classroom(){
        return this.classroom;
    }
}