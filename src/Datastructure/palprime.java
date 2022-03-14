package Datastructure;
import java.io.*; 
import java.util.Scanner;

public class palprime {
public static void main (String args[]) {
	int startrange,endrange;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter start value");
	startrange=sc.nextInt();
	System.out.println("enter end value");
	endrange=sc.nextInt();
	System.out.println("the pal primes are: "+startrange+ "and"+endrange);
for(int i=startrange;i<=endrange;i++)
{
	if(checkpalprime(i))
		System.out.println(i);
}
}
static boolean checkpalprime(int number){
	int temp,rem,i;
	int count=0;
	int sum=0;
	temp=number;
	for(i=1;i<=temp;i++){
if(temp%i==0)
{
	count++;
}
}
	while(number > 0)  
    {  
        // get last digit of the number  
        rem = number%10;  
          
        // store the digit last digit  
        sum = sum*10+rem;   
          
        // extract all digit except the last  
        number = number/10;   
    }  
	   if(temp == sum && count == 2)  
           return true;  
       else  
           return false;  
   }
}

