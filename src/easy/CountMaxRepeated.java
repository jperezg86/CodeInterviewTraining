package easy;
import java.util.HashMap;

public class CountMaxRepeated {

	public static void main(String[] args) {
		System.out.println(most_frequent(new int[] {4,4,4,8,8,8,8,8,8,8,8,8,8,8,8,9,2,1,4,2,4,4,4,4,4,4,4,4,4,2,2,2,2,2,2,2,2,2,2,2,2,2,2}));
	}
	
	
	public static int most_frequent(int input[]) {
		int mostFrequent = 0;
		int max = 0; 
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<input.length; i ++) {
			int item=input[i];
			if(map.containsKey(item)) {
				map.put(item, map.get(item) + 1);
				int tmp = map.get(item);
				if(tmp > max) {
					max = tmp;
					mostFrequent = (map.get(item).intValue() > map.get(mostFrequent).intValue()) ? item : mostFrequent;
				}
			}else {
				max = 1;
				map.put(item,max); 
				if(!map.containsKey(mostFrequent)) {
					mostFrequent = item;
				}
			}
		}
		
		return mostFrequent;
	}
	
	

}
