package poj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 企业电话号码转换
 * @author cocal
 *
 */
public class poj1002 {
	static int  mapDict[] = {2,2,2,3,3,3, 4,4,4, 5,5,5, 6,6,6, 7,-1,7,7, 8,8,8, 9,9,9,-1};
	static Map<String,Integer> phonesAndNum = new HashMap<String,Integer>();
	
	public static String StandNos(String phoneNo){
		String standPhone = "";
		char[] val = phoneNo.toCharArray();
		for( int i=0; i<phoneNo.length(); i++){
			if(standPhone.length() == 3)
				standPhone += "-";
			char temp = val[i];
			if (temp >= '0' && temp <= '9')
				standPhone += temp;
			else if(temp >= 'A' && temp <= 'Z'){
				int k = mapDict[temp - 'A'];
				standPhone += k;
			}else
				continue;
			/*if(temp.matches("[0-9]"))
				standPhone += temp;
			else if(temp.matches("//w//W")){
				char[] token = temp.toCharArray();
				int k = mapDict[token[0] - 'A' + '0'];
				standPhone += k;
			}else
				continue;*/		
		}
		return standPhone;
	}
	
	public static void main(String args[]) {
		System.out.println(StandNos("123-AB"));
		Scanner cin = new Scanner(System.in);
		int count = cin.nextInt();
		for(int k=0 ; k<count ; k++){
			String temp = cin.nextLine();
			temp = StandNos(temp);
			if(phonesAndNum.containsKey(temp)){
				Integer m = phonesAndNum.get(temp);
				phonesAndNum.put(temp, ++m);
			}else
				phonesAndNum.put(temp, 1);			
		}
		
		for(String str : phonesAndNum.keySet()){
			System.out.println(str + " " + phonesAndNum.get(str));//缺少 按 val值排序
		}
	}
}
