module Wishlist {

	requires org.slf4j;
	requires transitive spring.context;
	requires spring.web;
	requires spring.webmvc;
	requires jakarta.servlet;
	requires spring.context.support;
	requires java.sql;
	requires com.zaxxer.hikari;
	requires org.mybatis.spring;
	requires spring.core;
	requires spring.jdbc;
	requires spring.tx;
	requires lombok;
	requires com.fasterxml.jackson.databind;
	requires spring.beans;
}