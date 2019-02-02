package qsp;

interface Shape {
public default void display() {
	System.out.println("this is dispay() of shape interface");
}
interface Shape2{
	public default void display() {
		System.out.println("this is dispay() of shape2 interface");
		
	}
	class Circle implements Shape,Shape2{
		@Override
		public void display() {
			// TODO Auto-generated method stub
			Shape.super.display();
			Shape2.super.display();
			
		
	}

	
		}
}
}
