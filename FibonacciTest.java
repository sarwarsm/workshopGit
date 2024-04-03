package cs1530.spring24;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class FibonacciTest {
	private FibonacciNumberGen fibGen;

	@BeforeEach
	void setUp() throws Exception {
		fibGen = new FibonacciNumberGen();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Test Fibbonacci Optimized")
	void testFibOpt() {
		int N = 50;
		long fibMem[] = new long[N+1];
		Arrays.fill(fibMem, -1);
		
		//Fibonacci Sequence: 0,1,1,2,3,5,8,13,21,34,55,89
		long fibSeqExpected = 12586269025L; // for 25: 75025; for 50: 12586269025L;
		int fibSeqIndex = 50;
		long fibActual = fibGen.fibOpt(fibSeqIndex, fibMem);
		String msg = "The expected Fibonnaci sequence number for the sequence index " +  
				fibSeqIndex + " is " +  fibSeqExpected + "\n";
		assertEquals(fibSeqExpected, fibActual, msg);
	}

	@Test
	@DisplayName("Test Fibbonacci")
	@Timeout(60)
	void testFib() {
		//Fibonacci Sequence: 0,1,1,2,3,5,8,13,21,34,55,89
		long fibSeqExpected = 21; 
		int fibSeqIndex = 8;
		long fibActual = fibGen.fib(fibSeqIndex);
		String msg = "The expected Fibonnaci sequence number for the sequence index " +  
				fibSeqIndex + " is " +  fibSeqExpected + "\n";
		assertEquals(fibSeqExpected, fibActual, msg);

		fibSeqExpected = 8;
		fibSeqIndex = 6;
		fibActual = fibGen.fib(fibSeqIndex);
		msg = "The expected Fibonnaci sequence number for the sequence index " +  
				fibSeqIndex + " is " +  fibSeqExpected + "\n";
		assertEquals(fibSeqExpected, fibActual, msg);
		
		fibSeqExpected = 75025;//for index 50 => 12586269025L;
		fibSeqIndex = 25;
		fibActual = fibGen.fib(fibSeqIndex);
		msg = "The expected Fibonnaci sequence number for the sequence index " +  
				fibSeqIndex + " is " +  fibSeqExpected + "\n";
		assertEquals(fibSeqExpected, fibActual, msg);

		//Add 4th test case
	}

}
