package differential;

import java.util.Scanner;

public class Differential_main {


	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of  a> ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of h> ");
		double h = Double.parseDouble(scan.next());

		Differential_lib dlib = new Differential_lib(a,h);
		
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getDx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ����鑊�Ό덷��"+dlib.RelativeError());
		System.out.println("f(x)=x^2��x="+a+"�ɂ�����������ʂ�"+dlib.Experiment());
	}
}