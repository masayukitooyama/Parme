/**
 * 
 */
package parme.action;

import org.seasar.struts.annotation.Execute;

/**
 *　トップ画面
 *
 */
public class UserPageAction {
	
	//トップページを表示するメソッド
	@Execute(validator=false)
	public String index(){
		return "userPage.jsp";
	}
}
