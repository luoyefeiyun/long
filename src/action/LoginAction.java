package action;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.LoginService;
import service.imp.LoginServiceImp;
import vo.User;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private LoginService lService;
	
	public LoginService getlService() {
		return lService;
	}
	public void setlService(LoginService lService) {
		this.lService = lService;
	}
	private static final long serialVersionUID = 1L;
	
	 public String  username;
	 public String  password;
	 
	 public void validate(){
		 if(username==null||username.length()==0){
			 super.addActionError("用户名不能为空");
		 }
		 if(password==null||password.length()==0){
			 super.addActionError("密码不能为空");
		 }
	 }
	 public String execute(){
		 ApplicationContext acContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		 LoginServiceImp in=(LoginServiceImp) acContext.getBean("loginService");
		 User user=in.getName(username);
		 if(user==null){
		   super.addFieldError("username","用户不存在");
	       return ERROR;
		 }else{
			 if(!password.equals(user.getU_pwd())){
				 super.addFieldError("password","密码错误");
				 return ERROR;
			 }
		 }
		 return SUCCESS;
	 }
}
