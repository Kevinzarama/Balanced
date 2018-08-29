package method;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import list.*;

public class Main {
	
	private InterfaceStack<String> s;
	
	public Main() throws NumberFormatException, IOException {
		s = new Stack<String>();
		read();
		//
	}
	
	public void read() throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long cases = Long.parseLong(in.readLine());
		for(int i = 0; i<cases; ++i) {
			String line = in.readLine();
			if(balancedWord(line).equals("T")) {
				out.write("T\n");
			}else {
				out.write("F\n");
			}
		}
		
		in.close();
		out.close();
	}
	
	public String balancedWord(String word) {
		String[] letters = word.split("");
		int currentSize = 0;
		boolean balanced = false;
		String mensaje = "";
		while(currentSize < letters.length && !balanced) {
			if(letters[currentSize].equals("{") || letters[currentSize].equals("[") || letters[currentSize].equals("(")) {
				s.push(letters[currentSize]);
			} else if(letters[currentSize].equals("}") || letters[currentSize].equals("]") || letters[currentSize].equals(")")) {
				if(compare(s.getTop(), letters[currentSize])) {
					s.pop();
					mensaje += "T";
				} else {
					mensaje = "F";
					balanced = true;
				}
			}
			currentSize++;
		}
		return mensaje;
	}
	
	public boolean compare(String a, String b) {
		if(a.equals("(") && b.equals(")")) {
			return true;
		} else if(a.equals("[") && b.equals("]")) {
			return true;
		} else if(a.equals("{") && b.equals("}")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main m = new Main();
	}
	
}
