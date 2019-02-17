package org.shaotang.design.pattern.adapter.log;

import java.util.List;

public interface LogDbOperateApi {

	void createLog(LogModel lm);

	void updateLog(LogModel lm);

	void removeLog(LogModel lm);

	List<LogModel> getAllLog();

}
