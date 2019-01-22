package com.techlab.comparator;

import java.util.*;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String name1 = o1.toString();
		String name2 = o2.toString();
		return name2.compareTo(name1);
	}

}
