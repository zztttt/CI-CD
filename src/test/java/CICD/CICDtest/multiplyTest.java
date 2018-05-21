package CICD.CICDtest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import CICD.CICDtest.multiplication;

public class multiplyTest extends TestCase {
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public multiplyTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( multiplyTest.class );
    }
    
	public void test_multiply() {
		assertEquals(multiplication.multiply(2, 3), 6);
	}
}
