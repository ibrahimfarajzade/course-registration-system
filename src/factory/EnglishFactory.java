public class EnglishFactory extends CourseFactory {

    @Override
    public EnglishCourse createCourse(int id, String name, String type) {
    	switch (type) {
    	case "undergraduate":
    		return new UndergradEnglish(id, name, "major", null);
    	case "graduate":
    		return new GradEnglish(id, name, "major", null);
    	default:
    		return null;
    	}
    }
}
