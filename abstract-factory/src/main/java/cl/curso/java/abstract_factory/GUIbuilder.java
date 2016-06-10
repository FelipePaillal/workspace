/**
 * 
 */
package cl.curso.java.abstract_factory;

/**
 * @author gonza
 *
 */
public class GUIbuilder {
	
	public Window builWindow(AbstractWidgetFactory factory)
	{
		return factory.createWindow();
	}
	

}
