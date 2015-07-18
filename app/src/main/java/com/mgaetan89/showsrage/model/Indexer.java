package com.mgaetan89.showsrage.model;

public enum Indexer {
	TVDB("tvdbid"), TVRAGE("tvrageid");

	private final String paramName;

	Indexer(String paramName) {
		this.paramName = paramName;
	}

	public String getParamName() {
		return this.paramName;
	}
}
