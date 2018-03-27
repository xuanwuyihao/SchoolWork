package bean;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

public class Academy {
	@TableId("a_id")
	private Integer aId;
	@TableField("a_school")
	private String aSchool;
	@TableField("a_major")
	private String aMajor;
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getaSchool() {
		return aSchool;
	}
	public void setaSchool(String aSchool) {
		this.aSchool = aSchool;
	}
	public String getaMajor() {
		return aMajor;
	}
	public void setaMajor(String aMajor) {
		this.aMajor = aMajor;
	}
	public Integer getaFlag() {
		return aFlag;
	}
	public void setaFlag(Integer aFlag) {
		this.aFlag = aFlag;
	}
	@TableField("a_flag")
	private Integer aFlag;
	public Academy(Integer aId, String aSchool, String aMajor, Integer aFlag) {
		super();
		this.aId = aId;
		this.aSchool = aSchool;
		this.aMajor = aMajor;
		this.aFlag = aFlag;
	}
	public Academy() {
		super();
	}
	@Override
	public String toString() {
		return "Academy [aId=" + aId + ", aSchool=" + aSchool + ", aMajor=" + aMajor + ", aFlag=" + aFlag + "]";
	}


}
