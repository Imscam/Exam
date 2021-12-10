package program1;

import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		MusicPlayerService service = new MusicPlayerServiceImpl();
		
		while(true) {
			
			System.out.println("########## 뮤직 플레이어 ##########");
			System.out.println("## (1)뮤직 재생 (2)뮤직 넣기 ##");
			System.out.println("## (3)한곡 재생 (4)뮤직 삭제 ##");
			System.out.println("## (5)전체 재생뮤직 삭제 ##");
			System.out.println("## (6)뮤직 플레이어 끄기 ##");
			System.out.println("#################################");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1 :
				service.play();
				break;
			case 2 :
				service.insert();
				break;
			case 3 :
				service.choicePlay();
				break;
			case 4 :
				service.choiceDelete();
				break;
			case 5 :
				service.delete();
				break;
			case 6 :
				System.out.println("뮤직플레이어를 끕니다.");
				System.exit(0);
				default :
					System.out.println("잘못입력 하였습니다.");
			}
			
		}

	}

}
