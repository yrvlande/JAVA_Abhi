package FileOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	public static BufferedWriter bwr;
	public static BufferedReader brr;
	public static  void main(String[] args) throws IOException{
		String path="C:/DDrive/Java_programs/Eclipse/Workspace/MyPrograms/FilesFromCode/MainDir";
		File f = new File(path);
		try {
			if(!f.isDirectory())
			f.mkdir();
			
		    f= new File(path+"/YashText.txt");
		    f.createNewFile();
			
//			f.createNewFile();
//			System.out.println(f.getCanonicalPath());
//			System.out.println(f.getAbsolutePath());
//			System.out.println(f.getName());
//			System.out.println(f.getFreeSpace());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(f.exists()){
		try {
			bwr = new BufferedWriter(new FileWriter(f));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuffer sb= new StringBuffer();
		sb.append("Hello This is Sungard Report");
		sb.append(System.getProperty("line.separator"));
		sb.append("Hello This is Final Sungard Report");
		try {
			bwr.write(sb.toString());
			bwr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			brr=new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String s;
			while((s=brr.readLine())!=null){
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		
		
		
		}
	}
