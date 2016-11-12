import java.io.*;

public class Q2_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 // String s = "IBM cognitive computing|IBM \"cognitive\" computing is a revolution| ibm cognitive computing|'IBM Cognitive Computing' is a revolution?";
  		String s = "\"Computer Science Department\"|Computer-Science-Department|the \"computer science department\"";
  		 String[] tokenizeLine;
   
    //while ((s = in.readLine()) != null) {
      tokenizeLine = s.split("\\|");
      String op = "";
      String t1="safs";
      String t2="";
      int len1=0; 
      int len2=0;
      String prev = "";
      op = tokenizeLine[0];
     //if(!s.contains("IBM")) {
      for (String token : tokenizeLine) {
    	  System.out.println("token:" +token);
    	  System.out.println("op:"+op);
         t2 = token.replaceAll("\"","").replaceAll("\'","").replaceAll("-"," ").toLowerCase();
         System.out.println("t1:"+t1);
         System.out.println("t2:"+t2);
        len1 = token.length();
        if(t2.contains(t1)){
            if(t2.replaceAll("[^a-zA-Z0-9]", "").length() == t1.length()){
            	op = prev;
            }
            else
            	op = token;
            prev = op;
        }
        else
            op+="|"+token;
       // len2 = len1;
        t1 = t2;
      }
      System.out.println(op); 
    // }
//     else{
//      for (String token : tokenizeLine) {
//        t2 = token.replaceAll("\"","").replaceAll("\'","");
//        if(t2.contains(t1))
//            op = token;
//        t1 = t2; 
//      }
//      System.out.println(op);
//     }
     System.out.println(op);
    //}
  }
}
