package ocf.api.google.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "ocf.api.*")

@EnableAspectJAutoProxy
public class BookstoreMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreMainApplication.class, args);
	}
}
