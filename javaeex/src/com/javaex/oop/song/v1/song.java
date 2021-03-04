package com.javaex.oop.song.v1;

public class song {

	private String title;
	private String artist;//[] = {"아이유","BIGBANG","버스커버스커"};
	private String album;
	private String composer;
	private int year;
	private int track;
	
	////클래스 필드
	/*public song (String artist,String title) {
		this.artist = artist;
		this.title = title;
	}*/
	//기본생성자사용
	public song() {
		
	}
	public song(String artist,String composer,String album,String title,int year,int track) {
		artist="";
		composer="";
		album="";
		title="";
		year=0;
		track=0;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) { //타이틀을 입력하는 메소드
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) { // 가수를 입력하는 메소드
		this.artist = artist;
	}
	public String getAlbum() {
		return album;		
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public String getComposer() {
		return composer;		
	}
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public int getTrack() {
		return track;		
	}
	public void setTrack(int track) {
		this.track=track;
	}
	public int getYear() {
		return year;		
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	
	
	public void showInfo() {
		System.out.printf("%s,%s( %s,%d,%d번 track,%s 작곡)%n", artist,title,album,year,track,composer);
	}
}
