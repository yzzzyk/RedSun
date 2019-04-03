package com.itcast.redsun.action;
import com.itcast.redsun.biz.IWaybillBiz;
import com.itcast.redsun.entity.Waybill;

/**
 * Action 
 * @author Administrator
 *
 */
public class WaybillAction extends BaseAction<Waybill> {

	private IWaybillBiz waybillBiz;
	
	public void setWaybillBiz(IWaybillBiz waybillBiz) {
		this.waybillBiz = waybillBiz;
		setBaseBiz(waybillBiz);
	}
	
	
}
