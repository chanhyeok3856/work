module SpringStudy {
	exports chan.spring.ioc;
	exports chan.spring.test;
	exports chan.spring.scope;
	exports chan.spring.injection;
	
	requires org.slf4j;
	requires spring.beans;
	requires spring.context;
	requires spring.core;
	requires spring.web;
	requires lombok;
	opens bean;
}