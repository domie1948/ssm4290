package com.dao;

import com.entity.DiscussgongyuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgongyuxinxiVO;
import com.entity.view.DiscussgongyuxinxiView;


/**
 * 公寓信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-27 15:17:13
 */
public interface DiscussgongyuxinxiDao extends BaseMapper<DiscussgongyuxinxiEntity> {
	
	List<DiscussgongyuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussgongyuxinxiEntity> wrapper);
	
	DiscussgongyuxinxiVO selectVO(@Param("ew") Wrapper<DiscussgongyuxinxiEntity> wrapper);
	
	List<DiscussgongyuxinxiView> selectListView(@Param("ew") Wrapper<DiscussgongyuxinxiEntity> wrapper);

	List<DiscussgongyuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgongyuxinxiEntity> wrapper);
	
	DiscussgongyuxinxiView selectView(@Param("ew") Wrapper<DiscussgongyuxinxiEntity> wrapper);
	
}
