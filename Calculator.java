import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        System.out.println("enter your tamil marks:");
        int Tamil=Sc.nextInt();
       
        System.out.println("enter your english mark:");
        int English=Sc.nextInt();
        
        System.out.println("enter your Maths mark:");
        int Maths=Sc.nextInt();
        
        System.out.println("enter your Science mark:");
        int Science=Sc.nextInt();
        
        System.out.println("enter your social mark:");
        int social=Sc.nextInt();

        int total=Tamil+English+Maths+Science+social;
        float avg=total/5;

        System.out.println("total :"+total);
        System.out.println("Average :"+avg);

        if(avg>=90)
        {
            System.out.println("Grade O");
        }
        else if(avg>=80 && avg<=90)
        {
            System.out.println("Grade A+");
        }
        else if(avg>=70 && avg<=80)
        {
            System.out.println("Grade A");
        }
        else if(avg>=60 && avg<=70)
        {
            System.out.println("Grade B+");
        }
        else if(avg>=50 && avg<=60)
        {
            System.out.println("Grade B");
        }
        else
        {
            System.out.println("Grade U");
        }



    }
}