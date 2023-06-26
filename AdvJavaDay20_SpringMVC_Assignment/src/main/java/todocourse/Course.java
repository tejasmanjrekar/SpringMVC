package todocourse;
import java.util.Objects;
import java.util.Scanner;

public class Course {
	private int courseId;
	private String title;
	private int duration;
	private String provider;
	private double cost;
	
	
	public Course() {
	
		
	}
	public Course(int courseId, String title, int duration, String provider, double cost) {
		super();
		this.courseId=courseId;
		this.title = title;
		this.duration = duration;
		this.provider = provider;
		this.cost = cost;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	@Override
	public String toString() {
		return "Course [cId=" + courseId + ", title=" + title + ", duration=" + duration + ", provider=" + provider
				+ ", cost=" + cost + "]";
	}
	public void acceptDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course details");
		System.out.println("Enter Course Title = ");
		title = sc.nextLine();
		System.out.println("Enter Course Duration = ");
		duration = sc.nextInt();
		System.out.println("Enter Course Providers Name = ");
		provider = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Course Cost = ");
		cost = sc.nextInt();
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, courseId, duration, provider, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && courseId == other.courseId
				&& duration == other.duration && Objects.equals(provider, other.provider)
				&& Objects.equals(title, other.title);
	}
	
	
}
