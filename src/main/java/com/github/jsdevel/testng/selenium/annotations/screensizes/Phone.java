package com.github.jsdevel.testng.selenium.annotations.screensizes;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Using this annotation with {@link org.testng.annotations.Test} will cause the
 * current {@link com.github.jsdevel.testng.selenium.MethodContext} to receive a
 * {@link org.openqa.selenium.WebDriver} instance set to Phone
 * dimension 426x320 (based off of <a href="http://getbootstrap.com/css/#grid-media-queries">bootstrap breakpoints</a>).
 * 
 * @author Joseph Spencer
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Phone {
  int height() default 320;
  int width() default 426;
}
