import java.io.FileReader;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		
		// 문자 단위로 읽어옴.
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/jaegu/Desktop/printWriter.txt");
			int readChar;
			while((readChar = fr.read()) != -1) {
				System.out.print((char)readChar);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) fr.close();
			}catch(IOException e) {}
		}
	}

}
