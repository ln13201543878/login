package dao;

import java.util.List;

import entity.User;

public interface IDao {
void update(User u);
void delete(Integer uid);
void save(User u);
User findOne(Integer uid);
List<User>findAll();
}
