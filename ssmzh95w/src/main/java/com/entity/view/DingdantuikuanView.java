package com.entity.view;

import com.entity.DingdantuikuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 订单退款
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 15:56:57
 */
@TableName("dingdantuikuan")
public class DingdantuikuanView  extends DingdantuikuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdantuikuanView(){
	}
 
 	public DingdantuikuanView(DingdantuikuanEntity dingdantuikuanEntity){
 	try {
			BeanUtils.copyProperties(this, dingdantuikuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
