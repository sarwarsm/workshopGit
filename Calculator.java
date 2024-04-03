package cs1530.spring24;

public class Calculator implements Adder, Subtractor, Multiplier, Division {

	@Override
	public double divide(double... ds) {
		double result = ds[0];
		
		for(int i = 1; i < ds.length; i++) {
			if(ds[i] == 0)
				return 0;
			
			result /= ds[i];
		}
		
		return result;
	}

	@Override
	public long multiply(long... ls) {
		long result = ls[0];
		
		for(int i = 1; i < ls.length; i++) {
			result *= ls[i];
		}
		
		return result;
	}

	@Override
	public long subtract(long... ls) {
		long result = ls[0];
		
		for(int i = 1; i < ls.length; i++) {
			result -= ls[i];
		}
		
		return result;
	}

	@Override
	public long add(long... ls) {
		long result = 0l;
		
		for(int i = 0; i < ls.length; i++) {
			result += ls[i];
		}
		
		return result;
	}

}
