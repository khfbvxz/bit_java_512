package JKppt;
// 반복문 이용 피라미드 출력
public class Pyramid1 {
	public static void main(String[] args) {
		int dan = 5;
//		for(int i = 0 ; i<dan ; i++) {
//			for(int j=0 ; j<i+1 ; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
		for(int i=0; i<dan ; i++) {
			for(int j=0;j<dan-i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
