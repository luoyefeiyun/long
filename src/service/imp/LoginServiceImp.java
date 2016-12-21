package service.imp;

import java.util.List;

import dao.LoginDao;
import service.LoginService;
import vo.User;

public class LoginServiceImp implements LoginService{
	private LoginDao ld;
	
	public LoginDao getLd() {
		return ld;
	}

	public void setLd(LoginDao ld) {
		this.ld = ld;
	}

	@Override
	public void save(User user) {
		ld.save(user);
		
	}

	@Override
	public void update(User user) {
		ld.update(user);
		
	}

	@Override
	public List<User> findAll() {
	return ld.findAll();
		
	}

	@Override
	public void delete(Integer id) {
		ld.delete(id);
		
	}

	@Override
	public User getName(String name) {
		return ld.getName(name);
	}

	@Override
	public User getId(Integer id) {
		return ld.getId(id);
	}
}
