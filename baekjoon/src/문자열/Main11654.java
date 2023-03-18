package 문자열;
import java.io.IOException;

public class Main11654 {
	// 백준 11654번: 아스키 코드
	// Scanner보다 System.in.read()를 사용해 byte 값으로 문자 한개를 읽는 방법이 더 효율적
	
	public static void main(String[] args) throws IOException {
		
		// Scanner sc = new Scanner(System.in);
		// int c = sc.next().charAt(0);
		
		int c = System.in.read();
		
		System.out.println(c);

	}
}
