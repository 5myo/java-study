import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Homework {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("LottoTest.txt",true); //FileReader fr = new FileReader(" 파일 경로");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("로또");
		bw.newLine();
		bw.write();
	}

}
