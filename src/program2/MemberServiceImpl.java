package program2;

import java.util.*;

public class MemberServiceImpl implements MemberService {
	
	private HashSet<Member> set;
	private Scanner scan;
	
	public MemberServiceImpl() {
		set = new HashSet<Member>();
		scan = new Scanner(System.in);
	}
	

	@Override
	public void viewAll() {
		// 회원 목록 출력
		Iterator<Member> setIter = set.iterator();
		while(setIter.hasNext()) {
			Member viewAll = setIter.next();
			viewAll.disp();
		}
		
	}

	@Override
	public void view() {
		// 이름을 입력받아 회원의 나이와 전화번호 출력
		
		System.out.print("조회할 회원의 이름 : ");
		String name = scan.next();
		Iterator<Member> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			Member view = setIter.next();
			if(name.equals(view.getName())) {
				
				System.out.println(name + "님의 나이는 : " + view.getAge() + "살 입니다.");
				System.out.println(name + "님의 전화번호는 : " + 
										view.getPhoneNum() + "번 입니다.");
				return;
			}
			
		}
		System.out.println(name + "님은 저희 회원이 아닙니다.");
		
	}

	@Override
	public void insert() {
		// 이름 나이 전화번호 입력받아 회원등록
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		System.out.print("전화번호 입력 : ");
		String phoneNum = scan.next();
		Member member = new Member(name, age, phoneNum);
		set.add(member);
		
	}

	@Override
	public void edit() {
		// 이름을 입력받아 회원의 나이와 회원의 전화번호 수정
		System.out.print("수정할 회원의 이름 : ");
		String name = scan.next();
		Iterator<Member> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			Member edit = setIter.next();
			
			if(name.equals(edit.getName())) {
				
				System.out.println(name + "님의 나이는 : " + edit.getAge() + "살 입니다.");
				System.out.print("수정할 나이 : ");
				int newAge = scan.nextInt();
				
				System.out.println(name + "님의 전화번호는 : " + edit.getPhoneNum() 
																+ "번 입니다.");
				System.out.print("수정할 전화번호 : ");
				String newPhoneNum = scan.next();
				
				edit.setAge(newAge);
				edit.setPhoneNum(newPhoneNum);
				System.out.println(name + "님의 나이와 전화번호를 수정하였습니다.");
				return;
				
			}
			
		}
		System.out.println(name + "님은 저희 회원이 아닙니다.");
		
	}

	@Override
	public void delete() {
		// 이름을 입력받아 회원삭제 
		System.out.print("삭제할 회원의 이름 : ");
		String name = scan.next();
		Iterator<Member> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			Member del = setIter.next();
			
			if(name.equals(del.getName())) {
				
				set.remove(del);
				System.out.println(name + "회원을 삭제하였습니다.");
				return;
				
			}
			
		}
		System.out.println(name + "님은 저희 회원이 아닙니다.");
		
	}
	
	
	
}
