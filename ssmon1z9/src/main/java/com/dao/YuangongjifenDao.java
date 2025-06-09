package com.dao;

import com.entity.YuangongjifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongjifenVO;
import com.entity.view.YuangongjifenView;


/**
 * 员工积分
 * 
 * @author 
 * @email 
 * @date 2021-03-27 15:17:13
 */
public interface YuangongjifenDao extends BaseMapper<YuangongjifenEntity> {
	
	List<YuangongjifenVO> selectListVO(@Param("ew") Wrapper<YuangongjifenEntity> wrapper);
	
	YuangongjifenVO selectVO(@Param("ew") Wrapper<YuangongjifenEntity> wrapper);
	
	List<YuangongjifenView> selectListView(@Param("ew") Wrapper<YuangongjifenEntity> wrapper);

	List<YuangongjifenView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongjifenEntity> wrapper);
	
	YuangongjifenView selectView(@Param("ew") Wrapper<YuangongjifenEntity> wrapper);
	
}
