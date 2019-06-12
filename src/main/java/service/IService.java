package service;

import java.util.List;

import entity.User;

public interface IService {
	void edit(User u);
	void delete(Integer uid);
	void add(User u);
	User getOne(Integer uid);
	List<User>getAll();
}
