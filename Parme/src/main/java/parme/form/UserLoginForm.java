/**
 * 
 */
package parme.form;

import org.seasar.struts.annotation.Required;

/**
 * @author masayukitooyama
 *
 */
public class UserLoginForm {
	
	@Required
	public String mail;
	
	@Required
	public String password;
}
