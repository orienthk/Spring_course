package com.neusoft.dao.impl;

import com.neusoft.dao.iface.UserDaoIface;
/**
 * @author Eddy Yang
 *
 * Dec 3, 2008
 */
public class UserDao4DB2Impl implements UserDaoIface{
	public boolean login(String id,String pwd){
		System.out.println("-------UserDao4DB2Impl.login()-----"+id+"  "+pwd);
		return true;
	}
	public String getEmpName(){
		System.out.println("-------UserDao4DB2Impl.getEmpName()-----");
		return "call the method :UserDao4DB2Impl.getEmpName()";
	}
}
