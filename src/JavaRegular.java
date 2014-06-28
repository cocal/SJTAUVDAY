

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
	
	
	public static void testRex(String desStr, String pattern){
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
	}
	public static void main(String[] argv){
		//run
		String[] testStr = {"Abka","Jpad","Bc"};
		for(String s : testStr){
			JavaRegular.testRex(s,"^Ab");
		}
	}
}
