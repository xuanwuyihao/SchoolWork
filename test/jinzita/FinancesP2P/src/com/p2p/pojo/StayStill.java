package com.p2p.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class StayStill {

	
			private Integer id;
			private Integer lendId;
			private String userName;
			private String realName;
			private Date lendTime;
			private String type;
			private String title ;
			private Integer stage ;
			private Integer stages ;
			private Date stillTime;
			private Date realstillTime;
			private BigDecimal stayGold;
			private BigDecimal hasFine;
			private BigDecimal stayFine;
			private Integer stayDaly;
			private String staystatus;
			private String description ;
			private String oyh1;
			private String oyh2;
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public Integer getLendId() {
				return lendId;
			}
			public void setLendId(Integer lendId) {
				this.lendId = lendId;
			}
			public String getUserName() {
				return userName;
			}
			public void setUserName(String userName) {
				this.userName = userName;
			}
			public String getRealName() {
				return realName;
			}
			public void setRealName(String realName) {
				this.realName = realName;
			}
			public Date getLendTime() {
				return lendTime;
			}
			public void setLendTime(Date lendTime) {
				this.lendTime = lendTime;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public Integer getStage() {
				return stage;
			}
			public void setStage(Integer stage) {
				this.stage = stage;
			}
			public Integer getStages() {
				return stages;
			}
			public void setStages(Integer stages) {
				this.stages = stages;
			}
			public Date getStillTime() {
				return stillTime;
			}
			public void setStillTime(Date stillTime) {
				this.stillTime = stillTime;
			}
			public Date getRealstillTime() {
				return realstillTime;
			}
			public void setRealstillTime(Date realstillTime) {
				this.realstillTime = realstillTime;
			}
			public BigDecimal getStayGold() {
				return stayGold;
			}
			public void setStayGold(BigDecimal stayGold) {
				this.stayGold = stayGold;
			}
			public BigDecimal getHasFine() {
				return hasFine;
			}
			public void setHasFine(BigDecimal hasFine) {
				this.hasFine = hasFine;
			}
			public BigDecimal getStayFine() {
				return stayFine;
			}
			public void setStayFine(BigDecimal stayFine) {
				this.stayFine = stayFine;
			}
			public Integer getStayDaly() {
				return stayDaly;
			}
			public void setStayDaly(Integer stayDaly) {
				this.stayDaly = stayDaly;
			}
			
			public String getStaystatus() {
				return staystatus;
			}
			public void setStaystatus(String staystatus) {
				this.staystatus = staystatus;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public String getOyh1() {
				return oyh1;
			}
			public void setOyh1(String oyh1) {
				this.oyh1 = oyh1;
			}
			public String getOyh2() {
				return oyh2;
			}
			public void setOyh2(String oyh2) {
				this.oyh2 = oyh2;
			}
			
			public StayStill(Integer id, Integer lendId, String userName, String realName, Date lendTime, String type,
					String title, Integer stage, Integer stages, Date stillTime, Date realstillTime,
					BigDecimal stayGold, BigDecimal hasFine, BigDecimal stayFine, Integer stayDaly, String staystatus,
					String description, String oyh1, String oyh2) {
				super();
				this.id = id;
				this.lendId = lendId;
				this.userName = userName;
				this.realName = realName;
				this.lendTime = lendTime;
				this.type = type;
				this.title = title;
				this.stage = stage;
				this.stages = stages;
				this.stillTime = stillTime;
				this.realstillTime = realstillTime;
				this.stayGold = stayGold;
				this.hasFine = hasFine;
				this.stayFine = stayFine;
				this.stayDaly = stayDaly;
				this.staystatus = staystatus;
				this.description = description;
				this.oyh1 = oyh1;
				this.oyh2 = oyh2;
			}
			public StayStill() {
				super();
			}
			
			
			
			
			
			
}
