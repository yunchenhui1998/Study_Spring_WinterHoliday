package com.xzy;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
   private List<String> emails;
   private Properties info;
   private Map<String,String> aa;
public List<String> getEmails() {
	return emails;
}
public void setEmails(List<String> emails) {
	this.emails = emails;
}
public Properties getInfo() {
	return info;
}
public void setInfo(Properties info) {
	this.info = info;
}
public Map<String, String> getAa() {
	return aa;
}
public void setAa(Map<String, String> aa) {
	this.aa = aa;
}
   
   
}
