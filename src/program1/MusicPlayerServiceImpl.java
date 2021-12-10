package program1;

import java.util.*;

public class MusicPlayerServiceImpl implements MusicPlayerService {
	
	Scanner scan;
	ArrayList<MusicPlayer> list;
	
	public MusicPlayerServiceImpl() {
		scan = new Scanner(System.in);
		list = new ArrayList<MusicPlayer>();
	}
	
	
	@Override
	public void play() {
		// 뮤직 전체재생
		for(int i = 0; i < list.size(); i++) {
			MusicPlayer player = list.get(i);
			player.disp();
		}
	}

	@Override
	public void insert() {
		// 가수이름과 곡이름을 입력받아 ArrayList에 뮤직객체를 생성해서 넣기
		System.out.print("가수 이름 : ");
		String name = scan.next();
		System.out.print("곡 이름 : ");
		String music = scan.next();
		
		list.add(new MusicPlayer(name, music));
		
	}

	@Override
	public void choicePlay() {
		// 가수 이름을 입력받아 해당 뮤직재생
		System.out.print("가수의 이름을 입력 : ");
		String name = scan.next();
		
		for(int i = 0; i < list.size(); i++) {
			
			MusicPlayer play = list.get(i);
			if(play.getSinger().equals(name)) {
				play.disp();
				return; // 메소드종료 
			}
		}
		System.out.println("해당 가수가 재생목록에 없습니다.");
		
		
	}

	@Override
	public void choiceDelete() {
		// 가수 이름을 입력받아 해당 뮤직삭제
		System.out.print("삭제할 재생목록의 가수를 입력 : ");
		String name = scan.next();
		
		for(int i = 0; i < list.size(); i++) {
			
			MusicPlayer del = list.get(i);
			
			if(del.getSinger().equals(name)) {
				
				list.remove(i);
				System.out.println(name + "이(가) 삭제되었습니다.");
				return;
				
			}
		}
		System.out.println("해당 가수가 재생목록에 없습니다.");
		
	}

	@Override
	public void delete() {
		// 모든 재생 뮤직 삭제
		list.clear();
		if(list.isEmpty()) {
			System.out.println("모든 재생곡이 삭제가 되었습니다.");
		}else {
			System.out.println("모든 재생곡이 삭제가 되지 않았습니다.");
		}
	}
	
	
	
}
