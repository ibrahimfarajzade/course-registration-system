public abstract class CourseFactory {
        public abstract Course createCourse(int id, String name, String type);

        public static CourseFactory createDepartment(String departmentFactory) {
                switch (departmentFactory) {
                        case "EnglishDepartment":
                                return new EnglishFactory();
                        case "MathDepartment":
                                return new MathFactory();
                        default:
                                return null;
                }
        }
}
