package it.digitalnucleus.rand.api;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface RandService {
	
	@WebMethod
	public int next1();
	
	@WebMethod
	public int[] nextN(final int n);
	
	@WebMethod
	public void saySomething();
}
