package com.login.controller;  
  
import java.util.HashMap;  
import java.util.Map;  
  

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  

import org.springframework.web.servlet.ModelAndView;  
import org.springframework.web.servlet.mvc.AbstractController;  
  

import com.login.user.User;
  public class LoginController extends AbstractController {  
    private String successView;  
    private String failView;  
      
    public String getSuccessView() {  
        return successView;  
    }  
  
    public void setSuccessView(String successView) {  
        this.successView = successView;  
    }  
  
    public String getFailView() {  
        return failView;  
    }  
  
    public void setFailView(String failView) {  
        this.failView = failView;  
    }  
  
    @Override  
    protected ModelAndView handleRequestInternal(HttpServletRequest Request,  
            HttpServletResponse Response) throws Exception {  
        String username = Request.getParameter("username");  
        String password = Request.getParameter("password");  
        User user = getUser(username, password);  
        Map<String ,Object> model=new HashMap<String,Object>();  
        if(user !=null){  
            model.put("user", user);  
            return new ModelAndView(getSuccessView(),model);  
        }else{  
            model.put("error", "The password or username is wrong, please enter it again");  
            return new ModelAndView(getFailView(),model);  
        }         
    }    
    public User getUser(String username,String password){  
        if(username.equals("user") && password.equals("123456")){  
            return new User(username,password);  
        }else{  
            return null;  
        }  
    }  
}  