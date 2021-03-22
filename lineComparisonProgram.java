import java.util.*;
public class lineComparisonProgram
{
	public static void main(String[] args)
	{
		//(x2-x1)^2+(y2-y1)^2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X1 co-ordinate: ");
		int X1 = sc.nextInt();
		System.out.println("Enter Y1 co-ordinate: ");
		int Y1 = sc.nextInt();
		System.out.println("Enter X2 co-ordinate: ");
		int X2 = sc.nextInt();
		System.out.println("Enter Y2 co-ordinate: ");
		int Y2 = sc.nextInt();
		double length_of_line = 0;

		if(X2 > X1 && Y2 > Y1) //For keeping the value positive inside 'sqrt' method
		{
			length_of_line = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		}
		if(X1 > X2 && Y1 > Y2)
		{
			length_of_line = Math.sqrt((X1-X2)*(X1-X2)+(Y1-Y2)*(Y1-Y2));
		}
		if(X2 > X1 && Y1 > Y2)
		{
			length_of_line = Math.sqrt((X2-X1)*(X2-X1)+(Y1-Y2)*(Y1-Y2));
		}
		else
		{
			length_of_line = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		}

		System.out.println("length: "+length_of_line);

	}
}
