package com.arraystring.countcharacter;

public class CountChar {
	static String countChar(String s){
		if(s == null || s.length()<2){
			return s;
		}
		char slow = s.charAt(0);
		String result = "";
		int count = 1;
		for(int i = 1;i<s.length();i++){			
			char c = s.charAt(i);
			if(c == slow){
				count ++;
			} else{
				result += "" + slow + count;
				if(result.length()>=s.length()){
					return s;
				}
				slow = c;
				count = 1;
			}
		}
		result += "" + slow + count;
		return result;
	}
	
	public static void main(String[] args){
		String s = "aaaaaaaaabbbbbbbbbbccccccccc";
		System.out.println(CountChar.countChar(s));
	}
}
