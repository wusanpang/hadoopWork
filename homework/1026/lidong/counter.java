package Streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list = new ArrayList<String>();
		set<String> set = new HashSet(String);
 		String ip =null;
		while(sc.hasNext()){
			String line= sc.nextLine();
			String[] tokens = line.split("\t");
			if(tokens.length==1)continue;
			String path =tokens[1];
			
			if(tokens[0].equals(ip)){
				/*if(!list.contains(path)){
					list.add(path);					
				}*/
				set.add(path)
			}else{
				if(ip!=null)System.out.println(ip+"\t"+set.size());
				set.clear();
				set.add(path);
				ip=tokens[0];
			}
		}
		if(ip!=null)System.out.println(ip+"\t"+set.size());
		sc.close();
	}
}
