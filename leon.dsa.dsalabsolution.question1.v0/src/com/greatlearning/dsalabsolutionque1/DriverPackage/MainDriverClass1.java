package com.greatlearning.dsalabsolutionque1.DriverPackage;

import java.util.Stack;

public class MainDriverClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString="([[{}]])";
//		String inputString="([[{}]]))";
		boolean unBalanced=false;
		Stack<Character>  stack=new Stack<>();
		
	breakFor:	
		for(int i=0; i<inputString.length(); i++) {
			char ch=inputString.charAt(i);
			
			switch(ch) {
			case '(':
			case '{':
			case '[':
				stack.push(ch);
				continue;
			case ')':
				if(stack.empty() || (stack.pop()!='(')) {
					unBalanced=true;
					break breakFor;
				}
				continue;
			case '}':
				if(stack.empty() || (stack.pop()!='{')) {
					unBalanced=true;
					break breakFor;
				}
				continue;
			case ']':
				if(stack.empty() || (stack.pop()!='[')) {
					unBalanced=true;
					break breakFor;
				}
				continue;
			}
		}
		if (unBalanced || !stack.empty()) {
			System.out.println("String is unbalanced");
		} else {
			System.out.println("String is balanced");
		}

	}

}
