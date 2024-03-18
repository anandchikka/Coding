import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0; i<n; i++){
    		String str=sc.next();
    		
    		if(str.length()>10){
    		    int len=str.length()-2;
    		    System.out.println(str.charAt(0)+""+len+""+str.charAt(str.length()-1));
    		}
    		else{
    		    System.out.println(str);
    		}
	    }
	}
}
