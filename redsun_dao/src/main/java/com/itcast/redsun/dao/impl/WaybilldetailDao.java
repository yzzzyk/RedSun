package com.itcast.redsun.dao.impl;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import com.itcast.redsun.dao.IWaybilldetailDao;
import com.itcast.redsun.entity.Waybilldetail;
/**
 * 数据访问类
 * @author Administrator
 *
 */
public class WaybilldetailDao extends BaseDao<Waybilldetail> implements IWaybilldetailDao {

	
	/**
	 * 构建查询条件
	 * @param dep1
	 * @param dep2
	 * @param param
	 * @return
	 */
	public DetachedCriteria getDetachedCriteria(Waybilldetail waybilldetail1,Waybilldetail waybilldetail2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Waybilldetail.class);
		if(waybilldetail1!=null){
			if(waybilldetail1.getExedate()!=null &&  waybilldetail1.getExedate().trim().length()>0)
			{
				dc.add(Restrictions.like("exedate", waybilldetail1.getExedate(), MatchMode.ANYWHERE));			
			}
			if(waybilldetail1.getExetime()!=null &&  waybilldetail1.getExetime().trim().length()>0)
			{
				dc.add(Restrictions.like("exetime", waybilldetail1.getExetime(), MatchMode.ANYWHERE));			
			}
			if(waybilldetail1.getInfo()!=null &&  waybilldetail1.getInfo().trim().length()>0)
			{
				dc.add(Restrictions.like("info", waybilldetail1.getInfo(), MatchMode.ANYWHERE));			
			}
			if(waybilldetail1.getSn()!=null)
			{
				dc.add(Restrictions.eq("sn", waybilldetail1.getSn()));			
			}
		
		}		
		return dc;
	}
	
	
}

