package qmx.dailyinterview;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		l1.add(9);
		l1.add(7);
		l1.add(9);
		l1.add(9);
		
		for(int i = l1.size() -1 ; i >= 0;i--) {
			System.out.print(l1.get(i));
		}
		System.out.println();
		System.out.println("===");

		l2.add(9);
		l2.add(9);
		l2.add(9);
		for(int i = l2.size() - 1; i >= 0 ;i--) {
			System.out.print(l2.get(i));
		}
		System.out.println();
		System.out.println("===");
		int[] res = addList(l1,l2);
		for(int i = res.length - 1; i >= 0 ;i--) {
			System.out.print(res[i]);
		}
	}
	
	public static int[] addList(List ll1, List ll2) {
		int[] result ;
		int extra = 0;
		int lenght = ll1.size()> ll2.size() ? ll1.size():ll2.size();
		result = new int[lenght+1];
		for(int i = 0; i <= lenght - 1 ; i++) {
			if (i < ll1.size() && i < ll2.size() ) {
				int temp = (int)ll1.get(i) + (int)ll2.get(i);
				if( temp + extra  < 10) {
					result[i] = temp + extra;
					extra = 0;
					
				}
				else {
					result[i] = extra + temp%10;
					extra = temp/10;
				}
				
			}
			else if(i < ll1.size() && i > ll2.size()) {
				result[i] =  (int)ll1.get(i);
			}
			else if(i > ll1.size() && i < ll2.size()) {
				result[i] =  (int)ll2.get(i);
			}
		}
		if (extra > 0){
			result[lenght]= extra;
		}
		
		
		return result;
		
	}

}
