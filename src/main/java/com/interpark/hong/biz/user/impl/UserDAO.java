package com.interpark.hong.biz.user.impl;

import org.springframework.stereotype.Repository;

import com.interpark.hong.biz.common.JDBCUtil;
import com.interpark.hong.biz.user.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Repository("userDAO")
public class UserDAO {

	private final String USER_GET = "select * from users where id=? and password=?";

	public UserVO getUser(UserVO vo) {
		System.out.println("UserDAO : getUser");

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		UserVO user = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			if (rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
		return user;
	}
}
