package net.bit.day13;

public class HomeWork1 {
	public static void main(String[] args) {
		int score[][] = { { 88, 48, 78, 98 }, { 99, 92 }, // �� ���
				{ 29, 64, 83 }, // 176 , 58.7 �Ҽ��� ���ڸ� �ݿø�
				{ 34, 78, 92, 56 } // 260 , 65
		};

		// ���� 1 ���
		System.out.println("--------���� 1 ------------");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "  ");
			}
			System.out.println();
		}
		// ���� 2 �� �հ�
		System.out.println("--------���� 2 ------------");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum+=score[i][j];
			}
			System.out.printf("�迭 %d ��° ���� %d \n",i+1,sum);
//			sum=0;
		}
		// ���� 3 �� ���
		System.out.println("--------���� 3 ------------");
		for (int i = 0; i < score.length; i++) {
			int tot = 0;
			double avg = 0;
			for (int j = 0; j < score[i].length; j++) {
				tot+=score[i][j];
			}
			avg = (double)tot/score[i].length;
			avg = Math.round(avg*10)/10.0;
			System.out.printf("�迭 %d ��° ��� %.1f \n",i+1,avg);
			
		}
	}
}
