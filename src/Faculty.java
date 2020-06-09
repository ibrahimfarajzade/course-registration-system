import java.util.ArrayList;
import java.util.Iterator;

public class Faculty extends School {
        public ArrayList<School> schoolComponents = new ArrayList<School>();
        public String name;

        public Faculty(ArrayList<School> schoolComponents, String name) {
                this.schoolComponents = schoolComponents;
                this.name = name;
        }

        public void add(School schoolComponent) {
                schoolComponents.add(schoolComponent);
        }

        public void remove(School schoolComponent) {
                schoolComponents.remove(schoolComponent);
        }

        public School getChild(int i) {
                return (School)schoolComponents.get(i);
        }

        public String getName() {
                return name;
        }

        public void print() {
                System.out.println("Faculty Name: " + name);
                for (School school : schoolComponents) //implicit iterator
                        System.out.println("Department Name: " + school.getName());


                //Explicit iterator
                //Iterator iterator = schoolComponents.iterator();
                //while (iterator.next() != null) {
                        //System.out.println("Department Name: " + ((School)iterator).getName());
                //}
        }
}
