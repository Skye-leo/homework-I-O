package com.test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
	
	public static void output(File f,String string){
		
		try {
			FileOutputStream fo= new FileOutputStream(f,true);
			
			fo.write(string.getBytes());
			
			fo.close();;
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
