public class Rector implements Observer {
        public int id;
        public String name;
        public School school;

        private static Rector instance = null;

        private Rector(int id, String name) {
                this.id = id;
                this.name = name;
        }

        public static Rector getInstance(int id, String name) { //synchronized for multithreading
                //lazy instantiation
                if (instance == null)
                        instance = new Rector(id, name);

                return instance;
        }

        @Override
        public void update(int numOfStudents) {
                System.out.println(name +  ": Number of students has changed! New number: " + numOfStudents);
        }
}
