//ʹ��Scanner�������ݲ�������������
import java.util.Scanner;

public class TestScanner{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("�������������"+a);
		float b=s.nextFloat();
		System.out.println("������ĸ�������"+b);
		float c=(float)a+b;
		System.out.println("a+b="+c);
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		System.out.println("j="+j);
		
	}
	
}