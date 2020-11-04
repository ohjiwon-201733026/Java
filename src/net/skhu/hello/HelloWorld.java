package net.skhu.hello;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GoodMorning g=new GoodMorning();
		System.out.println("hello world");
		System.out.println(g.hello());

	}


}

class GoodMorning{
	public String hello() {
		return "Good morning";
	}
}