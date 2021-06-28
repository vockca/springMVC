package vladislav.dashkovskiy.testTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vladislav.dashkovskiy.testTask.configuration.MyApplicationContextConfiguration;

@SpringBootApplication
public class TestTaskApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
		SpringApplication.run(TestTaskApplication.class, args);
		System.out.println("1");
	}

}
