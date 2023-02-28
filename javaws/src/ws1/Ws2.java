package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command[q, a1, a2, a3, a4]");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Quit..");
				break;
			} else if(cmd.equals("a1")) {System.out.println("5~9까지의 숫자를 입력해주세요");

				
			} else if(cmd.equals("a4")) {

				// 5~9까지의 수를 2개 입력받는다.
			    System.out.println("5~9까지의 수 1개를 입력하세요.");	
				int num1 = Integer.parseInt(sc.next());
				System.out.println("5~9까지의 수 1개를 입력하세요.");	
				int num2 = Integer.parseInt(sc.next());
				
				// 2차원 배열을 만든다.
				int arr[][] = new int[num1][num2];
				Random r = new Random();
				
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				for(int i=0; i<arr.length; i++) {             
					for(int j=0; j<arr[i].length; j++) {      
						arr[i][j] = r.nextInt(9)+1;
					}
				}
				
				// 배열 정보를 출력한다.
				System.out.println(Arrays.deepToString(arr));
				
				// 배열의 합과 평균을 출력한다.
			    int sum4 = 0;
				double avg4 = 0.0;
	
				for(int i=0; i<arr.length; i++) {             
					for(int j=0; j<arr[i].length; j++) {
						sum4 += arr[i][j];
					}
					avg4 = (sum4*1.0) / (num1*num2);
					}
					System.out.printf("sum = %d, avg = % 4.2f \n", sum4, avg4);	
				} 
					
			else {
				System.out.println("Invalid Command...");
				System.out.println("Try Again.");
			}
		}
		System.out.println("Bye...");
		sc.close();
	}
}