package com.nstc.test;

import java.io.Serializable;
import java.util.Map;

public class Parent implements Serializable {
	private Map result;

	public Map getResult() {
		return result;
	}

	public void setResult(Map result) {
		this.result = result;
	}
}
