import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestSubString {

	public static void main(String[] args){
		String mainString= "I am from <Pune> City";
		
		char[] charM= mainString.toCharArray();
		String rexEx = "<(.*?)>";
		Pattern p = Pattern.compile(rexEx);
		Matcher m = p.matcher(mainString);
		m.find();
		System.out.println(m.group(1));
		
		for(char c:charM){
			//System.out.println(c+"\n");
			if(c=='<'){
				
			}
			
		}
		
		
	}
	
}
