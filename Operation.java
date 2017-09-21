import java.util.Scanner;
public class Operation {
	public int c;
	public int first;
	public int second;
	void showMenu(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculator Options Menu");
		System.out.println("1.\tAdd two integers");
		System.out.println("2.\tSubtract an integer from an integer");
		System.out.println("3.\tMultiply two integers");
		System.out.println("4.\tDivide an integer into an integer");
		System.out.println("5.\tExit");
		System.out.print("Select one of the option numbers from above: ");
		c = sc.nextInt();
		
	}
	void getNumber(){
		first=getFirstNumber();
		second=getSecondNumber();
	}
	int getFirstNumber(){
		int n;
		System.out.print("Input first number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		return n;
	}
	int getSecondNumber(){
		int m;
		System.out.print("Input second number: ");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		return m;
	}

	public static void main(String[] args)
	{
		Operation op = new Operation();
		op.showMenu();
		if(op.c!=5){
			
		op.getNumber();
		MyCalc cal = new MyCalc(op.first, op.second, op.c);
		System.out.println("Result: "+cal.result);
		}
		if(op.c==5)System.out.println("Exit");
		
	}
	
}
