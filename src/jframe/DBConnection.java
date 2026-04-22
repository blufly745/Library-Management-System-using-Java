package jframe;

import java.sql.DriverManager;   //驱动管理器，负责创建连接
import java.sql.Connection;   //数据库连接对象，开始执行sql
import java.sql.SQLException;   //数据库操作出问题时抛出的异常

public class DBConnection {
	//
	private static final String URL = "jdbc:mysql://localhost/library_management_system";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    //获取连接方法
    public static Connection getConnection() throws SQLException {
        try {
        	//加载mysql驱动，可省
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //打印异常对象完整调用堆栈轨迹，哪一行出错，经过哪些方法调用
        }
        //其实前面都可省，只保留这一句
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
