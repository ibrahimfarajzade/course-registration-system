public class Dean implements Observer {
    public int id;
    public String name;
    public School department;

    public Dean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void update(int numOfStudents) {
        System.out.println(name + ": Number of students has changed! New number: " + numOfStudents);
    }
}
