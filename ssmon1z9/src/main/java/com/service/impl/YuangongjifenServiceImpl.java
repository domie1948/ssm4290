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


import com.dao.YuangongjifenDao;
import com.entity.YuangongjifenEntity;
import com.service.YuangongjifenService;
import com.entity.vo.YuangongjifenVO;
import com.entity.view.YuangongjifenView;

@Service("yuangongjifenService")
public class YuangongjifenServiceImpl extends ServiceImpl<YuangongjifenDao, YuangongjifenEntity> implements YuangongjifenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongjifenEntity> page = this.selectPage(
                new Query<YuangongjifenEntity>(params).getPage(),
                new EntityWrapper<YuangongjifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongjifenEntity> wrapper) {
		  Page<YuangongjifenView> page =new Query<YuangongjifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongjifenVO> selectListVO(Wrapper<YuangongjifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongjifenVO selectVO(Wrapper<YuangongjifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongjifenView> selectListView(Wrapper<YuangongjifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongjifenView selectView(Wrapper<YuangongjifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
