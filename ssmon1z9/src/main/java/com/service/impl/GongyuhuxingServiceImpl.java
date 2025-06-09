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


import com.dao.GongyuhuxingDao;
import com.entity.GongyuhuxingEntity;
import com.service.GongyuhuxingService;
import com.entity.vo.GongyuhuxingVO;
import com.entity.view.GongyuhuxingView;

@Service("gongyuhuxingService")
public class GongyuhuxingServiceImpl extends ServiceImpl<GongyuhuxingDao, GongyuhuxingEntity> implements GongyuhuxingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyuhuxingEntity> page = this.selectPage(
                new Query<GongyuhuxingEntity>(params).getPage(),
                new EntityWrapper<GongyuhuxingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyuhuxingEntity> wrapper) {
		  Page<GongyuhuxingView> page =new Query<GongyuhuxingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyuhuxingVO> selectListVO(Wrapper<GongyuhuxingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyuhuxingVO selectVO(Wrapper<GongyuhuxingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyuhuxingView> selectListView(Wrapper<GongyuhuxingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyuhuxingView selectView(Wrapper<GongyuhuxingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
