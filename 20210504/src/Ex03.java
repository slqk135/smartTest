import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("/Users/jaegu/Desktop/bufferwriter1.txt");
			bw = new BufferedWriter(fw);
			bw.write("BufferedWriter테스트입니다. \n");
			bw.newLine();
			bw.write("안녕하세요. " + System.getProperty("line.separator"));
			bw.write("파일의 끝입니다. \n");
			bw.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				}catch(IOException e) {}
			}
				if(bw != null) {
					try {bw.close();
					}catch(IOException e) {}
				}
			}
		}
		
	}


