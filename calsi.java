interface calsi
{
public void getSum(int a,int b);
public void getDiff(int a,int b);
}

class CalsiIMP implements calci{
public void getSum(int a,int b){
    retun a+b;
}
public void getDiff(int a,int b){
    retun a-b;
}


}
import java.util.Scanner;
class CalsiDriver{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
CalsiIMP i=new CalsiIMP();
System.out.println("entre num1,num2")
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(a+"+"+b+"="+i.getSum(a,b));
System.out.println(a+"-"+b+"="+i.getDiff(a,b));
}

}