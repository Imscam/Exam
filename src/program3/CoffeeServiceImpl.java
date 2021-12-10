package program3;

import java.util.*;

public class CoffeeServiceImpl implements CoffeeService {
	
	HashMap<Coffee, Integer> map;
	
	Set<Client> set;
	
	Scanner scan;
	
	public CoffeeServiceImpl() {
		
		map = new HashMap<Coffee, Integer>();
		
		set = new HashSet<Client>();
		
		scan = new Scanner(System.in);
		
		map.put(new Coffee("아메리카노"), 2000);
		map.put(new Coffee("카페라떼"), 3000);
		
	}

	@Override
	public void viewAll() {
		// 커피 전체 메뉴 출력
		Set<Coffee> keySet = map.keySet();
		
		Iterator<Coffee> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			Coffee viewAll = keyIter.next();
			String coffeeName = viewAll.getCoffeeName();
			int price = map.get(viewAll);
			
			System.out.println(coffeeName + " : " + price);
			
		}
		
	}

	@Override
	public void menuRegister() {
		// 메뉴이름과 메뉴가격을 입력받아 메뉴등록
		System.out.println("메뉴를 등록합니다.");
		System.out.print("메뉴 이름 : ");
		String coffeeName = scan.next();
		System.out.print("메뉴 가격 : ");
		int coffeePrice = scan.nextInt();
		
		Coffee coffee = new Coffee(coffeeName);
		
		map.put(coffee, coffeePrice);
		
	}

	@Override
	public void menuEdit() {
		// 메뉴 이름을 입력받아 가격수정
		System.out.print("수정할 메뉴 이름 : ");
		String coffeeName = scan.next();
		
		Set<Coffee> keySet = map.keySet();
		
		Iterator<Coffee> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			Coffee edit = keyIter.next();
			
			if(coffeeName.equals(edit.getCoffeeName())) {
				
				System.out.print("수정할 가격 : ");
				int newPrice = scan.nextInt();
				
				map.put(edit, newPrice);
				System.out.println(coffeeName + "의 가격을 수정하였습니다.");
				return;
			}
			
		}
		System.out.println(coffeeName + "는 메뉴에 없습니다.");
		
		
	}

	@Override
	public void menuDelete() {
		// 메뉴 이름을 입력받아 메뉴삭제
		
		System.out.print("삭제할 메뉴 이름 : ");
		String coffeeName = scan.next();
		
		Set<Coffee> keySet = map.keySet();
		
		Iterator<Coffee> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			Coffee del = keyIter.next();
			
			if(del.getCoffeeName().equals(coffeeName)) {
				
				map.remove(del);
				System.out.println(coffeeName + "메뉴를 삭제하였습니다.");
				return;
				
			}
			
		}
		System.out.println(coffeeName + "는 메뉴에 없습니다.");
		
	}
	

	@Override
	public void chargeMoney() {
		// 고객의 충전금 충전
		System.out.print("충전할 금액을 입력 : ");
		int money = scan.nextInt();
		Client client = Client.getInstance();
		client.addMoney(money);
		set.add(client);
		System.out.println(money + "금액이 충전 되었습니다.");
		
	}

	@Override
	public void order() {
		// 메뉴 이름을 입력받아 메뉴주문 (내 충전금에서 메뉴가격만큼 차감)
		System.out.print("주문할 메뉴 이름 : ");
		String coffeeName = scan.next();
		
		Set<Coffee> keySet = map.keySet();
		Iterator<Coffee> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			Coffee order = keyIter.next();
			
			if(order.getCoffeeName().equals(coffeeName)) {
				
				int coffeePrice = map.get(order);
				
				Iterator<Client> setIter = set.iterator();
				
				while(setIter.hasNext()) {
					
					Client client = setIter.next();
					
					int clientMoney = client.getMoney();
					
					if(clientMoney >= coffeePrice) {
						
						System.out.println(coffeeName + " 주문이 들어갔습니다.");
						client.setMoney(clientMoney - coffeePrice);
						System.out.println("맛있게 드세요");
						System.out.println("남은 금액은 " + (clientMoney - coffeePrice) 
										+ "원 입니다.");
						return;
						
					}else {
						System.out.println("금액이 부족합니다.");
						System.out.println("충전금을 충전하세요");
						return;
					}
					
				}
				System.out.println("충전금이 없습니다.");
				System.out.println("충전을 해주세요");
				return;
				
			}
			
		}
		System.out.println(coffeeName + "는 메뉴에 없습니다.");
		return;
		
	}

	@Override
	public void showMoney() {
		// 충전금 보기
		
		Iterator<Client> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			Client client = setIter.next();
			int money = client.getMoney();
			System.out.println("현재 충전 잔액은 : " + money + "원 입니다.");
			return;
		}
		System.out.println("충전금이 없습니다.");
		System.out.println("충전을 해주세요");
		
	}
	
	
}
