import java.io.File;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// ���� ����
		System.out.println("������ �����̸��� �����ÿ�.");
		String fileName = sc.nextLine();
		File file = new File("/Users/jaegu/Desktop/" + fileName);
		
		if(file.exists()) {
			file.delete();
			System.out.println(fileName +"������ ���� �Ǿ����ϴ�.");
		}else{
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		sc.close();
		
		
	}

}
