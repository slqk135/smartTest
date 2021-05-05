import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		List<Integer> lotto = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 장수를 입력하세요 : ");
		int cnt = sc.nextInt();
		
		for(int a = 0; a < cnt; a++) {
			for(int i = 1; i <=45; i++) {
				lotto.add(i);
			}
			
			int[] num = new int[6];
			
			for(int i=0; i<num.length; i++) {
				int idx = (int)(Math.random() * lotto.size());
				num[i] = lotto.get(idx);
				lotto.remove(idx);
			}
			
			Arrays.sort(num);
			
			for(Integer lottoNum : num) {
				
				System.out.print(lottoNum + " ");
			}
			System.out.println();
		
		}
	}
}
