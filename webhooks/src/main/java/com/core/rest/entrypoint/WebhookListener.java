package com.core.rest.entrypoint;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.core.rest.agreementworkflowcompleted.model.Root;
import com.core.rest.webhooksrequest.model.WebhookRequestModel;
import com.core.webhooksresponse.model.WebhookResponseModel;

@Path("/agreement")
public class WebhookListener {
	
	private HttpServletResponse response;
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public WebhookResponseModel verifyWebhook(@Context HttpHeaders headers) {
		System.out.println("******** Webhook connection established ********");
		
		WebhookResponseModel responseValue = new WebhookResponseModel();
		
		String returnCode = headers.getRequestHeaders().get("x-adobesign-clientid").get(0);
		
		responseValue.setxAdobeSignClientId(returnCode);
		
		return responseValue;
		
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void getResponse(Root agreement,@Context HttpServletResponse headers) {
	//public void getResponse(@Context HttpServletResponse headers) {
		String name = agreement.getAgreement().getName();
		System.out.println("******Webhok executed*****");
		String document = agreement.getAgreement().getSignedDocumentInfo().getDocument();
		
		File file = new File("/Users/sudhanshushankersingh/Desktop/ACN/adobe_sign/signed_document/"+name+".pdf");

	    try ( FileOutputStream fos = new FileOutputStream(file); ) {
	      
	      String b64 = document;
	      byte[] decoder = Base64.getDecoder().decode(b64);

	      fos.write(decoder);
	      System.out.println("******* Signed document Saved ********");
	      headers.addHeader("X-AdobeSign-ClientId", "UB7E5BXCXY");
	      headers.flushBuffer();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
		headers.addHeader("X-AdobeSign-ClientId", "UB7E5BXCXY");
	    try {
			headers.flushBuffer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
