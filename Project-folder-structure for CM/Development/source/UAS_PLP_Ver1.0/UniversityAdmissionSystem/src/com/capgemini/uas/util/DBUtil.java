package com.capgemini.uas.util;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.capgemini.uas.exception.UASException;

public final class DBUtil {

	private static DBUtil dsp;

	private DataSource dataSource;

	private DBUtil() throws UASException {
		try {
			InitialContext context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:/OracleDS");
		} catch (NamingException e) {
			throw new UASException(e.getMessage());
		}
	}

	public static synchronized DBUtil obtainConnection()
			throws UASException {
		if (dsp == null)
			dsp = new DBUtil();
		return dsp;
	}

	public DataSource getDataSource() {
		return this.dataSource;
	}
}