package weka.newFunction;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class NewFunctionTest extends TestCase {
	
	public NewFunctionTest(String name) {
		super(name);
	}
	public void testHelloWorld() {
		NewFunction f = new NewFunction();
		 junit.framework.Assert.assertEquals(f.helloWorld(), "Hello World");
	}
	
	public static Test suite() {
		return new TestSuite(NewFunctionTest.class);
	}
	
	public static void main(String []args) {
		    junit.textui.TestRunner.run(suite());
	}	
}


