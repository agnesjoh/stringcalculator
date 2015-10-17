package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){

			if(text.isEmpty()){

				return 0;
			}
			String[] numbers = splitNumbers(text);
			int count = 0;
			
			if(text.contains("-")){
				
				String message = "Negatives not allowed: ";
				for(int i = 0; i < numbers.length; i++){
					
					if(numbers[i].contains("-")){
						
						if(count == 0){
							message += numbers[i];
							count++;
							
						}
						else {
							message += ',' + numbers[i];
						}
						
					}
					
				}
				throw new IllegalArgumentException(message);
				
			}

			
			
			int result = sum(numbers);

			return result;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){

			if(numbers.contains("//[")){

			String[] temp = numbers.split("\n");
			int length = temp[0].indexOf(']');
			String delimeters = temp[0].substring(3, length);
			String res = "";
			for(int i = 0; i < delimeters.length(); i++){
				
				res += "\\" + delimeters.substring(i, i+1);
				
			}

		    return temp[1].split(res);
		}

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

        	int temp = toInt(number);

        	if(temp <= 1000){

		   	 total += temp;
		   	}

		}
		return total;
    }
}