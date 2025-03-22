import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/records.do")
public class RecordsServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
        String json = "{\"name\" :\"jagdeesh\", \"age\": 20, \"college\": \"GGITS\"}";

        response.getWriter().write(json);
    }
}

