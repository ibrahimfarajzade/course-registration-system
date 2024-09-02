import java.util.ArrayList;

public class Starter extends Course {

    public Starter(int id, String courseName, String courseType, ArrayList<Student> students) {
        super(id, courseName, courseType, students);
        this.numCredit = 1;
    }
}
