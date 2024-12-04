package sample1;

import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat("Vaska", 6,"red");
		Cat cat2 = new Cat("Luska", 2,"black");
		Cat cat3 = new Cat("Umka", 4,"white");
		Cat cat4 = new Cat("Barsic", 8,"grey");
		Cat cat5 = new Cat("Timka", 3,"blue");
		
		List<Cat>list=List.of(cat1, cat2, cat3, cat4, cat5);
	
		 Optional<Cat> result = list.stream()
	                .max((firstcat, secondcat) -> Integer.compare(firstcat.getName().length(), secondcat.getName().length()));
		 result.ifPresent(cat -> System.out.println("Longest name: " + cat.getName()));

	}

}
