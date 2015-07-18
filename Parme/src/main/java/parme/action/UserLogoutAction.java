/**
 * 
 */
package parme.action;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

/**
 * @author masayukitooyama
 *
 */
public class UserLogoutAction {
	
	@Execute(validator = false)
	@RemoveSession(name = "userInfoDto")
	public String logout() {
		return "/login?redirect=true";
	}
}
