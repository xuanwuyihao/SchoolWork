package bean;



import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

public class Student {
	@TableId("s_id")
	private Integer sId;
	@TableField("s_studentno")
	private String studentNo;
	@TableField("s_name")
	private String sName;
	@TableField("user_id")
	private Long userId;
	@TableField("id_number")
	private String idNumber;
	@TableField("s_phone")
	private String sPhone;
	@TableField("s_content")
	private String sContent;
	@TableField("academy_id")
	private Integer academyId;
	@TableField("s_gradations")
	private String sGradations;
	@TableField("s_systme")
	private String sSystme;
	@TableField("s_date")
	private Date sDate;
	@TableField("s_type")
	private Integer stype;
	private String code;
	private String scode;
	
	private String captcha;
	
	private List<Academy> listAcademy;

	public List<Academy> getListAcademy() {
		return listAcademy;
	}

	public void setListAcademy(List<Academy> listAcademy) {
		this.listAcademy = listAcademy;
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getsPhone() {
		return sPhone;
	}

	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}

	public String getsContent() {
		return sContent;
	}

	public void setsContent(String sContent) {
		this.sContent = sContent;
	}

	public Integer getAcademyId() {
		return academyId;
	}

	public void setAcademyId(Integer academyId) {
		this.academyId = academyId;
	}

	public String getsGradations() {
		return sGradations;
	}

	public void setsGradations(String sGradations) {
		this.sGradations = sGradations;
	}

	public String getsSystme() {
		return sSystme;
	}

	public void setsSystme(String sSystme) {
		this.sSystme = sSystme;
	}

	public Date getsDate() {
		return sDate;
	}

	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}

	public Integer getStype() {
		return stype;
	}

	public void setStype(Integer stype) {
		this.stype = stype;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public Student(Integer sId, String studentNo, String sName, Long userId, String idNumber, String sPhone,
			String sContent, Integer academyId, String sGradations, String sSystme, Date sDate, Integer stype,
			String code, String scode, String captcha) {
		super();
		this.sId = sId;
		this.studentNo = studentNo;
		this.sName = sName;
		this.userId = userId;
		this.idNumber = idNumber;
		this.sPhone = sPhone;
		this.sContent = sContent;
		this.academyId = academyId;
		this.sGradations = sGradations;
		this.sSystme = sSystme;
		this.sDate = sDate;
		this.stype = stype;
		this.code = code;
		this.scode = scode;
		this.captcha = captcha;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", studentNo=" + studentNo + ", sName=" + sName + ", userId=" + userId
				+ ", idNumber=" + idNumber + ", sPhone=" + sPhone + ", sContent=" + sContent + ", academyId="
				+ academyId + ", sGradations=" + sGradations + ", sSystme=" + sSystme + ", sDate=" + sDate + ", stype="
				+ stype + ", code=" + code + ", scode=" + scode + ", captcha=" + captcha + "]";
	}

}
