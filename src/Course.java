
public class Course {

    String name;

    String id;

    int credits;

    public Course(String name, String id, int credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;
    } // Course
    
    @Override
    public String toString() {
        return "Course: {" + "Name='" + name + '\'' + ", id='" + id + '\'' + ", Credits=" + credits + '}';
    } // toString
} // class Course