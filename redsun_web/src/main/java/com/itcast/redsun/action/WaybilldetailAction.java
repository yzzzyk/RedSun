package com.itcast.redsun.action;
import com.itcast.redsun.biz.IWaybilldetailBiz;
import com.itcast.redsun.entity.Waybilldetail;

/**
 * Action 
 * @author Administrator
 *
 */
public class WaybilldetailAction extends BaseAction<Waybilldetail> {

	private IWaybilldetailBiz waybilldetailBiz;
	
	public void setWaybilldetailBiz(IWaybilldetailBiz waybilldetailBiz) {
		this.waybilldetailBiz = waybilldetailBiz;
		setBaseBiz(waybilldetailBiz);
	}
	
	
}
