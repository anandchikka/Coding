import java.util.*;

public class YoungPhysicist
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr =new int[n][3];
        int s1=0;
        int s2=0;
        int s3=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                arr[i][j]=sc.nextInt();
                
                if(j==0){
                    s1+=arr[i][j];
                }
                else if(j==1){
                    s2+=arr[i][j];
                }
                else{
                    s3+=arr[i][j];
                }
            }
        }
        if(s1==0 && s2==0 && s3==0)
            System.out.println("YES");
        else
            System.out.println("NO");
	}
}