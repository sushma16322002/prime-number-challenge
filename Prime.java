import java.util.Scanner;
public class Prime{
    public static void main(String args[]){
    int flag=0;
    int i,n;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter a number : ");   
    n=obj.nextInt();
    for(i=2;i<n/2;i++){
        if(n%i==0){
            flag=1;
        }
    }
    if(flag==1){
        
    }
    else{
        System.out.println("it is a prime number ");
    }
    }
}



