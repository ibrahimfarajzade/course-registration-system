import java.util.ArrayList;

public interface Database {
	
	public abstract void save(String name, ArrayList<Student> students);
	public abstract ArrayList<Student> load(String name);

}
