import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		
		
		Student std = new Student("12345","김재구");
		map.put("j1", std);
		
		std = new Student("123445","김재구2");
		map.put("j2", std);
		
		std = new Student("1234235","김재구3");
		map.put("j3", std);
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 : ");
		String uId = sc.nextLine();
		
		if(map.containsKey(uId)) {
			Student std1 = map.get(uId);
			System.out.print("비밀번호를 입력해주세요 : ");
			String uPw = sc.nextLine();
			if(std1.userPw.equals(uPw)) {
				System.out.println("로그인 되었습니다.");
				break;
			}else {
				System.out.println("비밀번호가틀렸습니다.");
			}

		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
	}
	}
}
