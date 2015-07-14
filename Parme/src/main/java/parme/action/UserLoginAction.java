/**
 * 
 */
package parme.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.enums.SaveType;

import parme.dto.UserDto;
import parme.form.UserLoginForm;

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
	
	
	@Execute(validator = false)
	public String index(){
		return "login.jsp";
	}
	
	@Execute(validator = true, input = "index?redirect=true", saveErrors=SaveType.SESSION, removeActionForm=true)
	public String login(){
		
		return "login.jsp";
	}
}
