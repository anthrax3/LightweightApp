package org.taoran.course.pojo;

/**
 * Baidu��ַ��Ϣ
 * 
 * @author ����
 * @date 2015-4-8
 */
public class BaiduPlace implements Comparable<BaiduPlace> {
	// ����
	private String name;
	// ��ϸ��ַ
	private String address;
	// ����
	private String lng;
	// γ��
	private String lat;
	// ��ϵ�绰
	private String telephone;
	// ����
	private int distance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(BaiduPlace baiduPlace) {
		return this.distance - baiduPlace.getDistance();
	}
}