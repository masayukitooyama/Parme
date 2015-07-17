package parme.service;

import org.seasar.extension.jdbc.service.S2AbstractService;

import parme.dto.NewUserRegisterDto;
import parme.entity.User;
import parme.form.NewUserRegisterForm;

public class NewUserRegisterService extends S2AbstractService<User> {

	public NewUserRegisterForm newUserRegisterForm;

	public int insert(NewUserRegisterDto newUserRegisterDto) {
		User entity = new User();
		// entitiyがカプセル化してあってメンドイけど
		// カプセル化したままでいきます？
		return insert(entity);
	}
}