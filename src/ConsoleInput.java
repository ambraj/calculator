
public class ConsoleInput
{
	public static String getString()
	{
		try
		{
			byte arrInitial[] = new byte[100];
			int length = System.in.read(arrInitial);
			byte arrFinal[] = new byte[length - 2];
			System.arraycopy(arrInitial, 0, arrFinal, 0, length - 2);
			String objString = new String(arrFinal);
			return objString;
			
		} catch (Exception objException)
		{
			System.out.println(objException);
		}
		return null;
	}
	
	public static int getInt()
	{
		String objString = getString();
		return Integer.parseInt(objString);
	}
	
}
