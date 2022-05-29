package ocf.api.google.bookstore.models.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class BookStoreRequest {
	private String bookId;
	

}
