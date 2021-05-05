import java.io.File;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 파일 삭제
		System.out.println("삭제할 파일이름을 적으시오.");
		String fileName = sc.nextLine();
		File file = new File("/Users/jaegu/Desktop/" + fileName);
		
		if(file.exists()) {
			file.delete();
			System.out.println(fileName +"파일이 삭제 되었습니다.");
		}else{
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		sc.close();
		
		
	}

}
