package javaPackage;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhiteSpace {

	public static void main(String[] args) throws IOException{
	
		
			File file = new File("E:\\input.txt");
		      FileInputStream fn = new FileInputStream(file);
		      InputStreamReader input = new InputStreamReader(fn);
		      BufferedReader reader = new BufferedReader(input);
		      String sentence;
		      // Initializing counters
		      int countWord = 0,whitespaceCount = 0;
		      if((sentence= reader.readLine()) != null) {
		         String[] wordlist = sentence.split("\\s+");
		         countWord += wordlist.length;
		         whitespaceCount += countWord -1;
		      }
		      System.out.println(" Number of whitespaces = " + whitespaceCount);
		      
		      File fileOut = new File("E:\\output.txt");
		      FileOutputStream o = new FileOutputStream(fileOut);
		      DataOutputStream output = new DataOutputStream(o);
		      output.writeInt(whitespaceCount);
		      
		}

	}

