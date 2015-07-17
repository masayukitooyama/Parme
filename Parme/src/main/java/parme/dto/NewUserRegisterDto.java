package parme.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class NewUserRegisterDto implements Serializable {

	private static final long serialVersionUID = 1L;

	public NewUserRegisterDto(){}

	/** 名前 漢字 */
	public String name;

	/** 名前 フリガナ */
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
