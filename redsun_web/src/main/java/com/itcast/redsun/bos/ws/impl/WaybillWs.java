package com.itcast.redsun.bos.ws.impl;

import java.util.List;

import com.itcast.redsun.biz.IWaybillBiz;
import com.itcast.redsun.biz.IWaybilldetailBiz;
import com.itcast.redsun.bos.ws.IWaybillWs;
import com.itcast.redsun.entity.Waybill;
import com.itcast.redsun.entity.Waybilldetail;

public class WaybillWs implements IWaybillWs {

	
	private IWaybillBiz waybillBiz;
	private IWaybilldetailBiz waybilldetailBiz;
	
	
	@Override
	public List<Waybilldetail> waybilldetailList(Long sn) {
		Waybilldetail waybilldetail=new Waybilldetail();
		waybilldetail.setSn(sn);
		return waybilldetailBiz.getList(waybilldetail, null, null);
	}

	@Override
	public Long addWaybill(Long userId, String toaddress, String addressee, String tele, String info) {
		Waybill waybill=new Waybill();
		
		waybill.setAddressee(addressee);
		waybill.setToaddress(toaddress);
		waybill.setInfo(info);
		waybill.setTele(tele);
		waybill.setUserid(userId);
		waybill.setState("0");
		
		waybillBiz.add(waybill);
		return waybill.getSn();
	}

	public void setWaybillBiz(IWaybillBiz waybillBiz) {
		this.waybillBiz = waybillBiz;
	}

	public void setWaybilldetailBiz(IWaybilldetailBiz waybilldetailBiz) {
		this.waybilldetailBiz = waybilldetailBiz;
	}
	
}
