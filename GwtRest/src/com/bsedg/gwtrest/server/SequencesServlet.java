package com.bsedg.gwtrest.server;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bsedg.gwtrest.shared.Sequence;

public class SequencesServlet extends HttpServlet {
	private static final long serialVersionUID = 2531869216560653315L;
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
	    
	    resp.getWriter().println();
	}
	    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    	resp.setContentType("application/json");
	    Sequence seq = new Sequence();
	    seq.setSequenceName("AY725852.1");
	    seq.setSequence("GCGCCCGGCGGGGACTGCAGGCGATGACCCAGGATGCAGCCAGGGGCCACGACATGCACGGAGGACCGCA" +
			"TCCAGCTTGCCCTGGAACGCTGCCTGCATGGACTCAGCCTCAGCCGCTGCTCCACCTCCTGGTCAGCTGG" +
			"GCTGTGTCTGAACTGCTGGAGCCTGCAGGAGCAGGTCAGCAGGGACCCGGGCCACTTCCTTATCCTCCTT" +
			"GAGCAGATCCTGCAGAAGACCCGAGAGGTCCAGGAGAAGGGCACCTACGACCTGCTCACCCCGCTGGCCC" +
			"TGCTCTTCTATTCCACTGTTCTTTGTACACCACACCTCCCACCAGACTCGGATCTCCTTCTGAAGGCAGC" +
			"CAGCACCTACCACCGGTTCCTGACCTGGCCTGTTCCTTACTGCAGCATCTGCCAGGAGCTGCTCACCTTC" +
			"ATTGATGCTGAACTCAAGGCCCCAGGGATCTCCTACCAGAGACTGGTGAGGGCTGAGCAGGGCCTGCCCA" +
			"TCAGGAGTCACCGCAGCTCCACCGTCACCGTGCTGCTGCTGAACCCAGTGGAAGAGCAGGCCGAGTTCCT" +
			"TGCTGTAGCCAATAAGCTGAGTACGCCCGGACACTCGCCTCACAGTGCCTACACCACCCTGCTCCTGCAC" +
			"GCCTTCCAGGCCACCTTTGGGGCCCACTGTGACGTCCCGGGCCTGCACTGCAGGCTACAGACACTGCAAA" +
			"ACCAGGGAAGCTCCATACCATCCCCATCCCTGTCGCCAGGTGCTACACCTACAGCTGGAGCCAGGACAGC" +
			"TTTGACATCCTGCAGGAAATCCTGCTCAAGGAACAGGAGCTGCTCCAGCCAGGGATCCTGGGAGATGATG" +
			"AAGAGGAGGAAGAGGAGGAGGAGGAGGTGGAGGAGGACTTGGAAACTGATGGGCACTGTGCCGAGAGAGA" +
			"TTCCCTGCTCTCCAC");
	    seq.setURI("http://www.ncbi.nlm.nih.gov/nuccore/AY725852.1");
	    resp.getWriter().println("{ \"sequenceName\" : \"" + seq.getSequenceName() + "\", \"sequence\" : \"" + 
	    		seq.getSequence() + "\", \"URI\" : \"" + seq.getURI() + "\"}");
	}
	    
    @Override
    public void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
	    
	    resp.getWriter().println();
	}
	    
    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	    resp.setContentType("text/plain");
	    
	    resp.getWriter().println();
	}
}
