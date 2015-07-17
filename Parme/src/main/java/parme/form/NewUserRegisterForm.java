package parme.form;

import java.sql.Timestamp;

import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Msg;

public class NewUserRegisterForm {

	/** 名前 漢字 */
	@Maxlength(maxlength=100)
	@Mask(mask = "^[^ -~｡-ﾟ]*$", msg = @Msg(key = "errors.fullWidth"))
	public String name;

	/** 名前 フリガナ */
	@Maxlength(maxlength=500)
	@Mask(mask = "^[\u30A0-\u30FF]+$", msg = @Msg(key = "errors.katakana"))
	public String nameKana;

	/** パスワード */
	public String password;

	/** メール */
	public String mail;

	/** 登録日時 */
	public Timestamp resisterTime;

	// =====================================================================
	// ここから下は新規登録時はいらないかも？
	// ========================================
	/** 更新日 */
	public Timestamp updateTime;

	/** ステータス */
	public boolean status;

	/** 貸出日 */
	public String borrowDay;

	/** 返却日 */
	public String returnDay;

	/** リマインド？ */
	public String remindDay;

	/** 履歴 */
	public Integer history;
}
