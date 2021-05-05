import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			System.out.print("파일 이름을 적어주세요 : ");
			String str = sc.nextLine();
			fw = new FileWriter("/Users/jaegu/Desktop/" + str);
			bw = new BufferedWriter(fw);
			System.out.println("내용을 입력하세요.");
			System.out.println("입력이 끝나면 exit를 적어주세요.");
			
			while(true) {
				String msg = sc.nextLine();
				if(msg.trim().equals("exit")) break;
				bw.write(msg);
				bw.newLine();
			}
			bw.flush();
			fr = new FileReader("/Users/jaegu/Desktop/" + str);
			br = new BufferedReader(fr);
			String msg;
			while((msg = br.readLine()) != null)
			{
				System.out.println(msg);
			}
			
			
			sc.close();
		}catch(IOException e) {
			
		}finally {
			try {
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(fr != null) fr.close();
				if(br != null) br.close();
			}catch(IOException e) {}
		}
		
		
		
	}

}
