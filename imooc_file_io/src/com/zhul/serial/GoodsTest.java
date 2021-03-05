package com.zhul.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GoodsTest {

	public static void main(String[] args) {
		// 定义Goods类的对象
		Goods goods1 = new Goods("gd001", "电脑", 3000);
		try {
			FileOutputStream fos = new FileOutputStream("imooc_file_io/imooc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("imooc_file_io/imooc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// 将Goods对象信息写入文件
			oos.writeObject(goods1);
			oos.writeBoolean(true);
			oos.flush();
			// 读对象信息
			try {
				Goods goods = (Goods) ois.readObject();
				System.out.println(goods);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(ois.readBoolean());

			fos.close();
			oos.close();
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
