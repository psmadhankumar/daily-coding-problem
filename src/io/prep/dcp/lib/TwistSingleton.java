package io.prep.dcp.lib;


public class TwistSingleton {
		
		private static TwistSingleton object1 = null;
		private static TwistSingleton object2 = null;
		
		private static boolean useObject1 = false;
		
		private static class Singleton1 {
			private static TwistSingleton OBJECT1 = new TwistSingleton();
		}
		
		private static class Singleton2 {
			private static TwistSingleton OBJECT2 = new TwistSingleton();
		}
		
		private TwistSingleton() {}
		
		public static TwistSingleton getInstance() {
						
			synchronized (TwistSingleton.class) {
				if (useObject1) {
					useObject1 = false;
				} else {
					useObject1 = true;
				}
				
				if(useObject1) {
					if(object1 == null) {
						object1 = new TwistSingleton();
						return object1;
					}else if(object1 != null) {
						return object1;
					}
				}
				
				
				if(object2 == null) {
					object2 = new TwistSingleton();
				}
				return object2;

			}
			
		}
		

	
}
