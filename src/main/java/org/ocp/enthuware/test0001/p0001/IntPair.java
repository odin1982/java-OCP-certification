package org.ocp.enthuware.test0001.p0001;

public class IntPair {
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public boolean equals(Object obj) {
		return (obj instanceof IntPair && this.a == ((IntPair)obj).a && this.b == ((IntPair)obj).b);
	}
	
	public int hashCode() {
		//return a;
		//return a*b;
		//return a+b;
		return b;
	}

}
