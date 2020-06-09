public class Instructor implements Observer {
        public int id;
        public String name;
        public Department department;

        public Instructor(int id, String name, Department department) {
                this.id = id;
                this.name = name;
                this.department = department;
        }

        @Override
        public void update(int numOfStudents) {
                System.out.println(name + ": Number of students has changed! New number: " + numOfStudents);
        }
}
