package javaRevision2017.javaIO.filesClassOperation;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

public class CopyOperation {
	
	public static void main(String args[]) throws IOException {
		
		
		Path p1 = Paths.get("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\filesClassOperation\\sourceFolder\\sourceFile.txt");
		Path p2 = Paths.get("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\filesClassOperation\\targetFolder\\targetFile.txt");
		
		Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING);
		Set<PosixFilePermission> values = Files.getPosixFilePermissions(p2, LinkOption.values());
		System.out.println(values);
	
	}

}
