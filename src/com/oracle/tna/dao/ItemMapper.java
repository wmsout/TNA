package com.oracle.tna.dao;

import java.util.List;

import com.oracle.tna.domain.Item;





//写对应的接口，接口里写对应的方法
public interface ItemMapper {

	//查询
	public List<Item> select();
}
