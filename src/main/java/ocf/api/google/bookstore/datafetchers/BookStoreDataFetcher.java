package ocf.api.google.bookstore.datafetchers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.DgsTypeResolver;

import ocf.api.core.graphql.models.DGSQuery;
import ocf.api.google.bookstore.models.request.BookStoreRequest;
import ocf.api.google.bookstore.models.response.BookStoreResponse;

@DgsComponent
public class BookStoreDataFetcher implements DGSQuery {

	@Autowired
	private ObjectMapper objectMapper;

	@DgsTypeResolver(name = "BookStoreResponse")
	public String getBookStoreResponse(BookStoreResponse bookStoreResponse) {
		return "BookStoreResponse";
	}

	@DgsQuery(field = "bookStore")
	public BookStoreResponse getBooks(DgsDataFetchingEnvironment environment) {
		Map<String, Object> data = environment.getVariables();
		BookStoreRequest request = objectMapper.convertValue(data.get("bookStoreRequest"), BookStoreRequest.class);
		BookStoreResponse response = new BookStoreResponse();
		response.setDetails("This is very first book of mine");
		//throw new GraphQlApiException("test", "test", "test", "test");
		throw new IllegalArgumentException();
		// return response;
	}

}
