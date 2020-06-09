import java.util.ArrayList;

public class Department extends School {
        public String name;
        public ArrayList<Course> courses = new ArrayList<>();
        public ArrayList<Instructor> instructors = new ArrayList<>();

        public Department(String name, ArrayList<Course> courses) {
                this.name = name;
                this.courses = courses;
        }

        public String getName() {
                return name;
        }

        public ArrayList<Course> getCourse() {
                return courses;
        }

        public void print() {
                System.out.println(" " + getName());
                System.out.println(" " + getCourse());
        }
}
