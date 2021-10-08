package week1.day2;

import java.util.Arrays;

public class ReverseEvenWordsInString {

	public static void main(String[] args) {
			String test="welcome to test leaf";
			String[] str = test.split(" ");
			
			for (int i = 0; i < str.length; i++) {
				
				if (i%2==0) {
					System.out.print(" ");
					System.out.print(str[i]);
				}
				if(i%2!=0) {
					System.out.print(" ");
					char[] evenWord= str[i].toCharArray();
					for (int j=(evenWord.length)-1; j>=0; j--) {
						System.out.print(evenWord[j]);
					}
					
				}
				
			}
	}
}
