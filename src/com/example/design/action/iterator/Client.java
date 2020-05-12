package com.example.design.action.iterator;

public class Client {

	public static void main(String[] args) {
		MyAggregate	cma = new ConcreteMyAggregate();
		cma.add("aaa");
		cma.add("bbb");
		cma.add("ccc");
		
		MyIterator iterator = cma.getIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.getCurrentObj());
			iterator.next();
		}
	}
}
