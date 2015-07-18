package parme.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
/**
 * ユーザーの情報を保持するDto
 * @author masayukitooyama
 *
 */
@Component(instance = InstanceType.SESSION)
public class UserDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public UserDto(){}
	/** メールアドレス */
	public String mail;
	/** パスワード */
	public String password;
	
}
