package cl.curso.java.abstract_factory;

public class MacOsxWidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {
		
		return new MacOsxWindow();
	}

}
