package com.bsedg.gwtrest.shared;

import java.io.Serializable;

public class Sequence implements Serializable {
	private static final long serialVersionUID = -58068350309073520L;

	private String sequenceName;	
	private String sequence;
	private String URI;
	
	public Sequence() {
		
	}
	
	public String getSequenceName() {
		return sequenceName;
	}
	
	public void setSequenceName(String seqName) {
		sequenceName = seqName;
	}
	
	public String getSequence() {
		return sequence;
	}
	
	public void setSequence(String seq) {
		sequence = seq;
	}
	
	public void setURI(String uri) {
		URI = uri;
	}
	
	public String getURI() {
		return URI;
	}
}
