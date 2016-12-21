package dao.imp;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import vo.User;
import dao.LoginDao;

public class LoginDaoImp extends HibernateDaoSupport implements LoginDao{

	@Override
	public void save(User user) {
		getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		List<User> list=getHibernateTemplate().find("from User");
		return list;
		
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(id);
		
	}

	@Override
	public User getName(String name) {
		@SuppressWarnings("unchecked")
		List<User> list=getHibernateTemplate().find("from User where u_name='"+name+"'");
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getId(Integer id) {
		List<User> list= getHibernateTemplate().find("from User where u_id="+id);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}
}
