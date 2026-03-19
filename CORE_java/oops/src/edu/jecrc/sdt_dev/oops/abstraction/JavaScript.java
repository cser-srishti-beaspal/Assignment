/**
 * 
 */
package edu.jecrc.sdt_dev.oops.abstraction;

/**
 * 
 */
public class JavaScript extends ProgrammingLanguage implements FrontEndTechnologies,BasicEndTechnologies {

	@Override
	public void backEndLayer() {
		System.out.println("Compatible with DB");
		
	}

	@Override
	public void frontEndLayer() {
		System.out.println("Compatible with HTML and CSS");
		
	}

	@Override
	public void feature() {
		System.out.println("Object Oriented");
		
	}

}
