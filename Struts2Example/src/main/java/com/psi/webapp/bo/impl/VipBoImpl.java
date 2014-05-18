package com.psi.webapp.bo.impl;

import java.util.List;

import com.psi.webapp.bo.VipBo;
import com.psi.webapp.dao.VipDAO;
import com.psi.webapp.model.Vip;
 
public class VipBoImpl implements VipBo{
	
	VipDAO vipDAO;

	//DI via Spring
	public void setVipDAO(VipDAO vipDAO) {
		this.vipDAO = vipDAO;
	}

	//call DAO to save customer
	public void addVip(Vip vip){
		
		vipDAO.addVip(vip);
		
	}
	
	//call DAO to return customers
	public List<Vip> listVip(){
		
		return vipDAO.listVip();
		
	}
	
}