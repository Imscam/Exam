package program1;

public class MusicPlayer {
	
	private String singer;
	private String music;
	
	public MusicPlayer(String singer, String music) {
		this.singer = singer;
		this.music = music;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}
	
	public void disp() {
		System.out.println(singer + "의 " + music + " 노래를 재생합니다.");
	}
	

}
