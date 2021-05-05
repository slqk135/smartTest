import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일을 적어주세요. : ");
		String fileName = sc.nextLine();
		FileWriter fw = null;
		try{
			fw = new FileWriter("/Users/jaegu/Desktop" + fileName);
			System.out.println("입력내용을 적어주세요 : ");
			String msg = sc.nextLine();
			fw.write(msg);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				}catch(IOException e) {}
			}
		}
		
	}

}
