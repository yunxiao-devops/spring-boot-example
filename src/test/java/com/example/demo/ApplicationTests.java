package com.example.demo;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ApplicationTests {

	@Test
	public void testcase1() {
		assertThat(1, is(1));
	}

	@Test
	public void testcase2() {
		assertThat(1, is(2));
	}

	@Test
	@Ignore
	public void skiptestcase() {
		assertThat(1, is(2));
	}

}
