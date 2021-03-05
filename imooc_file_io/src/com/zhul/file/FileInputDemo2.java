package com.zhul.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {

	public static void main(String[] args) {
		// 创建一个FileInputStream对象
		try {
			FileInputStream fis = new FileInputStream("imooc_file_io/imooc.txt");
			byte[] b=new byte[100];
			fis.read(b);
			System.out.println(new String(b));
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
