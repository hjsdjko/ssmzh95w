package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdantuikuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdantuikuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdantuikuanView;


/**
 * 订单退款
 *
 * @author 
 * @email 
 * @date 2021-03-20 15:56:57
 */
public interface DingdantuikuanService extends IService<DingdantuikuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdantuikuanVO> selectListVO(Wrapper<DingdantuikuanEntity> wrapper);
   	
   	DingdantuikuanVO selectVO(@Param("ew") Wrapper<DingdantuikuanEntity> wrapper);
   	
   	List<DingdantuikuanView> selectListView(Wrapper<DingdantuikuanEntity> wrapper);
   	
   	DingdantuikuanView selectView(@Param("ew") Wrapper<DingdantuikuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdantuikuanEntity> wrapper);
   	
}

