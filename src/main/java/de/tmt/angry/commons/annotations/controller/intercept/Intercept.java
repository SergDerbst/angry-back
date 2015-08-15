package de.tmt.angry.commons.annotations.controller.intercept;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.web.servlet.HandlerInterceptor;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Intercepts.class)
@Inherited
public @interface Intercept {

	Class<? extends HandlerInterceptor> value();
}
