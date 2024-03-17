import java.util.*;
import java.util.stream.*;

public class HelpfulMaths{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringTokenizer tokenizer=new StringTokenizer(str, "+");
		List<Integer> list=new ArrayList();
		
		while(tokenizer.hasMoreTokens()){
		    list.add(Integer.parseInt(tokenizer.nextToken()));
		}
		
		List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
		
		StringBuilder stringBuilder=new StringBuilder();
		
		for(Integer i:sortedList){
		    stringBuilder.append(String.valueOf(i));
		    stringBuilder.append("+");
		}
		
		String result=new String(stringBuilder);
		
		System.out.println(charRemoveAt(result, result.length()-1));
	}
	public static String charRemoveAt(String str, int p) {  
    return str.substring(0, p) + str.substring(p + 1);  
           }  
}
