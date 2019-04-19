package com.maths;

import java.util.LinkedList;
import java.util.List;

public class Math {
	public static void main(String args[]) {
		System.out.println(factorize(100));
	}

	public static List<Integer> factorize(int number) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i <= number; i++) {
			try {
				if (number % i == 0) {
					list.add(i);
				}
			} catch (Exception e) {
			}
		}
		return list;
	}
}
