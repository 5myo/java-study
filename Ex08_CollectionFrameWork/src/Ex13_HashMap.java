import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {
	public static void main(String[] args) {
		//일상생활
		//지역번호, 우편번호, 회원가입 시 얻는 (id, pwd) 정보
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		//우리 시스템 회원가입한 회원 ID, PWD 정보
		//로그인
		//id(0), pwd(0) >> 회원(방가)
		//id(0), pwd(x) >> 비밀번호 입력 >>
		
		//id(x), pwd(0) >>
		//id(x), pwd(x) >>
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id, pwd 입력해 주세요");
			System.out.println("ID");
			String id = sc.nextLine().trim().toLowerCase();
			//id(o), pwd(o) >> 회원 (방가)
			//id(o), pwd(x) >> 비밀번호 입력 >>
			
			System.out.println("PWD");
			String pwd = sc.nextLine().trim();
			//id(o), pwd(o) >> 회원 (방가)
			//id(o), pwd(x) >> 비밀번호 입력 >>
			
			//id(x), pwd(o) >> ...
			//id(x), pwd(x) >> ...
			if(!loginmap.containsKey(id)) {	//containsKey란 contains에 존재하는 지를 묻는다.
				//id(x)
				System.out.println("id가 맞지 않습니다. 재입력하세요.");
			}else {
				//id(o)
				if(loginmap.get(id).equals(pwd)) {
					System.out.println("회원님 반갑습니다.");
					break;
					}else {
						System.out.println("비밀번호를 확인하세요.");
					}
				}
			}
	}

}
