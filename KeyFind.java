
import java.util.Arrays;
public class KeyFind {

		public static void main(String[] args) {
			
			int[] value = {0,2,3,4,5,6,7,8};
			
		System.out.print(check(value, 8));
			
		}
		 public static boolean check( int[] value, int key) {
			
			int n = value.length;
			System.out.println("length" +n);
			
			for(int i = 0; i<n ;i++) {
				
				if(value[i] == key) {
					return true;
				}
			}
			return false;
			
			
		}
}

