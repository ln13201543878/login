package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.User;
import service.IServiceFactory;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	User u=new User();
	
	public void reg() throws IOException {
		List<User>user=IServiceFactory.getISrviceImpl().getAll();
		for (User us : user) {
			if(us.getUcount().equals(u.getUcount())) {
				HttpServletResponse response =ServletActionContext.getResponse();
				response.setCharacterEncoding("utf-8");
				PrintWriter pw=response.getWriter();
				pw.print("’À∫≈“—¥Ê‘⁄");
				pw.close();
				
			}
		}
		IServiceFactory.getISrviceImpl().add(u);
		
	}

	@Override
	public User getModel() {
		return u;
	}
	
}
