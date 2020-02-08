package javaPractice;

import java.io.IOException;
import java.util.StringTokenizer;

public class StringPractice {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Give input :");
		String x = Read.in.readLine();
		
		for(String i : x.split("\\W")) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		StringTokenizer st = new StringTokenizer(x, "+-*/ ", true);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
