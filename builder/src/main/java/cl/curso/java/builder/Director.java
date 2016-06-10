/**
 * 
 */
package cl.curso.java.builder;

/**
 * @author gonza
 *
 */
public class Director {
	
	private BuilderAuto builder;

	public Director(BuilderAuto builder) {
		super();
		this.builder = builder;
	}

	public BuilderAuto getBuilder() {
		return builder;
	}

	public void setBuilder(BuilderAuto builder) {
		this.builder = builder;
	}
	
	public void construirAuto(Auto auto){
		
	}

}
