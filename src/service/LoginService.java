package service;

import java.util.List;

import vo.User;

public interface LoginService {
	User getName(String name);
	User getId(Integer id);
	void save(User user);
	void update(User user);
	List<User> findAll();
	void delete(Integer id);
}
