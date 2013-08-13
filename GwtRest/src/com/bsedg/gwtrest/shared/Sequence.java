package com.bsedg.gwtrest.shared;

import java.io.Serializable;

import com.googlecode.objectify.annotation.Indexed;

public class Sequence implements Serializable {
	private static final long serialVersionUID = -58068350309073520L;

	@Indexed private @Id Long id;
	@Indexed private String sequenceName;	
	private String sequence;
	private String URI;
	
	public Sequence() {
		
	}
	
	public Long getId() {
		return id;
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
