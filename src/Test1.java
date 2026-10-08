import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	

	public static void main(String[] args) {
		
		
		ArrayList <String> names =  new ArrayList<String>();
		//names.add("Kapil");
		names.add("Rahul");
		names.add("Rohit");
		//names.add("Rakshit");
		names.add("Roshan");
		names.add("Aman");
		names.add("Arun");
		names.add("Rupal");
		names.add(6, "Rose");
		ArrayList <String> name1 =  new ArrayList<String>();
		name1.add("Goswami");
		name1.add("Giri");
		//name1.add("Puri");
		name1.add("Bharti");
		name1.add("Gosai");
		name1.add("Ban");
		name1.add("Sharma");
		name1.add("Chaudhary");
		
		
		names.stream().filter(s -> s.startsWith("R")).forEach(s -> System.out.println(s));
		System.out.println(names);
		System.out.println(name1);
		//names.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.contains("o")).map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.startsWith("R")).map(s -> s.toUpperCase()).sorted().forEach(s -> System.out.println(s));
		
		Stream <String> nameAll = Stream.concat(names.stream(), name1.stream());
		System.out.println(nameAll);
		//nameAll.sorted().forEach(s -> System.out.print(" " + s));
		
		Assert.assertTrue(nameAll.anyMatch(s-> s.equalsIgnoreCase("Rupal")));
		
		
		
	}

}
