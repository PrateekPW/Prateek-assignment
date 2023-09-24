import java.util.*;
public class ass_q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex num1=new Complex();
		Complex num2=new Complex();
		
		num1.setData();
		num2.setData();
		num1.display();
		num2.display();
		Complex sumtot=new Complex();
		sumtot=sumtot.add(num1, num2);
		sumtot.display();
		
		

	}

}
class Complex{
	int real;
	int imag;
	public void setData() {
		Scanner sc=new Scanner(System.in);
		real=sc.nextInt();
		imag=sc.nextInt();
		
	}
	public void display() {
		System.out.println(real+"+"+imag+"i");
	}
	public Complex add(Complex num1,Complex num2) {
		Complex sum=new Complex();
		sum.real=num1.real+num2.real;
		sum.imag=num1.imag+num2.imag;
		return sum;
	}
}
