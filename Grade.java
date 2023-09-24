//No Grade using java programming language
import java.util.*;
class Grade_calculation {
public static void main(String []args)
{
	Scanner sc=new Scanner (System.in);
	
	 int phy,chem,maths,eng,comp;
		System.out.print("enter marks of physics, chemistry, maths, english, computer ");
		 phy=sc.nextInt();
		 chem=sc.nextInt();
		 maths=sc.nextInt();
		 eng=sc.nextInt();
		 comp=sc.nextInt();
	    display(phy,chem,maths,eng,comp);
	    
	
	sc.close();
}

public static char calculation(int p,int c,int m,int e,int comp)
{
	
	int sum=p+c+m+e+comp;
	System.out.println("\ntotal marks obtained    "+sum);
	int avg=sum/5;
	System.out.println("\nAverage percentage      "+avg);
	
    if(avg>=90 && avg<=100)
		return'A';
	else if(avg>=80 && avg<90)
		return'B';
	else if(avg>=70 && avg<80)
		return'C';
	else if(avg>=60 && avg<70)
		return'D';
	else if(avg>=50 && avg<60)
		return'E';
	else
		return'F';

}
public static void display(int p,int c,int m,int e,int comp)
{
	char grade;
	System.out.println("physics                 "+ p);
	System.out.println("chemistry               "+ c);
	System.out.println("Maths                   "+ m);
	System.out.println("English                 "+ e);
	System.out.println("Computer                "+ comp);
	
	grade=calculation(p,c,m,e,comp);
	
	System.out.println("\nGrade                   "+grade);
	
}
}
