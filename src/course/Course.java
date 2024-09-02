import java.util.ArrayList;

public abstract class Course implements Observable {
        public int id;
        public String courseName;
        public String courseType;
        public ArrayList<Student> students = new ArrayList<Student>();
        public ArrayList<Observer> observers = new ArrayList<>();
        public int numCredit;
        public Database studentDatabase;
        public int currentQuota = 0;
        public int maxQuota = 50;

        public Course() {
                studentDatabase = null;
        }

        public Course(int id, String courseName, String courseType, ArrayList<Student> students) {
                this.id = id;
                this.courseName = courseName;
                this.courseType = courseType;
                if (students != null) this.students = students;
        }

        public void addStudent(Student s) {
                if (currentQuota < maxQuota)
                        students.add(s);
                ++currentQuota;
                notifyObservers();
        }

        public boolean removeStudent(int id) {
                for (Student i : students)
                        if (i.id == id) {
                                students.remove(i);
                                --currentQuota;
                                notifyObservers();
                                return true;
                        }

                return false;
        }

        public int getNumCredits() {
                return numCredit;
        }

        public void LoadStudentsFromDatabase(String databaseName) {
                this.students = studentDatabase.load(databaseName);
        }

        public void SaveStudentsToDatabase(String databaseName) {
                studentDatabase.save(databaseName, this.students);
        }

        public int GetRemainingQuota() {
                return maxQuota - currentQuota;
        }

        @Override
        public void registerObserver(Observer o) {
                observers.add(o);
        }

        @Override
        public void removeObserver(Observer o) {
                int i = observers.indexOf(o);
                if (i >= 0)
                        observers.remove(i);
        }

        @Override
        public void notifyObservers() {
                for (int i = 0; i < observers.size(); i++) {
                        Observer observer = (Observer) observers.get(i);
                        observer.update(students.size());
                }
        }
}
