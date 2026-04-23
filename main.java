import java.util.*;
public class Main
{
	public static void main(String[] args) {
	List<Integer>list=new ArrayList(Arrays.asList(8,7,6,3,9));
	int left=0;
	int right=list.size()-1;
	while(left<=right){
	        int temp=list.get(left);
	        list.set(left,list.get(right));
	        list.set(right,temp);
	        left++;
	        right--;
	    }
	    for(int num:list){
	        System.out.print(num+" ");
	    }
	}
