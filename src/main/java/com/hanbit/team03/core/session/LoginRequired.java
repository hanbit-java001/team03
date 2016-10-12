package com.hanbit.team03.core.session;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Target;

@Target(METHOD)
public @interface LoginRequired {

}
