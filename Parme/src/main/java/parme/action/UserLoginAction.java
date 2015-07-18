/**
 * 
 */
package parme.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import parme.dto.UserDto;
import parme.form.UserLoginForm;
import parme.service.UserLoginService;

/**
 * @author masayukitooyama
 *
 */
public class UserLoginAction {
	
	@ActionForm
	@Resource
	public UserLoginForm userLoginForm;
	
	@Resource
	public UserDto userDto;
	
	@Resource
	public UserLoginService userLoginService;
	
	//ログイ画面を表示するメソッド
	@Execute(validator = false)
	public String index(){
		return "login.jsp";
	}
	//ログイン判定を行うメソッド
	@Execute(validator = true, input = "index?redirect=true", removeActionForm=true)
	public String login(){
		
		return "login.jsp";
	}
}
