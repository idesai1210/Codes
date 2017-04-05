import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            
            String str = sc.nextLine().trim();
            
            if(str.startsWith("P:")){
                checkPhone(str.split(":")[1].trim());
            }
            else{
                checkEmail(str.split(":")[1].trim());
            }
           // System.out.println(str);
        }
        
        
    }
    
    
    public static void checkPhone(String str){
        str = str.replaceAll("[() -]","");
        String maskedNum = str.substring(str.length() - 10);
        String temp = maskedNum.substring(maskedNum.length() - 4);
        if(str.startsWith("+")){
            maskedNum = str.substring(0,str.length() - 10).replaceAll("\\d" , "*") + "-" + "***-***-" + temp; 
           // System.out.println("hi");
        }else{
            maskedNum = "***-***-" + temp;
        }
        
        System.out.println("P:"+maskedNum);
    }
    
    public static void checkEmail(String str){
        String[] id = str.split("@");
        String maskedEmail = id[0].charAt(0) + "*****" + id[0].charAt(id[0].length() - 1) + "@" + id[1];
        
        System.out.println("E:"+maskedEmail);
    }
    
}