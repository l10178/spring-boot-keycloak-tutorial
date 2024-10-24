package com.nxest.keycloak.tutorial;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SpringBootKeycloakTutorialApplication}.
 */
@Generated
public class SpringBootKeycloakTutorialApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'springBootKeycloakTutorialApplication'.
   */
  public static BeanDefinition getSpringBootKeycloakTutorialApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringBootKeycloakTutorialApplication.class);
    beanDefinition.setTargetType(SpringBootKeycloakTutorialApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(SpringBootKeycloakTutorialApplication.class);
    beanDefinition.setInstanceSupplier(SpringBootKeycloakTutorialApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
