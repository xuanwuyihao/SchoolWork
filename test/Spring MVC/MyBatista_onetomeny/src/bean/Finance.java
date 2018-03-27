package bean;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

public class Finance {
	@TableId("f_id")
	private Integer fId;
	@TableField("stu_no")
	private String stuNo;
	@TableField("tea_class")
	private String teaClass;
	@TableField("need_money")
	private BigDecimal needMoney;
	@TableField("practical_money")
	private BigDecimal practicalMoney;
	@TableField("f_date")
	private Date fDate;
	@TableField("f_way")
	private Integer fWay;
	@TableField("f_accumulative")
	private BigDecimal fAccumulative;
	@TableField("f_state")
	private Integer fState;
	@TableField("f_obligate")
	private String fObligate;
	private Date createdateStart;
	private Date createdateEnd;
	private Integer stypeone;
	private Integer stypetwo;

	private Student student;

	public Integer getfId() {
		return fId;
	}

	public void setfId(Integer fId) {
		this.fId = fId;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getTeaClass() {
		return teaClass;
	}

	public void setTeaClass(String teaClass) {
		this.teaClass = teaClass;
	}

	public BigDecimal getNeedMoney() {
		return needMoney;
	}

	public void setNeedMoney(BigDecimal needMoney) {
		this.needMoney = needMoney;
	}

	public BigDecimal getPracticalMoney() {
		return practicalMoney;
	}

	public void setPracticalMoney(BigDecimal practicalMoney) {
		this.practicalMoney = practicalMoney;
	}

	public Date getfDate() {
		return fDate;
	}

	public void setfDate(Date fDate) {
		this.fDate = fDate;
	}

	public Integer getfWay() {
		return fWay;
	}

	public void setfWay(Integer fWay) {
		this.fWay = fWay;
	}

	public BigDecimal getfAccumulative() {
		return fAccumulative;
	}

	public void setfAccumulative(BigDecimal fAccumulative) {
		this.fAccumulative = fAccumulative;
	}

	public Integer getfState() {
		return fState;
	}

	public void setfState(Integer fState) {
		this.fState = fState;
	}

	public String getfObligate() {
		return fObligate;
	}

	public void setfObligate(String fObligate) {
		this.fObligate = fObligate;
	}

	public Date getCreatedateStart() {
		return createdateStart;
	}

	public void setCreatedateStart(Date createdateStart) {
		this.createdateStart = createdateStart;
	}

	public Date getCreatedateEnd() {
		return createdateEnd;
	}

	public void setCreatedateEnd(Date createdateEnd) {
		this.createdateEnd = createdateEnd;
	}

	public Integer getStypeone() {
		return stypeone;
	}

	public void setStypeone(Integer stypeone) {
		this.stypeone = stypeone;
	}

	public Integer getStypetwo() {
		return stypetwo;
	}

	public void setStypetwo(Integer stypetwo) {
		this.stypetwo = stypetwo;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Finance(Integer fId, String stuNo, String teaClass, BigDecimal needMoney, BigDecimal practicalMoney,
			Date fDate, Integer fWay, BigDecimal fAccumulative, Integer fState, String fObligate, Date createdateStart,
			Date createdateEnd, Integer stypeone, Integer stypetwo, Student student) {
		super();
		this.fId = fId;
		this.stuNo = stuNo;
		this.teaClass = teaClass;
		this.needMoney = needMoney;
		this.practicalMoney = practicalMoney;
		this.fDate = fDate;
		this.fWay = fWay;
		this.fAccumulative = fAccumulative;
		this.fState = fState;
		this.fObligate = fObligate;
		this.createdateStart = createdateStart;
		this.createdateEnd = createdateEnd;
		this.stypeone = stypeone;
		this.stypetwo = stypetwo;
		this.student = student;
	}

	public Finance() {
		super();
	}

	@Override
	public String toString() {
		return "Finance [fId=" + fId + ", stuNo=" + stuNo + ", teaClass=" + teaClass + ", needMoney=" + needMoney
				+ ", practicalMoney=" + practicalMoney + ", fDate=" + fDate + ", fWay=" + fWay + ", fAccumulative="
				+ fAccumulative + ", fState=" + fState + ", fObligate=" + fObligate + ", createdateStart="
				+ createdateStart + ", createdateEnd=" + createdateEnd + ", stypeone=" + stypeone + ", stypetwo="
				+ stypetwo + ", student=" + student + "]";
	}


}
