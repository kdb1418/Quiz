
public class MyCalc {
	private int x;
	private int y;
	private int op;
	public int result;
	int addNumbers(int x, int y){
		return x+y;
	}
	int subNumbers(int x, int y){
		return x-y;
	}
	int multNumbers(int x, int y){
		return x*y;
	}
	int divNumbers(int x, int y){
		return x/y;
	}
	MyCalc(int x, int y, int op)
	{
		this.x = x;
		this.y = y;
		this.op= op;
		switch(op)
		{
			case 1:
				result = addNumbers(x, y);break;
			case 2:
				result = subNumbers(x, y);break;	
			case 3:
				result = multNumbers(x, y);break;	
			case 4:
				result = divNumbers(x, y);break;
			case 5:
				break;
		}
		
	}
}
