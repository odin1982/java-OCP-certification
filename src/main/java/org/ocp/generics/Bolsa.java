package org.ocp.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa implements Iterable{
	private ArrayList lista = new ArrayList();
	private int tope;
	
	public Bolsa(int tope) {
		this.tope=tope;
	}
	
	public void add(Object objeto) {
		if(lista.size() >= tope) {
			lista.add(objeto);
		}else {
			throw new RuntimeException("no caben mas");
		}
	}
	
	@Override
	public Iterator iterator() {
		return lista.iterator();
	}

}
