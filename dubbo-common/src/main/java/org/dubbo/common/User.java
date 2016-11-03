package org.dubbo.common;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * 
 *	类名称：User
 *	类描述：用户包装类（包含三种app用户）
 *	创建人：
 *	创建时间：2016年7月14日下午3:19:06
 *	修改人：
 *	修改时间：
 *	修改备注：
 */
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	public static User UserFactory(String phone, String userName, String jobTypeValue, String email, String sex, String nickName,
			int organId ,String type) {
		User u = new User();
		u.setPhone(phone);
		u.setEmail(email);
		u.setUserName(userName);
		u.setNickName(nickName);
		u.setJobTypeValue(jobTypeValue);
		u.setOrganId(organId);
		u.setSex(sex);
		u.setType(type);
		return u;
	}
	private String phone;
	private String name;//别名
	private String credentialsSalt ;
	private String accountName ;
	private String userName;
	private String jobTypeValue;//岗位
	private String email;
	private String sex;
	private String password;
	private String nickName;
	private int jobTypeId; //岗位类型
	private String jobTypeName;//岗位名称 
	private String organName;//所属机构名称 
	private String icon;//用户头像
	private int organId;//所属机构id
	private String isOrganPrincipal;//是否为机构负责人（0是，1不是）
	private String isOk;//点亮状态(0是，1不是)
	private String professionalGrade;//专业程度评级（5级）
	private String serviceGrade;//服务态度评级（5级）
	private String occupationCode;//律师从业证编号
	private String auditState;//审核状态
	private Date createTime;
	private Date updateTime;
	private String signature;//签名
	private String stamp;//盖章
	private String isBlack;//是否被拉黑(0是，1不是)
	private String description;//描述
	private int idCode;//短信验证码
	private String type;//用户类别（0代表公众用户，1代表法律服务用户，2代表工作人员，3代表后台系统用户）
	private Date startWorkTime;//开始从业时间
	private Integer workYears;//从业年限
	private String address;//用户机构地址
	private String jobName;//执业名称
	private String area;
	private String evaluation; //用户评价
	private String UnavailablePurpose; //审核不通过原因
	private String workUnit; //工作单位
	private String telephone; //座机电话
	private Date isBlackTime;//被拉黑时间
	private String openId;//微信openId
	private String netChartName;//微信昵称
	private Integer isStaff;//区分普通内部用户和公证人员或司法鉴定人员（1代表普通内部用户，2代表公证人员或司法鉴定人员）
	
	/*前端*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getOrganId() {
		return organId;
	}
	public void setOrganId(int organId) {
		this.organId = organId;
	}
	public String getProfessionalGrade() {
		return professionalGrade;
	}
	public void setProfessionalGrade(String professionalGrade) {
		this.professionalGrade = professionalGrade;
	}
	public String getServiceGrade() {
		return serviceGrade;
	}
	public void setServiceGrade(String serviceGrade) {
		this.serviceGrade = serviceGrade;
	}
	public String getOccupationCode() {
		return occupationCode;
	}
	public void setOccupationCode(String occupationCode) {
		this.occupationCode = occupationCode;
	}
	public String getAuditState() {
		return auditState;
	}
	public void setAuditState(String auditState) {
		this.auditState = auditState;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getStamp() {
		return stamp;
	}
	public void setStamp(String stamp) {
		this.stamp = stamp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIdCode() {
		return idCode;
	}
	public void setIdCode(int idCode) {
		this.idCode = idCode;
	}
	public void setJobTypeId(int jobTypeId) {
		this.jobTypeId = jobTypeId;
	}
	public int getJobTypeId() {
		return jobTypeId;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIsOk() {
		return isOk;
	}
	public void setIsOk(String isOk) {
		this.isOk = isOk;
	}
	public String getIsBlack() {
		return isBlack;
	}
	public void setIsBlack(String isBlack) {
		this.isBlack = isBlack;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIsOrganPrincipal() {
		return isOrganPrincipal;
	}
	public void setIsOrganPrincipal(String isOrganPrincipal) {
		this.isOrganPrincipal = isOrganPrincipal;
	}
	public String getCredentialsSalt() {
		return credentialsSalt;
	}
	public void setCredentialsSalt(String credentialsSalt) {
		this.credentialsSalt = credentialsSalt;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getJobTypeName() {
		return jobTypeName;
	}
	public void setJobTypeName(String jobTypeName) {
		this.jobTypeName = jobTypeName;
	}
	public String getOrganName() {
		return organName;
	}
	public void setOrganName(String organName) {
		this.organName = organName;
	}
	public String getJobTypeValue() {
		return jobTypeValue;
	}
	public void setJobTypeValue(String jobTypeValue) {
		this.jobTypeValue = jobTypeValue;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getStartWorkTime() {
		return startWorkTime;
	}
	public void setStartWorkTime(Date startWorkTime) {
		this.startWorkTime = startWorkTime;
	}
	public Integer getWorkYears() {
		return workYears;
	}
	public void setWorkYears(Integer workYears) {
		this.workYears = workYears;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	public String getUnavailablePurpose() {
		return UnavailablePurpose;
	}
	public void setUnavailablePurpose(String unavailablePurpose) {
		UnavailablePurpose = unavailablePurpose;
	}
	public String getWorkUnit() {
		return workUnit;
	}
	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getIsBlackTime() {
		return isBlackTime;
	}
	public void setIsBlackTime(Date isBlackTime) {
		this.isBlackTime = isBlackTime;
	}
	public String getNetChartName() {
		return netChartName;
	}
	public void setNetChartName(String netChartName) {
		this.netChartName = netChartName;
	}
	public Integer getIsStaff() {
		return isStaff;
	}
	public void setIsStaff(Integer isStaff) {
		this.isStaff = isStaff;
	}
	
}
