package com.exercicio;

public class A {
	//Atributos
	private int a1;
	private float a2;
	private String a3;
	private String aprinc4;

	
	//M�todos acessores
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public float getA2() {
		return a2;
	}
	public void setA2(float a2) {
		this.a2 = a2;
	}
	public String getA3() {
		return a3;
	}
	public void setA3(String a3) {
		this.a3 = a3;
	}
	public String getAprince4() {
		return aprinc4;
	}
	public void setAprince4(String aprince4) {
		this.aprinc4 = aprince4;

	}
	
	//M�todos
	public double soma(){
		return this.a1 + this.a2;
	}
	
	
	
	
}
