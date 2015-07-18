package parme.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Bookinfoテーブル用エンティティクラス
 * @author andoharuka
 */
public class Bookinfo {

	/**
	 * 本のID
	 */
	@Id
	@GeneratedValue
	@Column(name = "book_id")
	public Integer bookId;

	/**
	 * タイトル
	 */
	public String title;
	
	/**
	 * 作者
	 */
	public String author;

	/**
	 * カテゴリー
	 */
	public String category;
	
	/**
	 * 出版社
	 */
	public String publisher;

	/**
	 * 値段
	 */
	public Integer price;

	/**
	 * 表紙
	 */
	public String coverimg;
	
	/**
	 * ステータス
	 */
	public Boolean status;

	/**
	 * 
	 */
	public Integer storage;

}
