package weka.newFunction;
import weka.filters.AllFilterTest;
import weka.filters.MultiFilterTest;
import weka.test.WekaTestSuite;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests extends WekaTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite();
	    
	    suite.addTest(NewFunctionTest.suite());
	    
	    return suite;
	}
	
	public static void main(String[] args) {
	    junit.textui.TestRunner.run(suite());
	}
}
