package it.edu.marconipontedera.tepsit;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.core.Response;

public class RequestResponse<E> {
	
	Response toResponse(E exception) {
		return null;
		
	}

	public void filter(ContainerRequestContext requestContext)
			throws IOException {
	}
	
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
	}
}
