package com.cg.demo;

public class Math {
	
	public boolean isEven(int x){
		return x%2 == 0;
	}
	
	
	public long factorial(long l){
		
		if(l<0)
			throw new RuntimeException();
		if((l == 0) || (l==1))
			return 1;
		
		long factorial=1;
		for(long x=l;x>1;x--){
			factorial *=x;
		}
		
		return factorial;
	}
}













