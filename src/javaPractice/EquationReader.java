package javaPractice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EquationReader {
	public static void main(String[] args) throws IOException {
		List<String> eq = new ArrayList<String>();
		
		
		System.out.println("Enter your equation :");
		String x = Read.in.readLine();
		StringTokenizer st = new StringTokenizer(x, "+-*/", true);
				
		while (st.hasMoreTokens()) {
			eq.add(st.nextToken().trim());
		}
		
		System.out.print("Equation is : ");
		eq.forEach(System.out::print);
	}
}
