package service;

import java.util.List;

import dao.IDaoFactory;
import entity.User;

public class IServiceImpl implements IService {

	@Override
	public void edit(User u) {
		IDaoFactory.getIDaoImpl().update(u);
	}

	@Override
	public void delete(Integer uid) {
		IDaoFactory.getIDaoImpl().delete(uid);
	}

	@Override
	public void add(User u) {
		IDaoFactory.getIDaoImpl().save(u);
	}

	@Override
	public User getOne(Integer uid) {
		User user=IDaoFactory.getIDaoImpl().findOne(uid);
		return user;
	}

	@Override
	public List<User> getAll() {
		List<User>list=IDaoFactory.getIDaoImpl().findAll();
		return list;
	}

}
