package org.ddd.annotation.myproject3_1.util;

public @interface Column {
	public String value() default"";
	public boolean nullable() default true;
	public int length() default-1;
}
