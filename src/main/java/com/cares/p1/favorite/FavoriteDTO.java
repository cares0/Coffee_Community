package com.cares.p1.favorite;

public class FavoriteDTO {

	private Long favoriteNum;
	private String cupnote1;
	private String cupnote2;
	private String cupnote3;
	private Integer rPoint;
	private Integer flavor;
	
	public Long getFavoriteNum() {
		return favoriteNum;
	}
	public void setFavoriteNum(Long favoriteNum) {
		this.favoriteNum = favoriteNum;
	}
	public String getCupnote1() {
		return cupnote1;
	}
	public void setCupnote1(String cupnote1) {
		this.cupnote1 = cupnote1;
	}
	public String getCupnote2() {
		return cupnote2;
	}
	public void setCupnote2(String cupnote2) {
		this.cupnote2 = cupnote2;
	}
	public String getCupnote3() {
		return cupnote3;
	}
	public void setCupnote3(String cupnote3) {
		this.cupnote3 = cupnote3;
	}
	public Integer getrPoint() {
		return rPoint;
	}
	public void setrPoint(Integer rPoint) {
		this.rPoint = rPoint;
	}
	public Integer getFlavor() {
		return flavor;
	}
	public void setFlavor(Integer flavor) {
		this.flavor = flavor;
	}
	
}
