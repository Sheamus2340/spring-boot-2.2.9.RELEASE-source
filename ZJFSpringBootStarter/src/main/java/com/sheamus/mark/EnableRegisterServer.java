package com.sheamus.mark;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * title：
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(ConfigMarker.class)
public @interface EnableRegisterServer {

}
