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


import com.dao.DingdantuikuanDao;
import com.entity.DingdantuikuanEntity;
import com.service.DingdantuikuanService;
import com.entity.vo.DingdantuikuanVO;
import com.entity.view.DingdantuikuanView;

@Service("dingdantuikuanService")
public class DingdantuikuanServiceImpl extends ServiceImpl<DingdantuikuanDao, DingdantuikuanEntity> implements DingdantuikuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdantuikuanEntity> page = this.selectPage(
                new Query<DingdantuikuanEntity>(params).getPage(),
                new EntityWrapper<DingdantuikuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdantuikuanEntity> wrapper) {
		  Page<DingdantuikuanView> page =new Query<DingdantuikuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdantuikuanVO> selectListVO(Wrapper<DingdantuikuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdantuikuanVO selectVO(Wrapper<DingdantuikuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdantuikuanView> selectListView(Wrapper<DingdantuikuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdantuikuanView selectView(Wrapper<DingdantuikuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
