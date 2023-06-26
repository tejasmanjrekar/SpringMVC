package todocourse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("foundCourse")
public class SpringMvcController {
	@RequestMapping("/addCourse")
	public String addCourse() {
		return "course";
	}
	
	@RequestMapping(value = "/course", method = RequestMethod.POST)
	public String addingCourse(@RequestParam("id")int id, @RequestParam("title")String title,@RequestParam("duration")int duration,@RequestParam("provider")String provider,@RequestParam("cost")double cost) {
		DaoInterface<Course, Integer> daoInterface = new CourseInMemoryDao();
		Course course = new Course(id,title,duration,provider,cost);
		daoInterface.createNew(course);
		
		return "courseAdded";
	}
	
	@RequestMapping("/searchCourse")
	public String courseSearcher() {
		return "course_searcher";
	}
	
	@RequestMapping(value = "/courseSearcher", method = RequestMethod.POST)
	public String searchCourse(@RequestParam("id")int id, Model dataModel) {
		DaoInterface<Course, Integer> daoInterface = new CourseInMemoryDao();
		Course course;
		course = daoInterface.getOneById(id);
		if(course.equals(null))
			return "courseSearcher";
		dataModel.addAttribute("foundCourse", course);
		return "course_display";
	}
}
