import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06_FileReader_FileWriter_Buffer {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("Lotto.txt",true);//
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("로또");
		bw.newLine();
		bw.write("1 , 5 , 40 , 22 , 32 , 45");
		bw.newLine();
		bw.flush();
		/*
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
				fr = new FileReader("Ex01_Stream.java");
				br = new BufferedReader(fr);
				//line  단위 처리
				String line="";
				for(int i = 0 ; (line = br.readLine()) != null ; i++) {
					//System.out.println(line);
					if(line.indexOf(";") != -1) {
						System.out.println(line);
					}
				}
		} catch (Exception e) {
			
		}finally {
				try {
					   br.close();
					   fr.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
		}
	*/
	}

}









