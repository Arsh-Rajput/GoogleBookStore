package ocf.api.google.bookstore.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ocf.api.core.modules.annotations.EnableExecutionMetric;
import ocf.api.core.modules.interfaces.IMapper;
import ocf.api.core.modules.interfaces.IModelService;
import ocf.api.core.modules.interfaces.IRequestHandler;
import ocf.api.core.modules.interfaces.IValidator;
import ocf.api.google.bookstore.models.request.BookStoreRequest;
import ocf.api.google.bookstore.models.request.GoogleBookStoreRequest;

@Component
public class BookStoreHandler implements IRequestHandler<BookStoreRequest, String> {

	@Autowired
	private IModelService<GoogleBookStoreRequest, String> service;

	@Autowired
	private IValidator<BookStoreRequest> validator;

	@Autowired
	private IMapper<BookStoreRequest, GoogleBookStoreRequest> requestMapper;

	@Override
	public String handle(BookStoreRequest request) throws InterruptedException {
		validator.validate(request);
		requestMapper.map(request, null);
		testExecution();
		return service.process(null);
	}

	@EnableExecutionMetric
	public void testExecution() throws InterruptedException {
		Thread.sleep(2000);
	}

}
