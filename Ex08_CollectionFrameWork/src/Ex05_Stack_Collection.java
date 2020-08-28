import java.util.Stack;

import kr.or.bit.Coin;
import kr.or.bit.MyStack;

public class Ex05_Stack_Collection {
	public static void main(String[] args) {
		//JAVA API stack 자료 구조 제공
		
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.empty());
		
		MyStack my = new MyStack(5);
		System.out.println(my.full());
		my.push(10);
		my.push(20);
		my.push(30);
		System.out.println(my.full());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		
		System.out.println(my.pop());
		
		//동전박스
		Stack<Coin> coinbox = new Stack<Coin>();
		coinbox.add(new Coin(100));
		coinbox.add(new Coin(50));
		coinbox.add(new Coin(500));
		coinbox.add(new Coin(10));
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("동전 : " + coin.getValue() + "원");
		}
	}
}
