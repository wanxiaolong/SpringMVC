package com.abc.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.abc.springmvc.entity.Account;

public class LoginController extends AbstractController {
    private String successView;
    private String failView;//这两个参数是返回值传给applicationContext.xml，进行页面分配
    
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
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
        String cardNo=request.getParameter("cardNo");
        String password=request.getParameter("password");
        Account account = getAccount(cardNo,password);
        Map<String ,Object> model=new HashMap<String,Object>();
        if(account !=null){
            model.put("account", account);
            return new ModelAndView(getSuccessView(),model);
        }else{
            model.put("error", "卡号和密码不正确");
            return new ModelAndView(getFailView(),model);
        }
    }
    //本应该这个方法写在模型层，这地方直接给放在了逻辑层这个地方偷懒了。
    public Account getAccount(String cardNo,String password){
        if(cardNo.equals("123")&&password.equals("123")){
            Account account =new Account();
            account.setCardNo(cardNo);
            account.setPassword(password);
            account.setBalance(88.8f);
            return account;
        }else{
            return null;
        }
    }

}
