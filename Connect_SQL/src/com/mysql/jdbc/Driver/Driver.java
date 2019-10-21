package com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;

public interface Driver {
	Connection connect(String url,Properties info)throws SQLException;
	boolean acceptsURL(String url)throws SQLException;
	DriverPropertyInfo[] getPropertyInfo(String url,Properties info)throws SQLException;
	int getMajorVersion();
	int getMinorVersion();
	boolean jdbcCompliant();

}
