package package01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex10Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Account> map = new HashMap<Integer, Account>();
		
		
		while(true) {
			System.out.println("원하시는 서비스 번호를 입력하세요.");
			System.out.println("계좌등록 : 1 | 입금 : 2 | 출금 : 3 | 계좌 정보 : 4 | 종료 : 5 |");
			int num;
			System.out.print("해당번호를 입력하세요 : ");
			try {
				num = sc.nextInt();
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("숫자만 입력해주세요.");
				continue;
			}
			switch (num) {
			case 1:
				System.out.println("계좌등록화면입니다.");
				System.out.print("계좌번호를 입력해 주세요. : ");
				int accNum;
				int money;
				String name;
				try {
					accNum = sc.nextInt();
					System.out.print("초기 입금 금액을 입력하세요 : ");
					money = sc.nextInt();
					sc.nextLine();
					}catch(Exception e) {
						sc.nextLine();
						System.out.println("숫자만 입력해주세요.");
						break;
					}
					System.out.print("계좌주를 입력하세요. : ");
					name = sc.nextLine();
					Account acc = new Account(accNum,money,name);
					map.put(accNum, acc);
				break;
				
			case 2:
				System.out.println("입금화면입니다.");
				System.out.print("입금 계좌를 입력해주세요. : ");
				int accNum1 = sc.nextInt();
				sc.nextLine();
				if(map.containsKey(accNum1)) {
					System.out.print("입금 금액을 입력해주세요. : ");
					money = sc.nextInt();
					sc.nextLine();
					Account acc1 = map.get(accNum1);
					acc1.setDeposit(money);
				}else {
					System.out.println("계좌 번호가 존재하지않습니다.");
				}
				break;
				
			case 3:
				System.out.println("출금화면입니다.");
				System.out.print("출금 계좌를 입력해주세요. : ");
				accNum1 = sc.nextInt();
				sc.nextLine();
				if(map.containsKey(accNum1)) {
					System.out.print("출금 금액을 입력해주세요. : ");
					money = sc.nextInt();
					sc.nextLine();
					Account acc1 = map.get(accNum1);
					acc1.setWithdraw(money);
				}else {
					System.out.println("계좌 번호가 존재하지않습니다.");
				}
				break;
			case 4:
				System.out.println("계좌정보화면입니다.");
				if(map.size() == 0) {
					System.out.println("등록된 계좌가 없습니다.");
				}else {
					for(Integer key : map.keySet()) {
						Account acc1 = map.get(key);
						acc1.print();
					}
				}

				break;
			case 5:
				
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
	
			}
			System.out.println();
		}
	}
}
