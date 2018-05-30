package cn.no7player.annotation;

import java.lang.annotation.*;

/**
 * @author sam
 * @since 2017/7/13
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyLog {

    String requestUrl();

}
