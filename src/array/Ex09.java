package array;

public class Ex09 {

	public static void main(String[] args) {
		
		int[] engScores = new int[] {70, 65, 88, 90, 77};
		
		// 학생 5명의 영어점수를 향상된 for문으로 출력해보자
		for(int eng : engScores) {
			System.out.print(eng + "  ");
		}
		System.out.println();
		
		// 학생이 2명이 더 늘어났다면..
		int[] newEngScores = new int[7];
		
		for(int i = 0; i < engScores.length; i++) {
			newEngScores[i] = engScores[i];
		}
		
		for(int eng : newEngScores) {
			System.out.print(eng + "  ");
		}
		
		

	}

}
