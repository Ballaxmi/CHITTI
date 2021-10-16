import java.util.Arrays;
public class Keyfind1 {
	
    public static void main(String[] args) {
    
    	int[] arr =new int[] {15,7,80,10,98,87,56,89,65};
    	Arrays.sort(arr);
    	System.out.println("Elements of arr sorted in incresing order:");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println(arr[i]);
    	}
    }
    
}