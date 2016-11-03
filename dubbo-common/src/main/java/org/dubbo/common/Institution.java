package org.dubbo.common;

import java.io.Serializable;

/**
 * 
 *	类名称：Institution
 *	类描述：机构封装类
 *	创建人：
 *	创建时间：2016年7月11日上午11:32:44
 *	修改人：
 *	修改时间：
 *	修改备注：
 */
public class Institution implements Comparable<Institution>,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String id;
	String name; //机构名称
	double longitude;//经度
	double latitude;//纬度
	String address;//详细地址
	String phone;//联系电话
	String icon;//图标
	String intro;//机构介绍
	String typeValue;//机构类别 
	String typeName;//机构类别
	String cityId;//所在市id
	String cityName;//所在市
	String countryId;//所在区县id
	String countryName;//所在区县
	String townId;//所在乡镇id
	String townName;//专业方向
	String villageId;//所在村id
	String villageName;//所在村
	String  majorFieldIdsStr;
	String majorFieldName;//专业方向
	String createTime;//创建时间
	String updateTime;//修改时间
	String isOk;//是否点亮(0点亮，1不点亮)
	String distance;//距离目标的距离
	String lastAreaId;//该机构最后一级id
	String stamp;
	String organPrincipal;//机构负责人名称和电话
	String iconGray;
	String okTime;
	String rank;         //等级  1 市级  2 县级  3 镇级  4 村级
	
	
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public double getLongitude() {
		return longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public String getMajorFieldName() {
		return majorFieldName;
	}
	public void setMajorFieldName(String majorFieldName) {
		this.majorFieldName = majorFieldName;
	}
	public Institution() {
		// TODO Auto-generated constructor stub
	}
	public Institution(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIconGray() {
		return iconGray;
	}
	public void setIconGray(String iconGray) {
		this.iconGray = iconGray;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajorFieldIdsStr() {
		return majorFieldIdsStr;
	}
	public void setMajorFieldIdsStr(String majorFieldIdsStr) {
		this.majorFieldIdsStr = majorFieldIdsStr;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreateTime() {
		return createTime;
	}

	public String getOkTime() {
		return okTime;
	}
	public void setOkTime(String okTime) {
		this.okTime = okTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public String getOrganPrincipal() {
		return organPrincipal;
	}
	public void setOrganPrincipal(String organPrincipal) {
		this.organPrincipal = organPrincipal;
	}
	public String getStamp() {
		return stamp;
	}
	public void setStamp(String stamp) {
		this.stamp = stamp;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	

	public String getLastAreaId() {
		return lastAreaId;
	}
	public void setLastAreaId(String lastAreaId) {
		this.lastAreaId = lastAreaId;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
			this.cityId = cityId;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
			this.countryId = countryId;
	}

	public String getTownId() {
		return townId;
	}

	public void setTownId(String townId) {
			this.townId = townId;
	}
	
	public String getIsOk() {
		return isOk;
	}

	public void setIsOk(String isOk) {
		this.isOk = isOk;
	}

	public String getVillageId() {
		return villageId;
	}

	public void setVillageId(String villageId) {
			this.villageId = villageId;
	}

	public String getTypeValue() {
		return typeValue;
	}
	public void setTypeValue(String typeValue) {
		this.typeValue = typeValue;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	@Override
	public int compareTo(Institution o) {
		if(Double.parseDouble(this.distance) > Double.parseDouble(o.distance)){
			return 1;
		}else if (Double.parseDouble(this.distance) < Double.parseDouble(o.distance)) {
			return -1;
		}else {
			return 0;
		}
	}
}
