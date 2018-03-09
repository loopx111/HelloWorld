//使用Scanner输入数据并进行算术运算
import java.util.Scanner;

public class TestScanner{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("你输入的整数是"+a);
		float b=s.nextFloat();
		System.out.println("你输入的浮点数是"+b);
		float c=(float)a+b;
		System.out.println("a+b="+c);
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		System.out.println("j="+j);
		
	}
	
}