package org.ocp.enthuware.test0001.p0001;

import java.io.IOException;

public class AB {

}

class A{
	byte getStatusCode(Object obj) throws NullPointerException{
		if(obj != null) return 127;
		else return -1;
	}
}

//class B extends A{
//	byte getStatusCode(Object obj) throws IOException{
//		if(obj != null) return 127;
//		else return -1;
//	}
//}

//class B extends A{
//	byte getStatusCode(Object obj) throws Throwable{
//		if(obj != null) return 127;
//		else return -1;
//	}
//}

//class B extends A{
//	byte getStatusCode(Object obj) throws NullPointerException{
//		if(obj != null) return 127;
//		else return -1;
//	}
//}

//another arithmetic exception
class B extends A{
	byte getStatusCode(Object obj) throws ArithmeticException{
		if(obj != null) return 127;
		else return -1;
	}
}



/*
 * Object -> Throwable -> Exception -> RuntimeException -> NullPointerException
 * Object -> Throwable -> Exception -> IOException
 * */
