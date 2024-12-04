package sample2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(1,0,-4,6,5,3,-7,9);
		
		List<Integer>resultList=list.stream()
				.filter(n->n%2!=0)
				.sorted() 
				.collect(Collectors.toList());
		System.out.println(resultList);
	}

}
