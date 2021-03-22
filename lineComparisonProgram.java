import java.util.*;
public class lineComparisonProgram
{
	public static void main(String[] args)
	{
		Integer X1,X2,x1,x2,Y1,Y2,y1,y2;
		//(x2-x1)^2+(y2-y1)^2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X1 co-ordinate: ");
		X1 = sc.nextInt();
		System.out.println("Enter Y1 co-ordinate: ");
		Y1 = sc.nextInt();
		System.out.println("Enter X2 co-ordinate: ");
		X2 = sc.nextInt();
		System.out.println("Enter Y2 co-ordinate: ");
		Y2 = sc.nextInt();

		System.out.println("Enter x1 co-ordinate: ");
		x1 = sc.nextInt();
		System.out.println("Enter y1 co-ordinate: ");
		y1 = sc.nextInt();
		System.out.println("Enter x2 co-ordinate: ");
		x2 = sc.nextInt();
		System.out.println("Enter y2 co-ordinate: ");
		y2 = sc.nextInt();

		double length_of_line_1 = 0;
		double length_of_line_2 = 0;

		if(X2 > X1 && Y2 > Y1) //For keeping the value positive inside 'sqrt' method
		{
			length_of_line_1 = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		}
		if(X1 > X2 && Y1 > Y2)
		{
			length_of_line_1 = Math.sqrt((X1-X2)*(X1-X2)+(Y1-Y2)*(Y1-Y2));
		}
		if(X2 > X1 && Y1 > Y2)
		{
			length_of_line_1 = Math.sqrt((X2-X1)*(X2-X1)+(Y1-Y2)*(Y1-Y2));
		}
		else
		{
			length_of_line_1 = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		}


		if(x2 > x1 && y2 > y1)
		{
			length_of_line_2 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		}
		if(x1 > x2 && y1 > y2)
		{
			length_of_line_2 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		}
		if(x2 > x1 && y1 > y2)
		{
			length_of_line_2 = Math.sqrt((x2-x1)*(x2-x1)+(y1-y2)*(y1-y2));
		}
		else
		{
			length_of_line_2 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		}


		Double dl1 = length_of_line_1;
		Double dl2 = length_of_line_2;

		int compare = dl1.compareTo(dl2);

		if(compare == 0)
		{
			System.out.println(compare);
			System.out.println("Two lines are equal in length");
		}
		else if(compare == 1)
		{
			System.out.println(compare);
			System.out.println("First line is bigger than second line");
		}
		else
		{
			System.out.println(compare);
			System.out.println("Second line is bigger than first line");
		}
	}
}
