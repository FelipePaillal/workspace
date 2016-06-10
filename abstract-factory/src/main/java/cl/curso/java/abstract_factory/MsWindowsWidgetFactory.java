/**
 * 
 */
package cl.curso.java.abstract_factory;

/**
 * @author gonza
 *
 */
public class MsWindowsWidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {
		return new MSwindow();
		
	}

}
