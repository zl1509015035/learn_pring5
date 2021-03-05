package com.zhul.sort;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat>{

	@Override
	public int compare(Cat o1, Cat o2) {
		// 按年龄降序排序
		int age1=o1.getMonth();
		int age2=o2.getMonth();
		if(age2-age1==0){
			return o1.getName().compareTo(o2.getName());
		}
		return age1-age2;
	}

}
