package com.fis.oops;

class Hello//final
{
int i=12;//final
	public  void changeNumber()//final
	{
		i=++i;
		System.out.println("Am from Hello class m1 method :"+i);
	}
//	100 methods
}
public  class FinalEx extends Hello {
	
	public static void main(String[] args) {
		FinalEx test=new FinalEx();
	
		test.changeNumber();
	
	}
	@Override
	public void changeNumber()
	{
		i=--i;
		System.out.println("Am from Test class m1 method :"+i);
	}
}
