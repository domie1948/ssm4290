package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyuhuxingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyuhuxingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyuhuxingView;


/**
 * 公寓户型
 *
 * @author 
 * @email 
 * @date 2021-03-27 15:17:13
 */
public interface GongyuhuxingService extends IService<GongyuhuxingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyuhuxingVO> selectListVO(Wrapper<GongyuhuxingEntity> wrapper);
   	
   	GongyuhuxingVO selectVO(@Param("ew") Wrapper<GongyuhuxingEntity> wrapper);
   	
   	List<GongyuhuxingView> selectListView(Wrapper<GongyuhuxingEntity> wrapper);
   	
   	GongyuhuxingView selectView(@Param("ew") Wrapper<GongyuhuxingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyuhuxingEntity> wrapper);
   	
}

