package net.bit.day13;

public class HomeWork1 {
	public static void main(String[] args) {
		int score[][] = { { 88, 48, 78, 98 }, { 99, 92 }, // 합 평균
				{ 29, 64, 83 }, // 176 , 58.7 소수점 한자리 반올림
				{ 34, 78, 92, 56 } // 260 , 65
		};

		// 문제 1 출력
		System.out.println("--------문제 1 ------------");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "  ");
			}
			System.out.println();
		}
		// 문제 2 총 합계
		System.out.println("--------문제 2 ------------");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum+=score[i][j];
			}
			System.out.printf("배열 %d 번째 총합 %d \n",i+1,sum);
//			sum=0;
		}
		// 문제 3 총 평균
		System.out.println("--------문제 3 ------------");
		for (int i = 0; i < score.length; i++) {
			int tot = 0;
			double avg = 0;
			for (int j = 0; j < score[i].length; j++) {
				tot+=score[i][j];
			}
			avg = (double)tot/score[i].length;
			avg = Math.round(avg*10)/10.0;
			System.out.printf("배열 %d 번째 평균 %.1f \n",i+1,avg);
			
		}
	}
}
