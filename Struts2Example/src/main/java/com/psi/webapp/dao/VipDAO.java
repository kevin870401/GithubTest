package com.psi.webapp.dao;

import java.util.List;

import com.psi.webapp.model.Vip;


public interface VipDAO{
	
	void addVip(Vip vip);
	
	List<Vip> listVip();
	
}