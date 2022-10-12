package day4MavenActivity.Maven_Project_Activity;
import java.util.*;
public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(1, "JAVA");
		map.put(2, ".NET");
		map.put(3, "SAP");
		map.put(4, "SALESFORCE");
		for(Map.Entry m1:map.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		System.out.println("Descending Map:"+map.descendingMap());
	}

}
