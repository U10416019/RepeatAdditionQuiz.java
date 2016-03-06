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

}