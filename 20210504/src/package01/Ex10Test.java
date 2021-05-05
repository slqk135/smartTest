package package01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex10Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Account> map = new HashMap<Integer, Account>();
		
		
		while(true) {
			System.out.println("���Ͻô� ���� ��ȣ�� �Է��ϼ���.");
			System.out.println("���µ�� : 1 | �Ա� : 2 | ��� : 3 | ���� ���� : 4 | ���� : 5 |");
			int num;
			System.out.print("�ش��ȣ�� �Է��ϼ��� : ");
			try {
				num = sc.nextInt();
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���.");
				continue;
			}
			switch (num) {
			case 1:
				System.out.println("���µ��ȭ���Դϴ�.");
				System.out.print("���¹�ȣ�� �Է��� �ּ���. : ");
				int accNum;
				int money;
				String name;
				try {
					accNum = sc.nextInt();
					System.out.print("�ʱ� �Ա� �ݾ��� �Է��ϼ��� : ");
					money = sc.nextInt();
					sc.nextLine();
					}catch(Exception e) {
						sc.nextLine();
						System.out.println("���ڸ� �Է����ּ���.");
						break;
					}
					System.out.print("�����ָ� �Է��ϼ���. : ");
					name = sc.nextLine();
					Account acc = new Account(accNum,money,name);
					map.put(accNum, acc);
				break;
				
			case 2:
				System.out.println("�Ա�ȭ���Դϴ�.");
				System.out.print("�Ա� ���¸� �Է����ּ���. : ");
				int accNum1 = sc.nextInt();
				sc.nextLine();
				if(map.containsKey(accNum1)) {
					System.out.print("�Ա� �ݾ��� �Է����ּ���. : ");
					money = sc.nextInt();
					sc.nextLine();
					Account acc1 = map.get(accNum1);
					acc1.setDeposit(money);
				}else {
					System.out.println("���� ��ȣ�� ���������ʽ��ϴ�.");
				}
				break;
				
			case 3:
				System.out.println("���ȭ���Դϴ�.");
				System.out.print("��� ���¸� �Է����ּ���. : ");
				accNum1 = sc.nextInt();
				sc.nextLine();
				if(map.containsKey(accNum1)) {
					System.out.print("��� �ݾ��� �Է����ּ���. : ");
					money = sc.nextInt();
					sc.nextLine();
					Account acc1 = map.get(accNum1);
					acc1.setWithdraw(money);
				}else {
					System.out.println("���� ��ȣ�� ���������ʽ��ϴ�.");
				}
				break;
			case 4:
				System.out.println("��������ȭ���Դϴ�.");
				if(map.size() == 0) {
					System.out.println("��ϵ� ���°� �����ϴ�.");
				}else {
					for(Integer key : map.keySet()) {
						Account acc1 = map.get(key);
						acc1.print();
					}
				}

				break;
			case 5:
				
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
	
			}
			System.out.println();
		}
	}
}
