/**
 * 
 */
package parme.action;

import org.seasar.struts.annotation.Execute;

/**
 * @author nagaimidori
 *
 */
public class MypageAction {
	
	@Execute(validator = false)
	public String index(){
		return "index.jsp";
	}
}
