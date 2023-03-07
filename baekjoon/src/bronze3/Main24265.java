package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main24265 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		System.out.println();
		System.out.println(2);
		
	}
}
/*
(n+2)
n=3
i=1 -> j = 2,3
i=2 -> j = 3
3

n=5
i=1 -> j = 2,3,4,5
i=2 -> j = 3,4,5
i=3 -> j = 4,5
i=4 -> j = 5
10


n=6
i=1 -> j = 2,3,4,5,6(5)n-1
i=2 -> j = 3,4,5,6(4)n-2
i=3 -> j = 4,5,6(3)n-3
i=4 -> j = 5,6(2)n-4
i=5 -> j = 6(1)n-5
15 n*3 - 3

n=7
i=1 -> j = 2,3,4,5,6,7
i=2 -> j = 3,4,5,6,7
i=3 -> j = 4,5,6,7
i=4 -> j = 5,6,7
i=5 -> j = 6,7
i=6 -> j = 7
21 n* 3
*/