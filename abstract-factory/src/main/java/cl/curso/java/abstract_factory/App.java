package cl.curso.java.abstract_factory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
   
    
    String plataform = System.getProperty("os.name").toLowerCase();
    
    System.out.println(plataform);
    GUIbuilder builder = new GUIbuilder();
    if(plataform.startsWith("win"))
    	builder.builWindow(new MsWindowsWidgetFactory());
    
    else
    	builder.builWindow(new MacOsxWidgetFactory());
    }
    
}
