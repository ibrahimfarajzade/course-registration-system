import java.util.ArrayList;

public class SQLAdapter implements Database {
	SQLDatabase sqlDatabase;
	
	public SQLAdapter(SQLDatabase database) {
		this.sqlDatabase = database;
	}

	@Override
	public void save(String name, ArrayList<Student> students) {
		for (Student student : students)
			sqlDatabase.save(student.name, student);
		
	}

	@Override
	public ArrayList<Student> load(String databaseName) {
		ArrayList<Student> students = new ArrayList<>();
		Student currentStudent;
		while ((currentStudent = (Student)sqlDatabase.retrieve(databaseName)) != null)
			students.add(currentStudent);
		return students;
	}
}
