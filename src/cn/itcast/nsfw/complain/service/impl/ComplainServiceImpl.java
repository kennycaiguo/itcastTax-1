package cn.itcast.nsfw.complain.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.core.service.impl.BaseServiceImpl;
import cn.itcast.nsfw.complain.dao.ComplainDao;
import cn.itcast.nsfw.complain.entity.Complain;
import cn.itcast.nsfw.complain.service.ComplainService;

@Service("complainService")
public class ComplainServiceImpl extends BaseServiceImpl<Complain> implements ComplainService {
	
	private ComplainDao complainDao;
	
	@Resource(name="complainDao")
	public void setComplainDao(ComplainDao complainDao){
		super.setBaseDao(complainDao);
		this.complainDao = complainDao;
	}
	
}
