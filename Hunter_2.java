import java.util.Arrays;
import java.util.Scanner;

public class Hunter_2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int ak=sc.nextInt();
	int arr[]=new int [ak];
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int ar[]=new int[ak];
	for(int i=ak-1;i>=0;i--) {
		int j=0;
		
		ar[j]=arr[i];
		
		System.out.println(ar[j]);
		j++;
	}
	
	
	
}
}
