package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.p2p.mapper.RoleJurMapper;
import com.p2p.pojo.RoleJur;
import com.p2p.service.RoleJurService;

@Controller
@Service
public class RoleJurServiceImpl implements RoleJurService{

	@Resource
	private RoleJurMapper roleJurMapper;
	@Override
	public List<RoleJur> list() {
		// TODO Auto-generated method stub
		return roleJurMapper.list();
	}

	@Override
	public void save(RoleJur t) {
		// TODO Auto-generated method stub
		roleJurMapper.save(t);
	}

	@Override
	public void update(RoleJur t) {
		// TODO Auto-generated method stub
		roleJurMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		roleJurMapper.remove(id);
	}

	@Override
	public RoleJur getById(Integer id) {
		// TODO Auto-generated method stub
		return roleJurMapper.getById(id);
	}

	@Override
	public void addRoleJurFlast(Integer role_id, Integer j_id) {
		// TODO Auto-generated method stub
		roleJurMapper.addRoleJurFlast(role_id, j_id);
	}

}
