import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestGroup {
	
	public static void test1(){
		String str = "(+ 1 2 (+ 2 2 ))";
		Pattern p = Pattern.compile("\\((.*?)\\)");
		Matcher m = p.matcher(str);
		m.find();
		System.out.println(m.group());
		System.out.println(m.group(1));
		System.out.println(m.groupCount());
	}
	
	public static void main(String[] argv){
		System.out.println("Test on...");
		TestGroup.test1();
	}
}
