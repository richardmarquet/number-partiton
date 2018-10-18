import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static void main(String[] a) {
		//make this any value you want
		int num = 4;
		partition(num,num,"");
	}
	public static void partition(int n, int max, String pref){
		if(n == 0){
			System.out.println(pref);
			return;
		}
		
		for (int i = Math.min(max, n); i > 0; i--){
			partition(n-i, i, pref + " " + i);
		}
	}
}