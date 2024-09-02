public class LabCourse extends CourseType {

    public LabCourse(Course course) {
        super(course);
    }

    @Override
    public int getNumCredits() {
        return super.getNumCredits() + this.course.getNumCredits();
    }
}
