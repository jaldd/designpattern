package org.shaotang.design.pattern.adapter.log;

import java.util.List;

/**
 * 使用适配器实现数据库存储接口实现文件存储
 * 
 * @author ldd
 *
 */
public class Adapter implements LogDbOperateApi,LogFileOperateApi {

	private LogFileOperateApi fileLog;
	private LogDbOperateApi dbLog;
	private TimeUtil times = null;

	public Adapter(LogFileOperateApi adaptee, TimeUtil times) {
		super();
		this.fileLog = adaptee;
		this.times = times;
	}

	@Override
	public void createLog(LogModel lm) {
		List<LogModel> list = fileLog.readLogFile();
		list.add(lm);
		fileLog.writeLogFile(list);
	}

	@Override
	public void updateLog(LogModel lm) {
		times.begin();
		List<LogModel> list = fileLog.readLogFile();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getLogId().equals(lm.getLogId())) {
				list.set(i, lm);
				break;
			}
		}
		times.end();
		times.show();
	}

	@Override
	public void removeLog(LogModel lm) {

		List<LogModel> list = fileLog.readLogFile();
		list.remove(lm);
		fileLog.writeLogFile(list);
	}

	@Override
	public List<LogModel> getAllLog() {
		return fileLog.readLogFile();
	}

	@Override
	public List<LogModel> readLogFile() {
		return dbLog.getAllLog();
	}

	@Override
	public void writeLogFile(List<LogModel> list) {
		for(LogModel l:list) {
			dbLog.createLog(l);
		}
	}

}
