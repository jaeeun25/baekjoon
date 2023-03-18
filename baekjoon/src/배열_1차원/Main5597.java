package 배열_1차원;
import java.util.Scanner;

public class Main5597 {
	// 백준 5597번: 과제 안 내신 분..?
	// boolean 배열로 과제 낸 사람 true로 변경 후 나중에 for로 false 찾는 방법도 가능

	public static void main(String[] args) {
		
		int[] number = new int[28];
		int[] rest = new int[2];
		int k = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 28; i++)
			number[i] = sc.nextInt();
		
		
		num:for(int j = 1; j<=30; j++) {
			for(int n : number) {
				if(n == j)continue num;
			}
			rest[k++] = j;
		}
		
		if(rest[0] > rest[1]) {
			int temp = rest[0];
			rest[0] = rest[1];
			rest[1] = temp;
		}
		
		System.out.println(rest[0]);
		System.out.println(rest[1]);
		
		sc.close();
		
	}
}
