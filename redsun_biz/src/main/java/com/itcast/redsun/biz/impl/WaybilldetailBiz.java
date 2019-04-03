package com.itcast.redsun.biz.impl;
import com.itcast.redsun.biz.IWaybilldetailBiz;
import com.itcast.redsun.dao.IWaybilldetailDao;
import com.itcast.redsun.entity.Waybilldetail;
/**
 * 业务逻辑类
 * @author Administrator
 *
 */
public class WaybilldetailBiz extends BaseBiz<Waybilldetail> implements IWaybilldetailBiz {

	private IWaybilldetailDao waybilldetailDao;
	
	public void setWaybilldetailDao(IWaybilldetailDao waybilldetailDao) {
		this.waybilldetailDao = waybilldetailDao;
		setBaseDao(waybilldetailDao);
	}

	
}
