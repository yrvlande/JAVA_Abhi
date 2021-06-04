package javaRevision2017.javaIO.filesClassOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

public class FilesClassAndMethod {
	
	public static void main(String args[]) {
		
		Path p1 = Paths.get("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\filesClassOperation\\sourceFile.txt");
		System.out.println(p1.getFileName());
		System.out.println(p1.getParent());
		System.out.println(p1.getRoot());
		
		 Set<PosixFilePermission> perms = new HashSet<>();
		    // add permission as rw-r--r-- 644
		    perms.add(PosixFilePermission.OWNER_WRITE);
		    perms.add(PosixFilePermission.OWNER_READ);
		    perms.add(PosixFilePermission.GROUP_READ);
		    perms.add(PosixFilePermission.OTHERS_READ);
		    FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(perms);
		
		    File f1= new File("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\filesClassOperation\\targatFile.txt");
		Path p2 = Paths.get("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\filesClassOperation\\t.txt");
		    try {
				f1.createNewFile();
				//Files.createFile(p2);
				//Files.copy(new FileInputStream(p1.toString()), p2);
				//System.out.println(f1.getAbsolutePath());
				//System.out.println(f1.getCanonicalPath());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    BufferedReader buffReader=null;
		    StringBuilder sBuilder = new StringBuilder();
		    
		    try {
				 buffReader = new BufferedReader(new FileReader(p1.toFile()));
				
				String s;
				while((s=buffReader.readLine())!=null) {
					sBuilder.append(s);
					sBuilder.append("\n");
					}
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    finally {
		    	try {
					buffReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		    
		    System.out.println(sBuilder);
		    
		    
		}

}
