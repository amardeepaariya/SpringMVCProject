package com.deep.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.deep.model.User;

@Repository
public class UserDAO {
	private static List<User> list=null;
		static {
			list = new ArrayList<User>();
			list.add(new User("kk", 30, "kk.cs@gmail.com", "India"));
			list.add(new User("Martin", 40, "martine.cs@gmail.com", "US"));
			list.add(new User("Amardeep", 20, "ak.cs@gmail.com", "India"));
		}
	public List<User> getUserList(){
		return list;
	}
	public void addUser(User user) {
		// TODO Auto-generated method stub
		list.add(user);
		
	}
}
