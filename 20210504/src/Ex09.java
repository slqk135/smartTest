import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		
		
		Student std = new Student("12345","���籸");
		map.put("j1", std);
		
		std = new Student("123445","���籸2");
		map.put("j2", std);
		
		std = new Student("1234235","���籸3");
		map.put("j3", std);
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է����ּ��� : ");
		String uId = sc.nextLine();
		
		if(map.containsKey(uId)) {
			Student std1 = map.get(uId);
			System.out.print("��й�ȣ�� �Է����ּ��� : ");
			String uPw = sc.nextLine();
			if(std1.userPw.equals(uPw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			}else {
				System.out.println("��й�ȣ��Ʋ�Ƚ��ϴ�.");
			}

		}else {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}
		
	}
	}
}
