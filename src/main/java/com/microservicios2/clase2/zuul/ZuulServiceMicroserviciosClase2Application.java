package com.microservicios2.clase2.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.microservicios2.clase2.zuul.filters.ErrorFilter;
import com.microservicios2.clase2.zuul.filters.PostFilter;
import com.microservicios2.clase2.zuul.filters.PreFilter;
import com.microservicios2.clase2.zuul.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulServiceMicroserviciosClase2Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServiceMicroserviciosClase2Application.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
	    return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
	    return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
	    return new RouteFilter();
	}

}
