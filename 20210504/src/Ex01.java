import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("/Users/jaegu/Desktop/fileWriter.txt");
			String msg = "�ȳ��ϼ��� �׽�Ʈ�Դϴ�.";
			fw.write(msg);
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("������ �������� �ʽ��ϴ�.");
		}finally{
			if(fw != null) {
				try {
					fw.close();
				}catch(IOException e) {
					
				}
			}
		}
		
	
		
	}

}
