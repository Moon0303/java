package cmm04.array;

import java.util.Scanner;

public class No06_ArryGugudanDemo2 {
	public static void main(String[] args) {

		int dan = 2;
		int i = 1;

		for (i = 1; i < 10; i++) {
			System.out.println("");
			for (dan = 2; dan < 6; dan++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
		}

		System.out.println("");
		
		for (i = 1; i < 10; i++) {
			System.out.println("");
			for (dan = 6; dan < 10; dan++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
		}

	}
	
}


