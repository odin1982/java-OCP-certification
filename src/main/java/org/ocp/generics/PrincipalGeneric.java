package org.ocp.generics;

public class PrincipalGeneric {
	public static void main(String[] args) {
		BolsaGeneric<Chocolatina> bolsa = new BolsaGeneric<Chocolatina>(5);
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("milka");
		Chocolatina c2 = new Chocolatina("ferrero");
		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		for (Chocolatina chocolatina : bolsa) {
			System.out.println(chocolatina.getMarca());
		}
	}
}
