import java.util.*;

public class BeautifulMatrix{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i1=0;
        int j1=0;
        int[][] arr=new int[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    i1=i;
                    j1=j;
                }
            }
        }
        int count=0;
        if(i1>=2 && j1>=2){
            count=(i1-2)+(j1-2);
        }
        else if(i1>=2 && j1<=2){
            count=(i1-2)+(2-j1);
        }
        else if(i1<=2 && j1>=2){
            count=(2-i1)+(j1-2);
        }
        else if(i1<=2 && j1<=2){
            count=(2-i1)+(2-j1);
        }
        
        System.out.print(count);
	}
}
