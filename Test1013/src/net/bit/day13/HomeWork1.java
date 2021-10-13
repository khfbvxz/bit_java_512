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
}/*
DecimalFormat df = new DecimalFormat("#.#");
//double형 숫자 .0 없애고 출력
//첫번째방법
if (avg == (long) avg) {
 System.out.printf("%d행 배열 원소들의 평균 : %d\n", rowNum, (long)avg);
} else {
 System.out.printf("%d행 배열 원소들의 평균 : %.1f\n", rowNum, avg);
}
//두번째방법
System.out.println(rowNum+"행 배열 원소들의 평균 : "+ df.format(avg));
}
package net.bit.day13;

public class HomeWork01 {
   public static void main(String[] args) {
      int score[][] = {
            {88, 48, 78, 98}, // 312, 78
            {99, 92},               // 191, 95.5
            {29, 64, 83},         // 176, 58.7(첫째자리 소숫점에서 반올림)
            {34, 78, 92, 56}  // 260, 65
      };
      
      //문제1 출력
      for(int row[]: score) {
         for(int num: row) {
            System.out.print(num+"\t");
         }
         System.out.println();
      }
      System.out.println("-------------------------------");
      
      //문제2 총합계
      for(int row[]: score) {
         int sum = 0;
         for(int num: row) {
            sum += num;
         }
         System.out.println(sum);
      }
      System.out.println("-------------------------------");
      
      //문제3 평균
      for(int row[]: score) {
         int sum = 0; double avg = 0;
         for(int num: row) {
            sum += num;
         }
         avg = (double)sum / row.length;
         System.out.printf("%.1f\n", avg);
      }
      System.out.println("-------------------------------");
   }//main end
}//class END

*/