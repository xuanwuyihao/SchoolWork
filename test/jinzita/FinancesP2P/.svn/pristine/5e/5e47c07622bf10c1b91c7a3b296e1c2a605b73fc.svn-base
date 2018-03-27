package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.JurisdictionMapper;
import com.p2p.mapper.ManagerMapper;
import com.p2p.mapper.RoleJurMapper;
import com.p2p.mapper.RoleMapper;
import com.p2p.pojo.Jurisdiction;
import com.p2p.pojo.Manager;
import com.p2p.pojo.Page;
import com.p2p.pojo.Role;
import com.p2p.service.ManagerService;

@Transactional
@Service
public class ManagerServiceImpl implements ManagerService{

	@Resource
	private ManagerMapper managerMapper;
	@Resource
	private RoleMapper rolerMapper;
	@Resource
	private RoleJurMapper roleJurMapper;
	@Resource
	private JurisdictionMapper jurisdictionMapper;
	
	
	@Override
	public Manager getByName(String userName) {
		// TODO Auto-generated method stub
		return managerMapper.getByName(userName);
	}

	@Override
	public List<Manager> list() {
		// TODO Auto-generated method stub
		return managerMapper.list();
	}

	@Override
	public void save(Manager t) {
		// TODO Auto-generated method stub
		managerMapper.save(t);
	}

	@Override
	public void update(Manager t) {
		// TODO Auto-generated method stub
		managerMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		managerMapper.remove(id);
	}

	@Override
	public Manager getById(Integer id) {
		// TODO Auto-generated method stub
		return managerMapper.getById(id);
	}
	
	//查询所有角色信息
	public List<Role> roleList() {
		// TODO Auto-generated method stub
		return rolerMapper.list();
	}

	//查询角色权限
	public List<Jurisdiction>  roleJur(int id) {
		// TODO Auto-generated method stub
		return jurisdictionMapper.roleJur(id);
	}

	@Override
	public void updateAll(Integer id) {
		// TODO Auto-generated method stub
		jurisdictionMapper.updateAll(id);
	}

	@Override
	public void updateNeed(Integer role_id, Integer jur_id) {
		// TODO Auto-generated method stub
		jurisdictionMapper.updateNeed(role_id, jur_id);
	}

	@Override
	public void deleteRole(Integer id) {
		// TODO Auto-generated method stub
		rolerMapper.remove(id);
	}

	@Override
	public void deleteRolejurByRid(Integer role_id) {
		// TODO Auto-generated method stub
		 jurisdictionMapper.deleteRolejurByRid(role_id);
	}

	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
	   rolerMapper.save(role);
	}

	@Override
	public Integer getRoleMaxId() {
		// TODO Auto-generated method stub
		return rolerMapper.getRoleMaxId();
	}

	@Override
	public void addRolejurAllnoByRid(Integer role_id,Integer j_id) {
		// TODO Auto-generated method stub
		jurisdictionMapper.addRolejurAllnoByRid(role_id,j_id);
	}

	@Override
	public void insertLog(Manager manager) {
		// TODO Auto-generated method stub
		managerMapper.insertLog(manager);
	}

	@Override
	public List<Manager> vagueSelect(Page page) {
		// TODO Auto-generated method stub
		return managerMapper.vagueSelect(page);
	}

	@Override
	public List<Manager> pagingSelect(Page pa) {
		// TODO Auto-generated method stub
		return managerMapper.pagingSelect(pa);
	}

	@Override
	public List<Manager> vagueSelectLimit(Page page) {
		// TODO Auto-generated method stub
		return managerMapper.vagueSelectLimit(page);
	}

	
	
	
	

}
