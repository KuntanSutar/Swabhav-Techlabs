package com.techlab.comparator;

import java.util.*;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String name1 = o1.toString();
		String name2 = o2.toString();
		int length1 = name1.length();
		int length2 = name2.length();
		return length1>length2? 1:-1;
	}

}
