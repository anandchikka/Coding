import java.util.*;

public class StringTask{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		str=str.toLowerCase();
		
		String[] vowels={"a", "o", "y", "e", "u", "i"};
		
		for(int i=0; i<vowels.length; i++){
		    str=str.replace(vowels[i], "");
		}
		
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=0; i<str.length(); i++){
		    stringBuilder.append(".");
		    stringBuilder.append(str.charAt(i));
		}
		
		System.out.println(stringBuilder);
	}
}
