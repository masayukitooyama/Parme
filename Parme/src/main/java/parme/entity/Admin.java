package parme.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Adminテーブル用エンティティクラス
 * @author andoharuka
 */
public class Admin {

	/**
	 * ID
	 */
	@Id
	@GeneratedValue
	public String id;

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

}
