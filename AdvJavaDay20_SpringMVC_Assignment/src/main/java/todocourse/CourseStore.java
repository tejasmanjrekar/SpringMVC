package todocourse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import todocourse.Course;
public class CourseStore {
	private static Map<Integer,Course> allCourses = new HashMap<>();
	static {
		Course c1 = new Course(101,"Core Java", 150, "Udemy", 250);
		Course c2 = new Course(102,"OS", 120, "Unacademy", 200);
		Course c3 = new Course(103,"Python", 200, "Udemy", 350);
		Course c4 = new Course(104,"Oracle", 180, "Unacademy", 450);
			allCourses.put(c1.getCourseId(), c1);
			allCourses.put(c2.getCourseId(), c2);
			allCourses.put(c3.getCourseId(), c3);
			allCourses.put(c4.getCourseId(), c4);
	}
	
	public static void createNewCourse(Course course) {
		allCourses.put(course.getCourseId(), course);
	}
	
	public static Collection<Course> getAllCourses() {
		Collection<Course> allAvailableCourses = allCourses.values();
		return allAvailableCourses;
	}
	
	public static Course getCourse(Integer id) {
		Course foundCourse = allCourses.get(id);
		return foundCourse;
	}
	
	public static void updateCourse(Course modifiedCourse) {
		allCourses.put(modifiedCourse.getCourseId(), modifiedCourse);
	}
	
	public static void deleteCourseById(Integer id) {
		allCourses.remove(id);
	}

}
