package com.itcast.redsun.bos.ws;

import java.util.List;

import javax.jws.WebService;

import com.itcast.redsun.entity.Waybilldetail;

/**
 * 运单服务接口
 * 
 * @author Administrator
 *
 */
@WebService
public interface IWaybillWs {

	/**
	 * 根据运单号查询 运单详情列表
	 * @param sn  运单号
	 * @return
	 */
	List<Waybilldetail> waybilldetailList(Long sn);

	/**
	 * 在线预约下单
	 * @param userId  用户id
	 * @param toaddress
	 * @param addressee
	 * @param tele
	 * @param info
	 * @return 运单号
	 */
	Long addWaybill(Long userId, String toaddress, String addressee, String tele, String info);
}
