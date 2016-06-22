package com.test2;

import java.io.File;
import java.io.IOException;

public class Opfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("D:\\1.txt");
		if(f.exists()){
			System.out.println(f.isFile());
			System.out.println(f.getName());
			//System.out.println(x);
		}
		else
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			
			
	}

}
