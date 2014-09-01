package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
/**
 * This is the root path for our resful api service
 * In the web.xml file, we specified that /api/* need to be in the URL to
 * get to this class
 * 
 * We are versioning the class in the URL path. This is the first version v1.
 * Example how to get to the root of this api resource:
 * http://localhost:8080/com.youtube.rest/api/v1/status
 * 
 * @author Olle
 *
 */

@Path("/v1/status")
public class V1_status {

	private static final String api_version= "1.0";
	
	/**
	 * This method sits at the root of the api. It will return the name
	 * of this api.
	 * 
	 * @return String - Title of the api.
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java Web Service</p>";
	}
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "<p>Version:</p> " + api_version;
	}
/**
 * This method will return the version number of the api.
 * Note: This is nested one down from the root. You will need to add version
 * into the URL path, 
 * example: Http://localhost:8080/com.youtube.rest/api/vi/status/version
 * 
 *  @return String - version number of the api
 */


}
