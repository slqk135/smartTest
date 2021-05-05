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
			bw.write("BufferedWriter�׽�Ʈ�Դϴ�. \n");
			bw.newLine();
			bw.write("�ȳ��ϼ���. " + System.getProperty("line.separator"));
			bw.write("������ ���Դϴ�. \n");
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


