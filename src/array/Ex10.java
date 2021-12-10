package array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 정수를 입력받아 방의 갯수를 만들고
		// 그 방에 대한 입실 퇴실 보기 종료를 만들어보자
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("방의 갯수를 입력 : ");
		int roomSu = scan.nextInt();
		
		boolean[] room = new boolean[roomSu];
		// false일 경우 빈방, true일 경우 사용중
		
		while(true) {
			
			System.out.println("(1)입실 (2)퇴실 (3)보기 (4)종료");
			System.out.print("선택 >> ");
			int select = scan.nextInt();
			
			switch(select) {
			case 1 :
				int inRoom;
				
				do {
					System.out.println("입실하실 방의 번호를 입력 : ");
					inRoom = scan.nextInt();
				}while(inRoom < 1 || inRoom > roomSu);
				// 방의 번호가 1보다 작거나 방의 갯수보다 크다면 다시 받는다.
				
				if(room[inRoom -1]) {// 인덱스는 0부터 시작하기 때문에 -1 해준다
					System.out.println(inRoom + "호실은 사용중 입니다.");
				}else {
					System.out.println(inRoom + "호실에 입실하셨습니다.");
					room[inRoom -1] = true;
					// 입실했으면 true로 바꾸어 빈방이 아니게 해준다.
				}
				break;
				
			case 2 :
				
				int outRoom;
				
				do {
					System.out.println("퇴실하실 방의 번호를 입력 : ");
					outRoom = scan.nextInt();
				}while(outRoom < 1 || outRoom > roomSu);
				
				if(!room[outRoom -1]) { // ! : 논리부정연산자, 논리결과값을 바꾼다.
					// 논리값을 바꾸기 때문에 if문 실행은 빈방이다.
					System.out.println(outRoom + "호실은 빈방입니다.");
				}else {
					System.out.println(outRoom + "호실에서 퇴실하셨습니다.");
					room[outRoom -1] = false;
					// 퇴실한다음 빈방으로 만들어준다.
				}
				break;
				
			case 3 :
				
				for(int i = 0; i < roomSu; i++) {
					
					if(room[i]) {
						System.out.println(i+1 + "호실은 사용중입니다.");
					}else {
						System.out.println(i+1 + "호실은 빈방입니다.");
					}
				}
				break;
				
			case 4 :
				System.out.println("프로그램 종료합니다.");
				System.exit(0); //시스템 강제종료
				default :
					System.out.println("잘못 입력 하셨습니다.");
			}
			
		}

	}

}














