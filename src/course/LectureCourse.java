public class LectureCourse extends CourseType {

    public LectureCourse(Course course) {
        super(course);
    }

    @Override
    public int getNumCredits() {
        return super.getNumCredits() + this.course.getNumCredits();
    }
}
