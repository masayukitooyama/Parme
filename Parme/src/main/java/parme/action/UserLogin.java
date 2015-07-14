/**
 * 
 */
package parme.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import parme.dto.UserDto;
import parme.form.UserLoginForm;

/**
 * @author masayukitooyama
 *
 */
public class UserLogin {
	
	@ActionForm
	@Resource
	public UserLoginForm userLoginForm;
	
	@Resource
	public UserDto userDto;
	
	@Execute(validator = false)
	public String index(){
		return "login.jsp";
	}
	
}
