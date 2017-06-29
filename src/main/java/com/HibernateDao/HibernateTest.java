package com.HibernateDao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;


import com.inter.interfaceTesting;
import com.pojo.Student;

public class HibernateTest implements interfaceTesting{
	
	
	
	public boolean user(Student stu){
		
		Configuration configure = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory SessionFactory = configure.buildSessionFactory();
		Session session = SessionFactory.openSession();
		session.save(stu);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		return true;
		
	}
	

	public boolean login(Student stu) {
	
		
		Configuration configure = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory SessionFactory = configure.buildSessionFactory();
		Session session = SessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("mailid", stu.getMailid()));
		criteria.add(Restrictions.eq("password", stu.getPassword()));
		List<Student> list=criteria.list();
		session.beginTransaction().commit();
		
		if(list.size()==1){
						
			
			return true;
		}else{
			return false;
		}
	}

	
}

