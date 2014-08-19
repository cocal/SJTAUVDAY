package poj;
import java.util.Scanner;

public class poj1003{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			double f=in.nextFloat();
			if(f==0)
				return ;
			if(f<=0.5){
				System.out.println("1 card(s)");
				continue;	
			}
			int ans=1;
			double sum=0.5;
			int base=2;
			do{
				base++;
				ans++;
				sum+=1.0/base;
			}while(sum<f);
			System.out.println(ans+" card(s)");
		}
	}
}
