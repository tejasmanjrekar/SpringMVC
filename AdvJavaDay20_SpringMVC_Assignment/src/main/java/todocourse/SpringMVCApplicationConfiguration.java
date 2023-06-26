package todocourse;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringMVCApplicationConfiguration implements WebApplicationInitializer{


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.setConfigLocation("management");
		DispatcherServlet frontController = new DispatcherServlet(ctx);
		
		ServletRegistration.Dynamic registration = servletContext.addServlet("frontControllerServlet", frontController);
		registration.addMapping("/");
	}
	
}
