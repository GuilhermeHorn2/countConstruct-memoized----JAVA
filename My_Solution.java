package misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    private static HashMap<String,Integer> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		String t = "abcdef";
		String [] w = {"ab","abc","cd","def","abcd"};
		System.out.println(countConstruct(t,w));
		
		
	}
	
	private static int countConstruct(String t,String []w) {
		//T:TARGET
		//W:WORDBANK
		
		//Its basically count_how_construct or recursive staircase,but you have to check if the word in w is a prefix
		
		if(t.equals("")) {
			return 1;
		}
		if(cache.containsKey(t)) {
			return cache.get(t);
		}
		int count = 0;
		for(int i = 0;i < w.length;i++) {
            if(t.startsWith(w[i])) {
            	String r = t.replaceFirst(w[i],"");
            	count += countConstruct(r,w);
            }
			}	
		cache.put(t,count);
		return count;
		
	}
    
	
	
	
	
	}
	
	
	
	

	


	
	

	
		
	
	


	

	
	

