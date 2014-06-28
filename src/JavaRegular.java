

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/****
 * 学好正则表达式 走遍天下都不怕。
 * @author cocal
 *
 */
public class JavaRegular {
	
	/**
	 * 开头字母
	 */
	private static void test1(String desStr){
		System.out.println("Str : " +  desStr);
		String rex = "[ABC]";
		Pattern p = Pattern.compile(rex);
		Matcher m = p.matcher(desStr);
		if(m.find()){
			System.out.println("Done!");
		}else{
			System.out.println("HEHE");
		}
	}
	
	
	/*public static void testRex(String pattern,String desStr){
		String info = String.format("desStr : [%s] || rex : [%s]", desStr,pattern);
		System.out.println(info);
		String rex = pattern;
		Pattern p = Pattern.compile(rex);
		Matcher m = p.matcher(desStr);
		if(m.find()){
			System.out.println("Done!");
		}else{
			System.out.println("HEHE");
		}
	}*/
	public static void testRex(String pattern,String... desStr){
	//	String info = String.format("desStr : [%s] || rex : [%s]", desStr,pattern);
		//System.out.println(info);
		System.out.println("\n---new Test");
		String rex = pattern;
		Pattern p = Pattern.compile(rex);
		for(String s : desStr){
			String info = String.format("desStr : [%s] || rex : [%s]", s,pattern);
			System.out.println(info);
			Matcher m = p.matcher(s);
			if (m.find()) {
				System.out.println("Done!");
			} else {
				System.out.println("HEHE");
			}
		}
	}
	public static void main(String[] argv){
		//run
		System.out.println("^ 以什么开头 ---居然能匹配'\\n'");
		String[] testStr = {"Abka","Jpad","Bc"};
		for(String s : testStr){
			JavaRegular.testRex("^Ab",s);
		}
		
		System.out.println(" *匹配前面的子表达式零次或者多次  ");
		testRex("a*","aa","cc","()");
		testRex("a+","aa","cc","()");
		
		testRex("\\(\\+ \\d \\d\\)+", "(+ 1 2 9)");
	}
}
