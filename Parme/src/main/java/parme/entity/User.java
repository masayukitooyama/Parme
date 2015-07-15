package parme.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Integer userId;
	private String name;
	@Column(name = "name_kana")
	private String nameKana;
	private String password;
	private String mail;
	@Column(name = "register_day")
	private String registerDay;
	@Column(name = "update_day")
	private String updateDay;
	private Boolean status;
	@Column(name = "borrow_day")
	private String borrowDay;
	@Column(name = "return_day")
	private String returnDay;
	@Column(name = "remind_day")
	private String remindDay;
	private Integer history;
	@Column(name = "book_id")
	private Integer bookId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameKana() {
		return nameKana;
	}

	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getRegisterDay() {
		return registerDay;
	}

	public void setRegisterDay(String registerDay) {
		this.registerDay = registerDay;
	}

	public String getUpdateDay() {
		return updateDay;
	}

	public void setUpdateDay(String updateDay) {
		this.updateDay = updateDay;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getBorrowDay() {
		return borrowDay;
	}

	public void setBorrowDay(String borrowDay) {
		this.borrowDay = borrowDay;
	}

	public String getReturnDay() {
		return returnDay;
	}

	public void setReturnDay(String returnDay) {
		this.returnDay = returnDay;
	}

	public String getRemindDay() {
		return remindDay;
	}

	public void setRemindDay(String remindDay) {
		this.remindDay = remindDay;
	}

	public Integer getHistory() {
		return history;
	}

	public void setHistory(Integer history) {
		this.history = history;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

}
