package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){

			if(text.isEmpty()){

				return 0;
			}

			String[] numbers = splitNumbers(text);
			int result = sum(numbers);

			return result;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){

		if(numbers.contains("//")){

		String[] temp = numbers.split("\n");
		String delimeters = temp[0].substring(2);


	    return temp[1].split(delimeters);
	}

		return numbers.split("[, \n]");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }

}