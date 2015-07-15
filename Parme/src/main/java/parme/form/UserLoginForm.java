/**
 * 
 */
package parme.form;

import org.seasar.struts.annotation.Required;

/**
 * ログイン画面からの入力値を受け取るクラス
 * メールアドレスとパスワードで認証する
 * @author masayukitooyama
 * 
 */
public class UserLoginForm {
	//メールアドレス
	@Required
	public String mail;
	
	//パスワード
	@Required
	public String password;
}
