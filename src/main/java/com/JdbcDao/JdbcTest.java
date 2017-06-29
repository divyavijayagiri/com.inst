package com.JdbcDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.springframework.web.bind.annotation.ModelAttribute;



import com.inter.interfaceTesting;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.pojo.Student;

public class JdbcTest implements interfaceTesting {

	public boolean user(Student stu) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/spring3", "root", "root");
			PreparedStatement ps = con
					.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setString(1, stu.getFirstname());
			ps.setString(2, stu.getLastname());
			ps.setString(3, stu.getMailid());
			ps.setString(4, stu.getPassword());
			ps.setString(5, stu.getMobilenumber());
			
			
			int i = ps.executeUpdate();
			con.close();
		} catch (MySQLIntegrityConstraintViolationException e) {
			System.out.println(e);

			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

		return true;

	}

	public boolean login(Student stu) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/spring3", "root", "root");
			PreparedStatement ps = connection
					.prepareStatement("select * from student where mailid=? and password=?");
			ps.setString(1, stu.getMailid());
			ps.setString(2, stu.getPassword());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}