package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2839 {
	// 백준 2839번: 설탕 배달
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int suga = Integer.parseInt(br.readLine());
		int cnt = -1, i = 0;
		
		while(true) {
			if(suga < 0){
				break;
			}
			else if(suga == 0) {
				cnt = i;
				break;
			}
			else if(suga <= 12 && suga % 3 == 0) {
				cnt = suga/3 + i;
				break;
			}
			suga -= 5;
			i++;
		}
		System.out.println(cnt);
	}
}
