package com.zhul.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo1 {

	public static void main(String[] args) {
		// 文件拷贝
		try {
			FileInputStream fis=new FileInputStream("imooc_file_io/happy.gif");
			FileOutputStream fos=new FileOutputStream("imooc_file_io/happycopy.gif");
			int n=0;
			byte[] b=new byte[1024];
			while((n=fis.read(b))!=-1){
				fos.write(b,0,n);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
