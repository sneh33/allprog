package day4;


import java.util.Stack;
public class List_Stack {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack();
		s1.push(12);
		s1.push("sim");
		s1.push("chalk");
		s1.push(424.4f);
	
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1);
	}

}
