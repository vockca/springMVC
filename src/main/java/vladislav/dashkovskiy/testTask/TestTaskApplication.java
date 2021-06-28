package vladislav.dashkovskiy.testTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestTaskApplication {
	public static final String JSON = "application/json";

	public static final int WORKER_AGE = 25;

	public static void main(String[] args) {
		SpringApplication.run(TestTaskApplication.class, args);
	}
}
