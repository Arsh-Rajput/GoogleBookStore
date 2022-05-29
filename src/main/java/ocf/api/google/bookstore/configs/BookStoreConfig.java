package ocf.api.google.bookstore.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BookStoreConfig {

	@Value("${google.bookstore.base.url}")
	private String googleBookStoreBaseUrl;
}
