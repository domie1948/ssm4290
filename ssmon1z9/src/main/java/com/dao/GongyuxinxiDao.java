package com.dao;

import com.entity.GongyuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyuxinxiVO;
import com.entity.view.GongyuxinxiView;


/**
 * 公寓信息
 * 
 * @author 
 * @email 
 * @date 2021-03-27 15:17:13
 */
public interface GongyuxinxiDao extends BaseMapper<GongyuxinxiEntity> {
	
	List<GongyuxinxiVO> selectListVO(@Param("ew") Wrapper<GongyuxinxiEntity> wrapper);
	
	GongyuxinxiVO selectVO(@Param("ew") Wrapper<GongyuxinxiEntity> wrapper);
	
	List<GongyuxinxiView> selectListView(@Param("ew") Wrapper<GongyuxinxiEntity> wrapper);

	List<GongyuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongyuxinxiEntity> wrapper);
	
	GongyuxinxiView selectView(@Param("ew") Wrapper<GongyuxinxiEntity> wrapper);
	
}
