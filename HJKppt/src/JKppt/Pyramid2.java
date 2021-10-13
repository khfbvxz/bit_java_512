package JKppt;
// 반복문 이용 피라미드 출력
public class Pyramid2 {
	public static void main(String[] args) {
		int dan = 5;
//		for(int i=0 ; i<dan ; i++) {
//			for(int j=1 ; j<dan-i ; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0 ; j<i+1 ;j++) {
//				System.out.print("*");	
//			}
//			System.out.println();
//		}
		/*
	*
   **
  ***
 ****
*****
		 */
//		for(int i =0 ; i<dan; i++) {
//			for(int j=0 ; j<dan-i-1; j++) {
//				System.out.print("1");
//			}
//			for(int j=0; j<2*i+1; j++) {
//				System.out.print("*");
//			}
//			for(int j=0 ; j<dan-i-1; j++) {
//				System.out.print("1");
//			}
//			System.out.println();
//		}
/*
1111*1111
111***111
11*****11
1*******1
*********
 */
		for(int i=0;i<dan;i++) {
			for(int j =0 ; j<i ; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<2*dan-(2*i)-1;j++) {
				System.out.print("*");
			}System.out.println();
		}
/*
*********
 *******
  *****
   ***
    *
 */
	}
}
