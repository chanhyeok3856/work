module SpringStudy {
	exports chan.spring.test;
	requires transitive spring.context;
	requires spring.web;
	requires org.slf4j;
	
}