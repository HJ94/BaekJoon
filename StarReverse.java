package app;

import java.util.Scanner;

public class StarReverse {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=num; j++) {
				
				if(i>j) {
					System.out.print(" ");
				}else{
						System.out.print("*");
					}
				
			}System.out.println();
			
			}
		}
	}

