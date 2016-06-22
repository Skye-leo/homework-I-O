package com.test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class shuchu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		lujing("D:\\2.txt");
		
		
	
		
	}

		public static void lujing(String path){
			
			File f= new File (path);
			
			String msg="hello java word"; //Ð´ÈëµÄÄÚÈÝ
						
			if(!f.exists()){			
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}							
			}				
				try {
				FileOutputStream fo = new FileOutputStream(f,false);

					fo.write(msg.getBytes());
					
					fo.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
	
	
	

	
}
