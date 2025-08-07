package com.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = {"com.aop"})
@EnableAspectJAutoProxy
public class UserConfig {

}
