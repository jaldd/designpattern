package org.shaotang.design.pattern.adapter.log;

import java.io.Serializable;

public class LogModel implements Serializable{

	private String logId;
	private String operateUser;
	private String operateTime;
	private String logContent;
	
	public LogModel() {
		
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getOperateUser() {
		return operateUser;
	}

	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

	@Override
	public String toString() {
		return "LogModel [logId=" + logId + ", operateUser=" + operateUser + ", operateTime=" + operateTime
				+ ", logContent=" + logContent + "]";
	}
	
}
