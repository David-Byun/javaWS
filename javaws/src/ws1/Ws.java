package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command[q, i, d, s]");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Quit..");
				break;
			} else if(cmd.equals("a1")) {
				// 5~9까지의 숫자를 입력받는다.
				// 입력받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력한다.
				
			} else if(cmd.equals("a2")) {
				System.out.println("5~9까지의 숫자를 입력해주세요");

				// 5~9까지의 숫자를 입력받는다.
				int input = Integer.parseInt(sc.next());

				// 입력받은 숫자만큼 배열을 생성하고
				int[] arr = new int[input];

				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				Random r = new Random();

				for (int i = 0; i < arr.length; i++) {
					arr[i] = r.nextInt(10);
				}

				// 배열 정보를 출력한다.
				System.out.println("배열 정보 출력 : " + Arrays.toString(arr));

				// 짝수번째 숫자들의 합과 평균을 출력한다.
				int sum = 0;
				double avg = 0.0;
				int cnt = 0;
				for (int i = 0; i < arr.length; i++) {
					if (i % 2 != 0) {
						sum += arr[i];
						cnt++;
					}
				}

				System.out.println("짝수번째 숫자들의 합 = " + sum);
				System.out.println("짝수번째 숫자들의 평균 = " + (double) sum / cnt );
				
			} else if(cmd.equals("a3")) {
				// 5~9까지의 숫자를 입력받는다.
				// 입력받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력한다.
				// 짝수 값만의 합과 평균을 출력한다.
				
			} else if(cmd.equals("a4")) {
				// 5~9까지의 수를 2개 입력받는다.
				// 2차원 배열을 만든다.
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력한다.
				
			} else {
				System.out.println("Invalid Command...");
				System.out.println("Try Again.");
			}
		}
		System.out.println("Bye...");
		sc.close();
	}
}
