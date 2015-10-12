package com.nstc.cglibProxy;

import org.junit.Test;

public class TestCglib {

	@Test
	public void testCglib() {
		BookFacadeCglib cglib = new BookFacadeCglib();
		BookFacadeImpl bookCglib = (BookFacadeImpl) cglib
				.getInstance(new BookFacadeImpl());
		bookCglib.addBook();
	}
}