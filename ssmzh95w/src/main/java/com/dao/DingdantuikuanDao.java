package com.dao;

import com.entity.DingdantuikuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdantuikuanVO;
import com.entity.view.DingdantuikuanView;


/**
 * 订单退款
 * 
 * @author 
 * @email 
 * @date 2021-03-20 15:56:57
 */
public interface DingdantuikuanDao extends BaseMapper<DingdantuikuanEntity> {
	
	List<DingdantuikuanVO> selectListVO(@Param("ew") Wrapper<DingdantuikuanEntity> wrapper);
	
	DingdantuikuanVO selectVO(@Param("ew") Wrapper<DingdantuikuanEntity> wrapper);
	
	List<DingdantuikuanView> selectListView(@Param("ew") Wrapper<DingdantuikuanEntity> wrapper);

	List<DingdantuikuanView> selectListView(Pagination page,@Param("ew") Wrapper<DingdantuikuanEntity> wrapper);
	
	DingdantuikuanView selectView(@Param("ew") Wrapper<DingdantuikuanEntity> wrapper);
	
}
