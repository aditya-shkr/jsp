package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class arrayDesc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 int arr[]={2,77,4,69,2,7,68,5,78,79,80,7,61,5,75,4,8,7,6,67,5,4,4,66,5,43,5,66,62,63,80,5,7,15,45,57,32,67,45,87,34,46,43,24,9,23,
        75,3,32,78,5,54,65,76,74,34,7,75,64,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,8,5,85,83,82,81,73,23,34,56,53,72,32,63,86,46,76,54,70,43,87,53,13,58,59,60,71};
          out.println("Original Array:"); 
        for(int i=0;i<100;i++)
        {
            out.println(arr[i]+",");
        }
        
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        ");

            out.println("After Sorting:(Descending)");
        for(int i=0;i<100;i++)
            {
                for(int j=i+1;j<100;j++)
                {
                    if(arr[i]<arr[j])
                    {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                    }
                }
            }
            for(int i=0;i<100;i++)
            {
                out.println(arr[i]+",");
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
