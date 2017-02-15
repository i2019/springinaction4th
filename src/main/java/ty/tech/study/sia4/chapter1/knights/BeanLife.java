package ty.tech.study.sia4.chapter1.knights;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class BeanLife implements BeanNameAware,BeanFactoryAware{
	private String life;
	public String getLife() {
		return life;
	}
	public void setLife(String life) {
		this.life = life;
	}
	public BeanLife(String life) {
		super();
		this.life = life;
	}

	/*如果bean实现了BeanNameAware接口，Spring将bean的ID传递给 setBean-Name()方法； */
	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName arg0="+arg0);
	}
	/*
	如果bean实现了BeanFactoryAware接口，
	Spring将调 用setBeanFactory()方法，将BeanFactory容器实例传入
	 */
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory arg0="+arg0);
	}
	
}
