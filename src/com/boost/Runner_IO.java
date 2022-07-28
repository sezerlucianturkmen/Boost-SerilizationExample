package com.boost;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Runner_IO {

	static String filename = "hataLog.txt";
	static String mesaj = null;

	public static void main(String[] args) {
		try {
			mesaj.charAt(0);
		} catch (Exception ex) {
			
			try {
				FileOutputStream fl=new FileOutputStream(filename);
				ObjectOutputStream oj = new ObjectOutputStream(fl);
				oj.writeObject(new Log(ex.toString(),));
				
				
				
				
				/*File file=new File(filename);
				BufferedWriter bf=new BufferedWriter(null) 
				*/
			} catch (Exception e2) {
				
			}
		}

	}//

}//
