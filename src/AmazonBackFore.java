import java.util.List;
import java.util.*;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class AmazonBackFore
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> optimalUtilization(
	                        int deviceCapacity, 
                            List<List<Integer>> foregroundAppList,
                            List<List<Integer>> backgroundAppList)
	{
        int max = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> fore : foregroundAppList){
            int foreIndex = fore.get(0);
            int foreValue = fore.get(1);
            for(List<Integer> back : backgroundAppList){
                int backIndex = back.get(0);
                int backValue = back.get(1);
                if (foreValue+backValue <= deviceCapacity && foreValue+backValue >= max){
                    if(foreValue+backValue > max){
                        ans.clear();
                    }
                    max = foreValue+backValue;
                    List<Integer> temp = new ArrayList<>();
                    temp.add(foreIndex);
                    temp.add(backIndex);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
    // METHOD SIGNATURE ENDS
}