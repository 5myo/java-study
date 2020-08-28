import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_ImageCopy {
	public static void main(String[] args) {
		String orifile = "C:\\Temp\\img.jpg";
		String targetfile = "copy.jpg";
		//default 경로 : 프로젝트 폴더가 default
		//D:\Bit_Java\Ex09_IO/copy.jpg
		
		FileInputStream fs = null;
		FileOutputStream fo = null;
		
		try {
			fs = new FileInputStream(orifile);
			fo = new FileOutputStream(targetfile, false);
			int data = 0;
			while((data = fs.read()) != -1) {
				fo.write(data); //copy.jpg.에 byte 값 write
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {

		}
	}

}
