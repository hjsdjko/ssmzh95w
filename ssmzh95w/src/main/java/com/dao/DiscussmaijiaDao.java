package com.dao;

import com.entity.DiscussmaijiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmaijiaVO;
import com.entity.view.DiscussmaijiaView;


/**
 * 卖家评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-20 15:56:57
 */
public interface DiscussmaijiaDao extends BaseMapper<DiscussmaijiaEntity> {
	
	List<DiscussmaijiaVO> selectListVO(@Param("ew") Wrapper<DiscussmaijiaEntity> wrapper);
	
	DiscussmaijiaVO selectVO(@Param("ew") Wrapper<DiscussmaijiaEntity> wrapper);
	
	List<DiscussmaijiaView> selectListView(@Param("ew") Wrapper<DiscussmaijiaEntity> wrapper);

	List<DiscussmaijiaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmaijiaEntity> wrapper);
	
	DiscussmaijiaView selectView(@Param("ew") Wrapper<DiscussmaijiaEntity> wrapper);
	
}
