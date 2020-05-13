





import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/CadCarServlet"})
public class CadCarServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        String factory = request.getParameter("factory");
        String model = request.getParameter("model");
        String year = request.getParameter("year");
        String category = request.getParameter("category");
        String cdPlayer = request.getParameter("cdPlayer");
        String dvdplayer = request.getParameter("dvdplayer");
        String available = request.getParameter("available");
        String imgCar = request.getParameter("imgCar");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadCarServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>teste 1</h2>");
            out.println("<p> retorno <br> matricula: " 
                    + id + "<br> fabricante: " 
                    + factory + "<br> Modelo: "
                    + model +"<br> Ano: " 
                    + year + "<br> categoria: "
                    + category + "<br> cdPlayer: " 
                    + cdPlayer + "<br> dvdplayer: "
                    + dvdplayer + "<br> available: "
                    + available + "<br> imgCar: "
                    + imgCar +
                    "</p>");
            out.println("</body>");
            out.println("</html>");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
