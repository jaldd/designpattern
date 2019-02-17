package org.shaotang.design.pattern.adapter.log;

import java.util.List;

public interface LogFileOperateApi {
	
	List<LogModel> readLogFile();
	
	void writeLogFile(List<LogModel> list);
}
