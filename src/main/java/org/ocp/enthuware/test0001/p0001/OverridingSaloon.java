package org.ocp.enthuware.test0001.p0001;

abstract class Saloon{
	protected int m1() {
		return 0;
	}
}

public class OverridingSaloon extends Saloon{
	int m1() {//se esta sobreescribiendo pero la visibilidad es menor a protected
		return 1;
	}
}

