package polymorphism;

public class BeanFactory {
	
	public Object getBean(String beanName) {
		
		if (beanName.equals("sam")) {
			return new SamTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		}
		
		return null;
	}
}
