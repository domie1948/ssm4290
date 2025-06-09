package com.entity.view;

import com.entity.GongyuhuxingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公寓户型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 15:17:13
 */
@TableName("gongyuhuxing")
public class GongyuhuxingView  extends GongyuhuxingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongyuhuxingView(){
	}
 
 	public GongyuhuxingView(GongyuhuxingEntity gongyuhuxingEntity){
 	try {
			BeanUtils.copyProperties(this, gongyuhuxingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
