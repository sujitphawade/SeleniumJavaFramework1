package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	// Priority will always condier lower number as high priority 
	// Priority has same number then it will consider alphabteical number of the method name 
	// if we dont set the priority for method, it will consider alpha order for method name
	// if we have priority and non priority methods then non priority will run first and then priority methods 

	@Test(priority = 1)
	public void test1() {

		System.out.println("I am in the test1");

	}
	@Test(priority = 1)
	public void test2() {

		System.out.println("I am in the test2");

	}

	@Test(priority = -1)
	public void test3() {

		System.out.println("I am in the test3");

	}
	@Test(priority =0)
	public void test4() {

		System.out.println("I am in the test4");

	}


}
