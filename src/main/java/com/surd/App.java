package com.surd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 在这里我们使用@SpringBootApplication指定这是一个 spring boot的应用程序.
 * @author Angel -- 守护天使
 * @version v.0.1
 * @date 2016年12月10日
 */
//extends WebMvcConfigurerAdapter
@SpringBootApplication
@MapperScan(basePackages ="com.surd.springboot128.dao")
public class App{

	/**
	 * 这是springloader的配置方式：-javaagent:.\lib\springloaded-1.2.4.RELEASE.jar -noverify
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 在main方法进行启动我们的应用程序.
		 */
		SpringApplication.run(App.class, args);
	}
}
