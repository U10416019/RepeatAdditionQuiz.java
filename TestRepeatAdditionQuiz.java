//U10416019鄭文琪

import java.util.Scanner;

public class TestRepeatAdditionQuiz{
	public static void main(String[] args){
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//create a variable repeat to all the constructor of RepeatAdditionQuiz
		RepeatAdditionQuiz repeat = new RepeatAdditionQuiz();
		
		//print the question let the user enter the answer
		System.out.print("What is " + repeat.getNumber1() + " x " + repeat.getNumber2() + " ? ");
		int answer = input.nextInt();
		
		//if the answer is wrong then entire this loop
		while(repeat.getAnswerCheck() != answer){
			//add the wrong answer in the answerList(ArrayList)
			repeat.setAnswerList(answer);
			repeat.setAddAnswerList(answer);

			//print the message to tell the user the answer is wrong
			System.out.print("Wrong answer.  Try again. What is " + repeat.getNumber1() + " x " + repeat.getNumber2() + " ? ");
			answer = input.nextInt();
		}
	
		//if the answer is true then print the message answer to tell the user whose answer is true
		System.out.println("You get it !");
	}
}