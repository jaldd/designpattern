package org.shaotang.design.pattern.adapter.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi {

	private String logFilePathName = "AdapterLog.log";

	public LogFileOperate() {

	}

	public LogFileOperate(String logFilePathName) {
		if (logFilePathName != null && logFilePathName.trim().length() > 0) {
			this.logFilePathName = logFilePathName;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LogModel> readLogFile() {
		List<LogModel> list = null;
		ObjectInputStream oin = null;
		try {
			File f = new File(logFilePathName);
			if (f.exists()) {
				oin = new ObjectInputStream(new FileInputStream(f));
				list = (List<LogModel>) oin.readObject();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oin != null)
					oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void writeLogFile(List<LogModel> list) {
		File f = new File(logFilePathName);
		ObjectOutputStream oout = null;
		try {
			oout = new ObjectOutputStream(new FileOutputStream(f));
			oout.writeObject(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oout != null)
					oout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
