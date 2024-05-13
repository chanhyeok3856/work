module SpringStudy {
	exports chan.spring.ioc;
	exports chan.spring.test;
	exports chan.spring.scope;
	exports chan.spring.injection;
	exports chan.spring.dept.dao;
	exports chan.spring.dept.dto;
	exports chan.spring.dept.service;
	exports chan.spring.dept.controller;
	
	requires jakarta.inject;
	requires org.slf4j;
	requires spring.beans;
	requires transitive spring.context;
	requires spring.core;
	requires spring.web;
	requires lombok;
	requires spring.webmvc;
	requires jakarta.servlet;
	requires spring.aop;
	requires org.aspectj.weaver;
	requires java.sql;
	requires spring.test;
	requires spring.jdbc;
	requires spring.tx;
	requires transitive org.mybatis.spring;
	requires net.coobird.thumbnailator;
	requires spring.context.support;
	requires jakarta.mail;
	opens bean;
	opens chan.spring.injection;
	opens chan.spring.configuration.scope;
	opens chan.spring.lombok;
	opens chan.spring.test;
	opens chan.spring.dept.dao;
	opens chan.spring.dept.controller;
	opens configuration;
	opens mapper;
}