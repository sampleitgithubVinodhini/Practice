package com.java;

 class Method_Overloading {

	public void fruit(String name)
	{
		System.out.println(name);	
	}
	public void fruit(float color)
	{
		System.out.println(color);	
	}
	
private void fruit(int price)
{
	//price=20;
	System.out.println(price);

}

public static void main(String[] args) {
	
	Method_Overloading m=new Method_Overloading();
	m.fruit("Mango");
	m.fruit("color");
	m.fruit(20);
}
}