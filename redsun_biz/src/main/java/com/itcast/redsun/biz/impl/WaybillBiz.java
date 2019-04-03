package com.itcast.redsun.biz.impl;
import com.itcast.redsun.biz.IWaybillBiz;
import com.itcast.redsun.dao.IWaybillDao;
import com.itcast.redsun.entity.Waybill;
/**
 * 业务逻辑类
 * @author Administrator
 *
 */
public class WaybillBiz extends BaseBiz<Waybill> implements IWaybillBiz {

	private IWaybillDao waybillDao;
	
	public void setWaybillDao(IWaybillDao waybillDao) {
		this.waybillDao = waybillDao;
		setBaseDao(waybillDao);
	}

	
}
