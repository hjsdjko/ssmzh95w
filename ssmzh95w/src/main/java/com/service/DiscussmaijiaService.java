package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmaijiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmaijiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmaijiaView;


/**
 * 卖家评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 15:56:57
 */
public interface DiscussmaijiaService extends IService<DiscussmaijiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmaijiaVO> selectListVO(Wrapper<DiscussmaijiaEntity> wrapper);
   	
   	DiscussmaijiaVO selectVO(@Param("ew") Wrapper<DiscussmaijiaEntity> wrapper);
   	
   	List<DiscussmaijiaView> selectListView(Wrapper<DiscussmaijiaEntity> wrapper);
   	
   	DiscussmaijiaView selectView(@Param("ew") Wrapper<DiscussmaijiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmaijiaEntity> wrapper);
   	
}

