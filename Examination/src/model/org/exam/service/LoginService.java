package org.exam.service;

import java.util.LinkedList; 
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.exam.model.UserDetails;
import org.exam.util.HibUtil;

public class LoginService {
	public static boolean check(String username,String password){
		Session session = HibUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from user_tbl");
		List<UserDetails> user = new LinkedList<UserDetails>();
		user = query.getResultList();
		for(UserDetails each : user){
			if(each.getUsername().equals(username) && each.getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(check("admin","admin"));
	}
	
}
