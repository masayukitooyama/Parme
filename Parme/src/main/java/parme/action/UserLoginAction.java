/**
 * 
 */
package parme.action;

import javax.annotation.Resource;

import org.seasar.framework.util.StringUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import parme.dto.UserInfoDto;
import parme.form.UserLoginForm;
import parme.service.UserLoginService;

/**
 * @author masayukitooyama
 *
 */
public class UserLoginAction {
	
	@ActionForm
	@Resource
	protected UserLoginForm userLoginForm;
	
	@Resource
	protected UserInfoDto userInfoDto;
	
	@Resource
	protected UserLoginService userLoginService;
	
	/**
	 * @return ログイン画面
	 */
	@Execute(validator = false)
	public String index(){
		return "index.jsp";
	}
	
	/** 
	 * ログイン判定
	 * @return　
	 * 　成功ならマイページへ
	 * 　失敗ならログイン画面へ遷移
	 */
	@Execute(validator = true, input = "index?redirect=true", removeActionForm=true)
	public String judgeLogin(){
		userInfoDto.mail      = userLoginForm.mail;
		userInfoDto.password  = userLoginForm.password;
		if(userLoginService.isUserExist(userInfoDto.mail, userInfoDto.password)){
			return "";
		}
		return "login.jsp";
	}
}
