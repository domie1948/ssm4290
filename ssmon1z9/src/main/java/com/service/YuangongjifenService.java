package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongjifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongjifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongjifenView;


/**
 * 员工积分
 *
 * @author 
 * @email 
 * @date 2021-03-27 15:17:13
 */
public interface YuangongjifenService extends IService<YuangongjifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongjifenVO> selectListVO(Wrapper<YuangongjifenEntity> wrapper);
   	
   	YuangongjifenVO selectVO(@Param("ew") Wrapper<YuangongjifenEntity> wrapper);
   	
   	List<YuangongjifenView> selectListView(Wrapper<YuangongjifenEntity> wrapper);
   	
   	YuangongjifenView selectView(@Param("ew") Wrapper<YuangongjifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongjifenEntity> wrapper);
   	
}

