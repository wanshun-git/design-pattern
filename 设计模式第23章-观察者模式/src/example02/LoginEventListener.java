package example02;

import java.util.EventListener;

/**
 * 抽象观察者类（登录事件监听器）
 * @author ★天命之子★
 *
 */
public interface LoginEventListener extends EventListener {

	public void validateLogin(LoginEvent event);
}
