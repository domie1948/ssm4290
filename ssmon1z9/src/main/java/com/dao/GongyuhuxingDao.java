package com.dao;

import com.entity.GongyuhuxingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyuhuxingVO;
import com.entity.view.GongyuhuxingView;


/**
 * 公寓户型
 * 
 * @author 
 * @email 
 * @date 2021-03-27 15:17:13
 */
public interface GongyuhuxingDao extends BaseMapper<GongyuhuxingEntity> {
	
	List<GongyuhuxingVO> selectListVO(@Param("ew") Wrapper<GongyuhuxingEntity> wrapper);
	
	GongyuhuxingVO selectVO(@Param("ew") Wrapper<GongyuhuxingEntity> wrapper);
	
	List<GongyuhuxingView> selectListView(@Param("ew") Wrapper<GongyuhuxingEntity> wrapper);

	List<GongyuhuxingView> selectListView(Pagination page,@Param("ew") Wrapper<GongyuhuxingEntity> wrapper);
	
	GongyuhuxingView selectView(@Param("ew") Wrapper<GongyuhuxingEntity> wrapper);
	
}
