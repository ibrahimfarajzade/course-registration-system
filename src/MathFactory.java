public class MathFactory extends CourseFactory {

    @Override
    public MathCourse createCourse(int id, String name, String type) {
    	switch (type) {
    	case "undergraduate":
    		return new UndergradMath(id, name, "major", null);
    	case "graduate":
    		return new GradMath(id, name, "major", null);
    	default:
    		return null;	
    	}
    }
}
