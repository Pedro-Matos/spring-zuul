package com.rho.series;

import com.rho.series.controller.SerieController;
import com.rho.series.service.SerieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertNotEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@WebMvcTest(SerieController.class)
public class SeriesServiceApplicationTests {
	@Autowired
	private MockMvc mvc;

	@MockBean
	private SerieService serieService;

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
		serieService = new SerieService();
		assertEquals(3, serieService.displayUserContent().size());
	}

}
