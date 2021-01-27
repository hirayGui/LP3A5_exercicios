import java.util.List;
import java.util.Arrays;

public class Java8LambdaStream {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4);

		asList.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

//		for(Integer integer : asList)
//			System.out.println(integer);
	}

}
