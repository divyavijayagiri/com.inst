package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.HibernateDao.HibernateTest;
import com.JdbcDao.JdbcTest;

import com.inter.interfaceTesting;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.pojo.Student;

@Controller
public class SigninControl {
	@Autowired
	private interfaceTesting inter1;

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String user(@ModelAttribute("sign")Student stu,Model model)
			throws SQLException {
		boolean res = inter1.user(stu);
		if (res) {
			model.addAttribute("message", "Registration success");
			return "result";

		} else {
			model.addAttribute("message",
					"Registration failed. Please try after sometime.");
			return "signup";

		}

	}

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String login(@ModelAttribute("log")Student stu,Model model)
			throws SQLException {
		 boolean result = inter1.login(stu);
		if (result==true) {
			model.addAttribute("message", "suucessfully login");
			return "result";
		} else {
			model.addAttribute("message", "failed to login");
			return "login";
		}
	}

}
