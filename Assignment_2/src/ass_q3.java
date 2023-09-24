import java.util.*;
public class ass_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s[]=new Student[2];
		double maxmarks=Double.MIN_NORMAL;
		int index=0;
		for(int i=0;i<s.length;i++) {
			s[i]=new Student();
			s[i].getData();
			if(s[i].Dsamarks>maxmarks) {
				maxmarks=s[i].Dsamarks;
				index=i;
			}
		}
		System.out.println("Student with highest marks is");
		s[index].showData();
	}

}
class Student{
	int roll;
	String name;
	int Dsamarks;
	public void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		name =sc.next();
		System.out.println("Enter rollno ");
		roll=sc.nextInt();
		System.out.println("Enter dsamarks ");
		Dsamarks=sc.nextInt();
		
	}
	public void showData() {
		System.out.println("Roll-"+roll);
		System.out.println("Name-"+name);
		System.out.println("DSAmarks-"+Dsamarks);
	}
}