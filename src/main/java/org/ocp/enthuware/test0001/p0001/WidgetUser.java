package org.ocp.enthuware.test0001.p0001;


class Widget{
	String data ="data";
	public void doWidgetStuff() {
		System.out.println(data);
	}
}

class GoodWidget extends Widget{
	String data ="big data";
	
	public void doWidgetStuff() {
		System.out.println();
	}
}

public class WidgetUser {
	public static void main(String[] args) {
		Widget w = new GoodWidget();
		((Widget)w).doWidgetStuff();
	}

}
