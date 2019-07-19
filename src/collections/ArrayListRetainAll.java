package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRetainAll {

	public static void main(String[] args) {
		List<Integer> li1=new ArrayList<Integer>();
		List<Integer> li2=new ArrayList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li2.add(100);
		li2.add(200);
		li2.add(300);
		li2.add(10);		
		System.out.println(""+li1);
		System.out.println(""+li2);
		li2.retainAll(li1);
		System.out.println(li2);
		
	}

	}

