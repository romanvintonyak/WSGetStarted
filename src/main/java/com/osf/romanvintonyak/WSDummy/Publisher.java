package com.osf.romanvintonyak.WSDummy;
import javax.xml.ws.Endpoint;
public class Publisher {


	 
	public static void main(String[] args) {
	Endpoint.publish("http://localhost:8080/WSDummy", new EndpointImpl());
	}
	 

}
