package com.codewardev;

import java.util.Stack;

// https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java

public class TenMinWalk {

	public static boolean isValid(char[] walk) {
		if(walk.length != 10) return false;
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<walk.length; i++) {
			if(walk[i] == 'n' && stack.contains('s')) {
				stack.remove(stack.indexOf('s'));
			} else
			if(walk[i] == 's' && stack.contains('n')) {
				stack.remove(stack.indexOf('n'));
			} else
			if(walk[i] == 'w' && stack.contains('e')) {
				stack.remove(stack.indexOf('e'));
			} else
			if (walk[i] == 'e' && stack.contains('w')) {
				stack.remove(stack.indexOf('w'));
			} else {
				stack.push(walk[i]);
			}
		}
		
		return stack.size() == 0 ? true:false;
	}

}
