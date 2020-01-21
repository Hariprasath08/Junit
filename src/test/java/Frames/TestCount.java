package Frames;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestCount {

	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(Ignore11.class,Ignore12.class);

		System.out.println("Ignore Count " + r.getIgnoreCount());
	
		System.out.println("Run Count " + r.getRunCount());
		System.out.println("Run Time " + r.getRunTime());
		System.out.println("Failure Count " + r.getFailureCount());

		List<Failure> failures = r.getFailures();
		for(Failure failureTestCases : failures)
		System.out.println("Failure Test Cases " + failureTestCases);


          

	}

}
