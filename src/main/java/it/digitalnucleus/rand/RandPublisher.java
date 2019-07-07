package it.digitalnucleus.rand;

import javax.xml.ws.Endpoint;

public class RandPublisher {
	
	static {
//		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
//		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
//		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
//		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
	}

	public static void main(String[] args) {
		String url = "http://localhost:8888/services/rs";
		System.out.println("Publishing to endpoint: " + url);
		RandGenerator rg = new RandGenerator();
		Endpoint ep = Endpoint.publish(url, rg);
		do {
			System.out.println("Waiting for publishing ...");
		} while (!ep.isPublished());
	}

}
