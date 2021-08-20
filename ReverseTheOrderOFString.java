import java.io.*;
import java.util.*;
public class ReverseTheOrderOFString {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
	    Scanner sc = new Scanner(System.in);  
        int n;
        n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String s = sc.next();
            l.add(s);
        }
        System.out.println("Before Reversing");
        for(int i = 0; i <n; i++){
            System.out.println(l.get(i));
        }
	    int lw = 0, hi = l.size()-1;
	    while(lw <= hi){
	        Collections.swap(l, lw, hi);
	        lw++;hi--;
	    }
        System.out.println("After Reversing");
        for(int i = 0; i <n; i++){
            System.out.println(l.get(i));
        }
	}
}