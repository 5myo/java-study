
public class Ex06_Operation {
	public static void main(String[] args) {
			int sum = 0;
			//대입연산자 " +=  , -= , *= , /= ....
			sum+=1; //sum = sum + 1
			sum-=1; //sum = sum - 1
			System.out.println("sum : " + sum);
			
			//간단한 학점 계산기
			//학점 : A+  A-  B+  B- ..... F
			//데이터 점수 : 94점
			
			//판단기준 :  90 점이 이상 >> A
			//그런데 95점 이상 >> A+
			//아닌데 A-
			// 90(95 A+  아니면 A-)  .. 80 .. 70 나머지 F
			
			int score = 78;
			String grade = ""; // 문자열의 초기화
			System.out.println("당신의 점수는 :" + score);

			// 학점계산 로직
			if (score >= 90) {
					grade = "A";
					grade = (score >= 95) ? (grade += "+") : (grade += "-");
			} else if (score >= 80) {
				grade = "B";
					if (score >= 85) {
						grade += "+";// grade = grade + "+";
					} else {
						grade += "-";// grade = grade + "-";
					}
			} else if (score >= 70) {
				grade = "C";
					if (score >= 75) {
						grade += "+";// grade = grade + "+";
					} else {
						grade += "-";// grade = grade + "-";
					}
			} else {
				grade = "F";
			}

			System.out.println("당신의 학점은 : " + grade);
	}

}
