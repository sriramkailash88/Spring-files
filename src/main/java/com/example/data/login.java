package com.example.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userid;
	
	private String username;
	private String password;

	public  int getuserid()
	{
		return userid;
	}
	public String getusername()
	{
		return username;
	}
	public String getpassword()
	{
		return password;
	}
	public void setuserid(Integer userid)
	{
		this.userid=userid;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
}

