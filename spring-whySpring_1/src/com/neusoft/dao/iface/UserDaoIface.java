/**
 * 
 */
package com.neusoft.dao.iface;



/**
 * @author Eddy Yang
 * 2008-12-03 17:03
 */
public interface UserDaoIface {
	public boolean login(String id,String pwd);
	public String getEmpName();
}
