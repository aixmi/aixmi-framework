package io.github.aixmi.spring.support;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;

import java.util.Map;
import java.util.Objects;


@Slf4j
public class BeanRegistrationUtil {


	/**
	 * https://xwjie.github.io/spring/spring-inject-bean.html
	 */
	public static void registerBean(String name, Object obj) {
		ApplicationContext applicationContext = SpringContextHolder.getContext();
		if (applicationContext == null) {
			log.warn("current applicationContext is null, register {} bean failed", name);
			return;
		}

		// 获取BeanFactory
		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext
				.getAutowireCapableBeanFactory();

		// 动态注册bean.
		defaultListableBeanFactory.registerSingleton(name, obj);

	}

	public static boolean registerBeanDefinitionIfNotExists(BeanDefinitionRegistry registry, String beanName,
															Class<?> beanClass) {
		return registerBeanDefinitionIfNotExists(registry, beanName, beanClass, null);
	}

	public static boolean registerBeanDefinitionIfNotExists(BeanDefinitionRegistry registry, String beanName,
															Class<?> beanClass, Map<String, Object> extraPropertyValues) {
		if (registry.containsBeanDefinition(beanName)) {
			return false;
		}

		String[] candidates = registry.getBeanDefinitionNames();

		for (String candidate : candidates) {
			BeanDefinition beanDefinition = registry.getBeanDefinition(candidate);
			if (Objects.equals(beanDefinition.getBeanClassName(), beanClass.getName())) {
				return false;
			}
		}

		BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(beanClass).getBeanDefinition();

		if (extraPropertyValues != null) {
			for (Map.Entry<String, Object> entry : extraPropertyValues.entrySet()) {
				beanDefinition.getPropertyValues().add(entry.getKey(), entry.getValue());
			}
		}

		registry.registerBeanDefinition(beanName, beanDefinition);

		return true;
	}


}
