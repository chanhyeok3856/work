module SpringStudy {
	exports chan.spring.ioc;
	exports chan.spring.test;
	exports chan.spring.scope;
	requires org.slf4j;
	requires spring.beans;
	requires transitive spring.context;
	requires spring.core;
	requires spring.web;
	opens bean;
}