package dao;

import java.util.List;
import vo.User;

public interface LoginDao {
	User getName(String name);
	User getId(Integer id);
	void save(User user);
	void update(User user);
	List<User> findAll();
	void delete(Integer id);
}
