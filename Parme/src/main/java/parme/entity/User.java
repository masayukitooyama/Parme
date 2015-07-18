package parme.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Userテーブル用エンティティクラス.
 * @author andoharuka
 */
public class User {

	/**
	 * ユーザーID
	 */
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	public Integer userId;

	/**
	 * 名前
	 */
	public String name;

	/**
	 * 名前（カナ）
	 */
	@Column(name = "name_kana")
	public String nameKana;

	/**
	 * パスワード
	 */
	public String password;

	/**
	 * メールアドレス
	 */
	public String mail;

	/**
	 * 登録日
	 */
	@Column(name = "register_day")
	public String registerDay;

	/**
	 * 更新日
	 */
	@Column(name = "update_day")
	public String updateDay;

	/**
	 * ステータス 0:借りている 1:かりていない
	 */
	public Boolean status;

	/**
	 * 借りた日
	 */
	@Column(name = "borrow_day")
	public String borrowDay;

	/**
	 * 返却予定日
	 */
	@Column(name = "return_day")
	public String returnDay;

	/**
	 * リマインド日
	 */
	@Column(name = "remind_day")
	public String remindDay;

	/**
	 * 利用回数
	 */
	public Integer history;

	/**
	 * 本のID
	 */
	@Column(name = "book_id")
	public Integer bookId;

}
