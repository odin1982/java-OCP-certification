package org.ocp.enthuware.test0001.p0001;

public class Book {
	String isbn;
	String title;
	
	public Book(String isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}
	
	public boolean equals(Object o) throws Exception{
		return true;
	}
	
	public static void main(String[] args) {
		Object b1 = new Book("1111","Thinking in Java");
		Object b2 = new Book("1111","Java in 24 hrs");
		System.out.println(b1.equals(b2));
	}
}
