package com.psi.webapp.bo;

import java.util.List;

import com.psi.webapp.model.Vip;
 
public interface VipBo{
	
	void addVip(Vip vip);
	
	List<Vip> listVip();
	
}