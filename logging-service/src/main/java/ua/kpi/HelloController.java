package ua.kpi;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/hello")
public class HelloController {

	private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);


	@Get
	@Produces(MediaType.TEXT_HTML)
	public String hello() {
		LOG.info("called");
		return "hello from logging-service";
	}
}
