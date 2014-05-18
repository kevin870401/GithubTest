package com.psi.webapp.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.psi.webapp.bo.VipBo;
import com.psi.webapp.model.Vip;
 
public class VipAction implements ModelDriven{

	Vip vip = new Vip();
	List<Vip> vipList = new ArrayList<Vip>();
	
	VipBo vipBo;
	//DI via Spring
	public void setVipBo(VipBo vipBo) {
		this.vipBo = vipBo;
	}

	public Object getModel() {
		return vip;
	}
	
	public List<Vip> getVipList() {
		return vipList;
	}

	public void setVipList(List<Vip> vipList) {
		this.vipList = vipList;
	}

	//save vip
	public String addVip() throws Exception{
    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++vip addVip");
		//save it
		vip.setCreatedDate(new Date());
		vipBo.addVip(vip);
	 
		//reload the vip list
		vipList = null;
		vipList = vipBo.listVip();
		
		return "success";
	
	}
	
	//list all vips
	public String listVip() throws Exception{
		
		vipList = vipBo.listVip();
		
		return "success";
	
	}
	
}