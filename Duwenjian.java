package com.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Duwenjian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:\\form.txt");
		
		if(f.exists()){
				//��Ϣ�Ķ�ȡ����
			try {
				FileInputStream fi=new FileInputStream(f);
				//������
				int num=(int)f.length();
				byte [] b=new byte[num];
				fi.read(b);
				
				String str= new String(b);
				System.out.println(str);
				
////				char c=(char)fi.read();
////				System.out.println(c);
//				int i=0;
//				while((i=fi.read())!=-1){
//					char c=(char)i;
//					System.out.print(c);
//				}
				
				
				//�ر�������
				fi.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("�������·����������������");
		}
	
	
	
	
	
	
	
	
	
	}

}
