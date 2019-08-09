import java.math.BigInteger;

public class GoogleFoobar3 {

	public static void main(String[] args) {
		//boolean f = StringUtils.isNumeric("123");
		System.out.println(answer("4","7"));
		
	}
	
	public static String answer(String M, String F) { 
        
		BigInteger M_int = new BigInteger(M);
		BigInteger F_int = new BigInteger(F);
		
        BigInteger count = BigInteger.valueOf(0);
        
        while(M_int.compareTo(BigInteger.valueOf(1)) != 0 || F_int.compareTo(BigInteger.valueOf(1)) != 0){
        	
        	if(M_int.multiply(F_int) == BigInteger.valueOf(0)){
        		return "impossible";
        	}
        	else if(M_int.compareTo(F_int) == 1){
        		if(F_int.equals(BigInteger.valueOf(1))){
        			count = count.add( M_int.subtract(F_int));
        			M_int = BigInteger.valueOf(1);
        		}
        		else{
        			count = count.add( M_int.divide( F_int));
        			M_int = M_int.subtract(F_int.multiply((M_int.divide(F_int))));
        			
        		
        		}
        				
        	}else{
        		
        		if(M_int.equals(BigInteger.valueOf(1))){
        			count = count.add(F_int.subtract(M_int));
        			F_int = BigInteger.valueOf(1);
        			
        		}
        		else{
        			count = count.add(F_int.divide(M_int));
        			F_int = F_int.subtract(M_int.multiply((F_int.divide( M_int))));
        			
        	
        		}
        	}
        	
        }
        
        
        String result = "" + count;
        return result;
        

	} 



    
    
}
