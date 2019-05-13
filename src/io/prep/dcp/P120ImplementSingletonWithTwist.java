package io.prep.dcp;

import io.prep.dcp.lib.TwistSingleton;

/**
 * Implement the singleton pattern with a twist. First, instead 
 * of storing one instance, store two instances. And in every 
 * even call of getInstance(), return the first instance and 
 * in every odd call of getInstance(), return the second instance.
 *
 */
public class P120ImplementSingletonWithTwist {

	public static void main(String[] args) {
		
		TwistSingleton sig1 = TwistSingleton.getInstance();
		System.out.println(sig1);
		TwistSingleton sig2 = TwistSingleton.getInstance();
		System.out.println(sig2);
		TwistSingleton sig3 = TwistSingleton.getInstance();
		System.out.println(sig3);
		TwistSingleton sig4 = TwistSingleton.getInstance();
		System.out.println(sig4);
		TwistSingleton sig5 = TwistSingleton.getInstance();
		System.out.println(sig5);
	}
	
	

}
