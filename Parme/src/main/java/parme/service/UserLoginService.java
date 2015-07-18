/**
 * 
 */
package parme.service;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

import parme.dto.UserInfoDto;
import parme.entity.User;

/**
 * @author masayukitooyama
 *
 */
public class UserLoginService extends S2AbstractService<User> {
	
	User entity = new User();

	public boolean isUserExist(String mail, String password) {
		UserInfoDto userInfoDto = getUserInfoDto(mail, password);
		boolean a = mail.equals(userInfoDto.mail);
		boolean b = password.equals(userInfoDto.password);
		return ( a && b );
	}

	private UserInfoDto getUserInfoDto(String mail, String password) {
		User userEntity = select().where(new SimpleWhere().eq(("mail", mail),("password", password)).getSingleResult();
		
		UserInfoDto userInfoDto = createUserInfoDto(userEntity);
		
		return userInfoDto ;
	}

	private UserInfoDto createUserInfoDto(User userEntity) {
		UserInfoDto userInfoDto = new UserInfoDto();
		userInfoDto.mail = userEntity.mail;
		userInfoDto.password = userEntity.password;
		return userInfoDto;
	}
	
	
	
}
