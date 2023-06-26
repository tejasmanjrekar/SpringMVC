package todocourse;
import java.util.Collection;
public class CourseInMemoryDao implements DaoInterface<Course,Integer>{
	@Override
	public void createNew(Course course) {
		CourseStore.createNewCourse(course);
	}

	@Override
	public Collection<Course> getAll() {
		Collection<Course> allCourses = CourseStore.getAllCourses();
		return allCourses;
	}

	@Override
	public Course getOneById(Integer courseId) {
		Course course = CourseStore.getCourse(courseId);
		return course;
	}

	@Override
	public void update(Course modifiedCourse) {
		CourseStore.updateCourse(modifiedCourse);
	}

	@Override
	public void deleteById(Integer courseId) {
		CourseStore.deleteCourseById(courseId);
	}

}
