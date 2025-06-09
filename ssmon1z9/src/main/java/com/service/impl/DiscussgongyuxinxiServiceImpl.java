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


import com.dao.DiscussgongyuxinxiDao;
import com.entity.DiscussgongyuxinxiEntity;
import com.service.DiscussgongyuxinxiService;
import com.entity.vo.DiscussgongyuxinxiVO;
import com.entity.view.DiscussgongyuxinxiView;

@Service("discussgongyuxinxiService")
public class DiscussgongyuxinxiServiceImpl extends ServiceImpl<DiscussgongyuxinxiDao, DiscussgongyuxinxiEntity> implements DiscussgongyuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgongyuxinxiEntity> page = this.selectPage(
                new Query<DiscussgongyuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussgongyuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgongyuxinxiEntity> wrapper) {
		  Page<DiscussgongyuxinxiView> page =new Query<DiscussgongyuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgongyuxinxiVO> selectListVO(Wrapper<DiscussgongyuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgongyuxinxiVO selectVO(Wrapper<DiscussgongyuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgongyuxinxiView> selectListView(Wrapper<DiscussgongyuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgongyuxinxiView selectView(Wrapper<DiscussgongyuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
