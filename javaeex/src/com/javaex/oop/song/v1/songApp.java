package com.javaex.oop.song.v1;

public class songApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		song a1 = new song();
		a1.setArtist("아이유");
		a1.setTitle("좋은날");
		a1.setAlbum("REAL");
		a1.setComposer("이민수");
		a1.setTrack(3);
		a1.setYear(2010);
		a1.showInfo();
		
		
		song a2 = new song();
		a2.setAlbum("Always");
		a2.setArtist("BIGBANG");
		a2.setComposer("GD");
		a2.setTitle("거짓말");
		a2.setTrack(2);
		a2.setYear(2007);
		a2.showInfo();
				
		song a3 = new song();
		a3.setAlbum("버스커1집");
		a3.setArtist("버스커버스커");
		a3.setComposer("장범준");
		a3.setTitle("벚꽃엔딩");
		a3.setTrack(4);
		a3.setYear(2012);
		a3.showInfo();
	}

}
