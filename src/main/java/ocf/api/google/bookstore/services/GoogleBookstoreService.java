package ocf.api.google.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ocf.api.core.client.http.InternalApiClient;
import ocf.api.core.modules.interfaces.IModelService;
import ocf.api.google.bookstore.configs.BookStoreConfig;
import ocf.api.google.bookstore.models.request.GoogleBookStoreRequest;

@Component
public class GoogleBookstoreService implements IModelService<GoogleBookStoreRequest,String>{

	@Autowired
	private InternalApiClient internalApiClient;

	@Autowired
	private BookStoreConfig config;

	@Override
	public String process(GoogleBookStoreRequest query) {

		return internalApiClient.get(config.getGoogleBookStoreBaseUrl(), null, String.class);
	}

}
