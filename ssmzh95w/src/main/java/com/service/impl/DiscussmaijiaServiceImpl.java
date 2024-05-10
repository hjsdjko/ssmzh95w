package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussmaijiaDao;
import com.entity.DiscussmaijiaEntity;
import com.service.DiscussmaijiaService;
import com.entity.vo.DiscussmaijiaVO;
import com.entity.view.DiscussmaijiaView;

@Service("discussmaijiaService")
public class DiscussmaijiaServiceImpl extends ServiceImpl<DiscussmaijiaDao, DiscussmaijiaEntity> implements DiscussmaijiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmaijiaEntity> page = this.selectPage(
                new Query<DiscussmaijiaEntity>(params).getPage(),
                new EntityWrapper<DiscussmaijiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmaijiaEntity> wrapper) {
		  Page<DiscussmaijiaView> page =new Query<DiscussmaijiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmaijiaVO> selectListVO(Wrapper<DiscussmaijiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmaijiaVO selectVO(Wrapper<DiscussmaijiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmaijiaView> selectListView(Wrapper<DiscussmaijiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmaijiaView selectView(Wrapper<DiscussmaijiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
