import java.io.*;

public class Q2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = "IBM cognitive computing|IBM \"cognitive\" computing is a revolution| ibm cognitive computing|'IBM Cognitive Computing' is a revolution?";
		//String s = "\"Computer Science Department\"|Computer-Science-Department|the \"computer science department\"";

		String[] tokenizeLine;

		// while ((s = in.readLine()) != null) {
		tokenizeLine = s.split("\\|");
		String op = "";
		String t1 = "safs";
		String t2 = "";
		int len1 = 0;
		int len2 = 0;
		//op = tokenizeLine[0];
		String prev = "";
		// if(!s.contains("IBM")) {
		for (String token : tokenizeLine) {
			t2 = token.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			System.out.println(t1);
			System.out.println(t2);

			if (t2.contains(t1) || t1.length() == t2.length()) {
				op = token;
				if (t1.length() == t2.length()) {
					op = prev;
				}
				t1 = t2;
				System.out.println("innp" + prev + "   " + op);
				prev = token;
			} else if (t1.contains(t2)) {
				op = token;
				t2 = t1;
				// prev=token;
				System.out.println("dasdas" + prev);
			} else {
				System.out.println("op" + op);

				if (op == "") {
					op = token;
					t1 = t2;
				} else {
					op += "|" + token;
					t1 = t2;
				}
				// len2 = len1;
			}
		}
		System.out.println("ans: "+op);
	}
}
