package it.digitalnucleus.rand;

import java.util.Random;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

import it.digitalnucleus.rand.api.RandService;

@WebService(endpointInterface = "it.digitalnucleus.rand.api.RandService")
public class RandGenerator implements RandService {
	
	private static final int maxRands = 16;
	
	@WebMethod
	public int next1() {
		return new Random().nextInt();
	}
	
	@WebMethod
	public int[] nextN(final int n) {
		final int k = (n > maxRands) ? maxRands : Math.abs(n);
		int[] rands = new int[k];
		Random r = new Random();
		for (int i = 0; i < k; i++) {
			rands[i] = r.nextInt();
		}
		return rands;
	}

	@WebMethod
	@Oneway
	public void saySomething() {
		System.out.println("I said something!");
	}
	
}
