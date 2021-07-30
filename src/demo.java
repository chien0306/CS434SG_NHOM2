import java.util.Scanner;

public class demo {
	public static void main(String[] args) 
	{
        int num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        num1 = scanner.nextInt();
        System.out.println("Nhap vao so thu 2: ");
        num2 = scanner.nextInt();
        System.out.println("Nhap vao so thu 3: ");
        num3 = scanner.nextInt();
        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1+" la so lon nhat!!");
 
        else if (num2 >= num1 && num2 >= num3)
        	
            System.out.println(num2+" la so lon nhat!!");
        else
            System.out.println(num3+" la so lon nhat!!");
    }
}
