package ocf.api.google.bookstore.mappers.request;

import org.springframework.stereotype.Component;

import ocf.api.core.modules.interfaces.IMapper;
import ocf.api.google.bookstore.models.request.BookStoreRequest;
import ocf.api.google.bookstore.models.request.GoogleBookStoreRequest;

@Component
public class GoogleBookStoreServiceRequestMapper implements IMapper<BookStoreRequest,GoogleBookStoreRequest> {

	@Override
	public GoogleBookStoreRequest map(BookStoreRequest source, GoogleBookStoreRequest destination) {
		// TODO Auto-generated method stub
		return null;
	}

}
