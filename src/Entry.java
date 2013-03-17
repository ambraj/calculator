
public class Entry
{
	public static void main(String[] args)
	{
		System.out.println("enter the first number");
		int input1 = ConsoleInput.getInt();
		System.out.println("enter the second number");
		int input2 = ConsoleInput.getInt();
		
		Calculator objCalc = new Calculator();
		int addResult = objCalc.add(input1 , input2);
		int subResult = objCalc.substraction(input1, input2);
		
		System.out.println("addition of " + input1 + " and " + input2  + " is " + addResult);
		System.out.println("Subtraction of " + input1 + " and " + input2  + " is " + subResult);
	}
	
	
}
