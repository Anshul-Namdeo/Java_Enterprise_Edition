import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ActionServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<H1>!!!!!Method Not Supported Demo!!!!!</H1>");

        pw.flush();
        pw.close();
    }


}