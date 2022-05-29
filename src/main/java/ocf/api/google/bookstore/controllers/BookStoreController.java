package ocf.api.google.bookstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ocf.api.google.bookstore.handler.BookStoreHandler;
import ocf.api.google.bookstore.models.request.BookStoreRequest;
import ocf.api.google.bookstore.models.response.BookStoreResponse;

@RestController
public class BookStoreController {

	@Autowired
	private BookStoreHandler handler;

	@PostMapping(value = "/")
	public ResponseEntity<BookStoreResponse> getBookDetails(@RequestBody BookStoreRequest bookStoreRequest) throws InterruptedException {
		BookStoreResponse response = new BookStoreResponse();
		handler.handle(null);
		response.setDetails("This is very first book of mine");
		//System.out.println(handler.handle(null));
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
