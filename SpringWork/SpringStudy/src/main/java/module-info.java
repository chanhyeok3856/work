module SpringStudy {
	exports chan.spring.ioc;
	exports chan.spring.test;
	requires transitive spring.context;
	requires org.slf4j;
	requires spring.beans;
	requires spring.core;
	requires spring.web;
	opens bean;
}