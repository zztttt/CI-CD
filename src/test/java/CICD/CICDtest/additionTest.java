package CICD.CICDtest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import CICD.CICDtest.addition;

public class additionTest extends TestCase {
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public additionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( additionTest.class );
    }
    
	public void test_add() {
		assertEquals(addition.add(1, 2), 3);
	}
}
