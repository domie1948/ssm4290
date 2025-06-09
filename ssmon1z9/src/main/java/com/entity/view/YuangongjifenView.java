package com.entity.view;

import com.entity.YuangongjifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工积分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 15:17:13
 */
@TableName("yuangongjifen")
public class YuangongjifenView  extends YuangongjifenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongjifenView(){
	}
 
 	public YuangongjifenView(YuangongjifenEntity yuangongjifenEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongjifenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
