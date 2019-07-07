package com.rho.books;

import com.rho.books.controller.BookController;
import com.rho.books.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BooksApplicationTests {
	@Autowired
	private MockMvc mvc;

	@MockBean
	private BookService bookService;

	@Test
	public void getEndpointStatus() throws Exception {
		MockHttpServletResponse response = mvc.perform(
				get("/")
						.accept(MediaType.APPLICATION_JSON))
				.andReturn().getResponse();

		assertEquals(200, response.getStatus());
	}

	@Test
	public void getBadEndpoint() throws Exception {
		MockHttpServletResponse response = mvc.perform(
				get("/api")
						.accept(MediaType.APPLICATION_JSON))
				.andReturn().getResponse();

		assertNotEquals(200, response.getStatus());
	}

	@Test
	public void testService() {
		bookService = new BookService();
		assertEquals(4, bookService.displayShelf().size());
	}

}