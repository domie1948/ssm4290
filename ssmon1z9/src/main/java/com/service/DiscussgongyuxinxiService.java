package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgongyuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgongyuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgongyuxinxiView;


/**
 * 公寓信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-27 15:17:13
 */
public interface DiscussgongyuxinxiService extends IService<DiscussgongyuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgongyuxinxiVO> selectListVO(Wrapper<DiscussgongyuxinxiEntity> wrapper);
   	
   	DiscussgongyuxinxiVO selectVO(@Param("ew") Wrapper<DiscussgongyuxinxiEntity> wrapper);
   	
   	List<DiscussgongyuxinxiView> selectListView(Wrapper<DiscussgongyuxinxiEntity> wrapper);
   	
   	DiscussgongyuxinxiView selectView(@Param("ew") Wrapper<DiscussgongyuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgongyuxinxiEntity> wrapper);
   	
}

