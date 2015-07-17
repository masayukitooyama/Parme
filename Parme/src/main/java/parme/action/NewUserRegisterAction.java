package parme.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.util.TokenProcessor;
import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import parme.dto.NewUserRegisterDto;
import parme.form.NewUserRegisterForm;
import parme.service.NewUserRegisterService;

public class NewUserRegisterAction {

	@ActionForm
	@Resource
	public NewUserRegisterForm newUserRegister;

	@Resource
	public NewUserRegisterService newUserRegisteService;

	@Resource
	protected HttpServletRequest request;

	NewUserRegisterDto  newUserRegisterDto;

	/**
	 * 新規登録入力フォーム
	 * @return
	 */
	@Execute(validator = false)
	public String index() {
		TokenProcessor.getInstance().saveToken(request);
		return "resisterInput.jsp";
	}

	/**
	 * 新規登録確認画面へ
	 * @return
	 */
	@Execute(validator = false)
	public String goRegisterConfirm() {

		newUserRegisterDto.name         = newUserRegister.name;
		newUserRegisterDto.nameKana     = newUserRegister.nameKana;
		newUserRegisterDto.password     = newUserRegister.password;
		newUserRegisterDto.mail         = newUserRegister.mail;
		newUserRegisterDto.resisterTime = newUserRegister.resisterTime;
		newUserRegisterDto.updateTime   = newUserRegister.updateTime;
		newUserRegisterDto.status       = newUserRegister.status;
		newUserRegisterDto.borrowDay    = newUserRegister.borrowDay;
		newUserRegisterDto.returnDay    = newUserRegister.returnDay;
		newUserRegisterDto.remindDay    = newUserRegister.remindDay;
		newUserRegisterDto.history      = newUserRegister.history;

		return "registerConfirm.jsp";
	}

	/**
	 * 新規登録完了画面へ
	 * @return
	 */
	@Execute(validator = false)
	@RemoveSession(name = "newUserRegisterDto")
	public String goResisterConpleted() {

		newUserRegisteService.insert(newUserRegisterDto);

		return "registerCompleted.jsp";
	}

	/**
	 * 新規登録入力フォームへ戻る
	 * @return
	 */
	@Execute(validator = false)
	public String goBackInput() {

		newUserRegister.name         = newUserRegisterDto.name;
		newUserRegister.nameKana     = newUserRegisterDto.nameKana;
		newUserRegister.password     = newUserRegisterDto.password;
		newUserRegister.mail         = newUserRegisterDto.mail;
		newUserRegister.resisterTime = newUserRegisterDto.resisterTime;
		newUserRegister.updateTime   = newUserRegisterDto.updateTime;
		newUserRegister.status       = newUserRegisterDto.status;
		newUserRegister.borrowDay    = newUserRegisterDto.borrowDay;
		newUserRegister.returnDay    = newUserRegisterDto.returnDay;
		newUserRegister.remindDay    = newUserRegisterDto.remindDay;
		newUserRegister.history      = newUserRegisterDto.history;

		return "registerConfirm.jsp";
	}

	/**
	 * ワンタイムトークン
	 * @return
	 */
	public ActionMessages validate() {
		ActionMessages errors = new ActionMessages();
		if (!TokenProcessor.getInstance().isTokenValid(request, true)) {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"errors.invalid",
					"二度押し"));
		}
		return errors;
	}
}
