//U10416019鄭文琪

import java.security.SecureRandom;
import java.util.ArrayList;

public class RepeatAdditionQuiz{
	//data field
	private SecureRandom random = new SecureRandom();
	private int number1 = random.nextInt(10);
	private int number2 = random.nextInt(10);
	private ArrayList<Integer> answerList = new ArrayList<>();
	
	//create an empty constructor
	RepeatAdditionQuiz(){
	}
		
	//create a mutator of addAnswerList to input the answer of all the user input
	void setAddAnswerList(int answer){
		answerList.add(answer);
	}
		
	//create a accessor to calculate and return the answer of the multiplication
	public int getAnswerCheck(){
		return (number1 * number2);
	}
	
	//create a accessor of number1 to return number1
	public int getNumber1(){
		return number1;
	}
	
	//create a accessor of number2 to return number2
	public int getNumber2(){
		return number2;
	}

}