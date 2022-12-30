/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.rn.emater;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author cledsonfs
 */
public class ListarBasesServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        File file = new File("c:/SIAFF/WSIAFF/bases");

        PrintWriter out = response.getWriter();

        try {
            out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"pt\" lang=\"pt\">");
            out.println("  <head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");

            out.println("    <meta name=\"Generator\" content=\"iWeb 3.0.2\" />");
            out.println("    <meta name=\"iWeb-Build\" content=\"local-build-20100920\" />");
            out.println("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\" />");
            out.println("    <meta name=\"viewport\" content=\"width=700\" />");
            out.println("    <title>SIAFF ");
            out.println("    Sistema Inteligente da Analise da Folha do Feijoeiro</title>");
            out.println("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen,print\" href=\"Bases_files/Bases.css\" />");
            out.println("    <!--[if lt IE 8]><link rel='stylesheet' type='text/css' media='screen,print' href='/Bases_files/Carga_de_ConhecimentoIE.css'/><![endif]-->");
            out.println("    <!--[if gte IE 8]><link rel='stylesheet' type='text/css' media='screen,print' href='Media/IE8.css'/><![endif]-->");
            out.println("    <script type=\"text/javascript\" src=\"Scripts/iWebSite.js\"></script>");
            out.println("    <script type=\"text/javascript\" src=\"Scripts/Widgets/SharedResources/WidgetCommon.js\"></script>");
            out.println("    <script type=\"text/javascript\" src=\"Scripts/Widgets/Navbar/navbar.js\"></script>");
            out.println("    <script type=\"text/javascript\" src=\"Scripts/iWebImage.js\"></script>");
            out.println("    <script type=\"text/javascript\" src=\"Bases_files/Bases.js\"></script>");
            out.println("  </head>");
            out.println("  <body style=\"background: rgb(255, 255, 255) url(Bases_files/Creme_browserbg.jpg) repeat scroll top left; margin: 0pt; \" onload=\"onPageLoad();\" onunload=\"onPageUnload();\">");
            out.println("    <div style=\"text-align: center; \">");
            out.println("      <div style=\"margin-bottom: 20px; margin-left: auto; margin-right: auto; margin-top: 20px; overflow: hidden; position: relative; word-wrap: break-word;  text-align: left; width: 700px; \" id=\"body_content\">");
            out.println("        <div style=\"background: transparent url(Bases_files/LayeredPaper_03-1.jpg) repeat scroll top left; width: 700px; \">");
            out.println("          <div style=\"height: 136px; margin-left: 0px; position: relative; width: 700px; z-index: 5; \" id=\"header_layer\">");
            out.println("            <div style=\"height: 0px; line-height: 0px; \" class=\"bumper\"> </div>");
            out.println("            <div style=\"height: 248px; width: 700px;  height: 248px; left: 0px; position: absolute; top: 0px; width: 700px; z-index: 1; \" class=\"tinyText style_SkipStroke\">");
            out.println("              <img src=\"Bases_files/LayeredPaper_01.jpg\" alt=\"\" style=\"border: none; height: 248px; width: 700px; \" />");
            out.println("            </div>");
            out.println("            <div style=\"height: 117px; width: 625px;  height: 114px; left: 20px; position: absolute; top: 22px; width: 625px; z-index: 1; \" class=\"tinyText style_SkipStrokeSkipFillSkipOpacity\">");
            out.println("              <div style=\"position: relative; width: 625px; \">");
            out.println("                <img src=\"Bases_files/shapeimage_1.png\" alt=\"SIAFF &#10;Sistema Inteligente da Analise da Folha do Feijoeiro\" style=\"height: 111px; left: 0px; margin-left: 23px; margin-top: 6px; position: absolute; top: 0px; width: 578px; \" />");
            out.println("              </div>");
            out.println("            </div>");
            out.println("          </div>");
            out.println("          <div style=\"margin-left: 0px; position: relative; width: 700px; z-index: 10; \" id=\"nav_layer\">");
            out.println("            <div style=\"height: 0px; line-height: 0px; \" class=\"bumper\"> </div>");
            out.println("            <div style=\"height: 1px; line-height: 1px; \" class=\"tinyText\"> </div>");
            out.println("            <div class=\"com-apple-iweb-widget-navbar flowDefining\" id=\"widget0\" style=\"margin-left: 14px; margin-top: -1px; opacity: 1.00; position: relative; width: 633px; z-index: 1; \">");
            out.println("              <div id=\"widget0-navbar\" class=\"navbar\">");
            out.println("                <div id=\"widget0-bg\" class=\"navbar-bg\">");
            out.println("                  <ul id=\"widget0-navbar-list\" class=\"navbar-list\">");
            out.println(" <li></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");
            out.println("&nbsp;Bases<hr/>");

            out.println("            </div>");
            out.println("            <script type=\"text/javascript\">");
            out.println("new NavBar('widget0', 'Scripts/Widgets/Navbar', 'Scripts/Widgets/SharedResources', '.', {\"path-to-root\": \"\", \"navbar-css\": \".navbar {\\n\\tfont-family: 'Hoefler Text', 'Times New Roman', serif;\\n\\tfont-size: .9em;\\n\\tcolor: #817B67;\\n\\tmargin: 0px;\\n\\tline-height: 25px;\\n}\\n\\n.navbar-bg {\\n\\ttext-align: left;\\n}\\n\\n.navbar-bg ul {\\n\\tlist-style: none;\\n\\tmargin: 0px;\\n\\tpadding: 0px;\\n}\\n\\n\\nli {\\n\\tlist-style-type: none;\\n\\tdisplay: inline;\\n\\tpadding: 0 25px 0 0px;\\n}\\n\\n\\nli a {\\n\\ttext-decoration: none;\\n\\tpadding: 0px;\\n\\tcolor: #817B67;\\n}\\n\\nli a:visited {\\n\\ttext-decoration: none;\\n\\tpadding: 0px;\\n\\tcolor: #817B67;\\n}\\n\\nli a:hover\\r{\\r\\n \\tcolor: #3F3F3C;\\n\\ttext-decoration: none;\\r}\\n\\n\\nli.current-page a\\r{\\r\\t color: #3F3F3C;\\n\\ttext-decoration: none;\\r}\", \"current-page-GUID\": \"8F93EE72-BC90-4932-A143-3263EEA30DA0\", \"isCollectionPage\": \"NO\"});");
            out.println("</script>");
            out.println("            <div style=\"clear: both; height: 0px; line-height: 0px; \" class=\"spacer\"> </div>");
            out.println("          </div>");
            out.println("          <div style=\"margin-left: 0px; position: relative; width: 700px; z-index: 15; \" id=\"body_layer\">");
            out.println("            <div style=\"height: 0px; line-height: 0px; \" class=\"bumper\"> </div>");
            out.println("            <div id=\"id1\" style=\"height: 24px; left: 15px; position: absolute; top: 13px; width: 198px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\">");
            out.println("              <div class=\"text-content graphic_textbox_layout_style_default_External_198_24\" style=\"padding: 0px; \">");
            out.println("                <div class=\"graphic_textbox_layout_style_default\">");
            out.println("                  <p style=\"padding-bottom: 0pt; padding-top: 0pt; \">Bases Existentes no Sistema:");
            out.println("    <table width=\"610\" border=\"1\" style=\"padding-bottom: 0pt; padding-top: 0pt; text-align: center;\" >");
            out.println("  <tr>");
            out.println("    <th width=\"350\" scope=\"col\">Arquivo</th>");
            out.println("    <th width=\"130\" scope=\"col\">Tamanho</th>");
            out.println("    <th width=\"130\" scope=\"col\">Data do Upload</th>");
            out.println("  </tr>");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            for (File f : file.listFiles()) {
                out.println("  <tr>");
                out.println("    <td>" + f.getName() + "</td>");
                out.println("    <td>" + f.length() + " bytes</td>");
                out.println("    <td>" + sdf.format(f.lastModified()) + "</td>");
                out.println("  </tr>");
            }

            out.println("</table>");
            out.println("            <span style=\"padding-bottom: 0pt; padding-top: 0pt; \"> <a href=\"addBase\">Adicionar um arquivo</a></span><br/>");
            out.println("               </p> </div>");
            out.println("              </div>");
            out.println("            </div>");
            out.println("            <div style=\"height: 480px; line-height: 480px; \" class=\"spacer\"> </div>");
            out.println("          </div>");
            out.println("          <div style=\"height: 120px; margin-left: 0px; position: relative; width: 700px; z-index: 0; \" id=\"footer_layer\">");
            out.println("            <div style=\"height: 0px; line-height: 0px; \" class=\"bumper\"> </div>");
            out.println("           <div style=\"height: 236px; width: 700px;  height: 236px; left: 0px; position: absolute; top: -116px; width: 700px; z-index: 1; \" class=\"tinyText style_SkipStroke\">");
            out.println("              <img src=\"Bases_files/LayeredPaper_04.jpg\" alt=\"\" style=\"border: none; height: 236px; width: 700px; \" />");
            out.println("            </div>");
            out.println("            <div style=\"height: 90px; width: 664px;  height: 90px; left: 4px; position: absolute; top: 27px; width: 664px; z-index: 1; \" class=\"tinyText shadow_0\">");
            out.println("              <div style=\"position: relative; width: 664px; \">");
            out.println("                <img src=\"Bases_files/shapeimage_2.png\" alt=\"\" style=\"height: 90px; left: 0px; position: absolute; top: 0px; width: 664px; \" />");
            out.println("              </div>");
            out.println("            </div>");
            out.println("            <div style=\"height: 56px; width: 210px;  height: 56px; left: 21px; position: absolute; top: 49px; width: 210px; z-index: 1; \" class=\"tinyText style_SkipStroke_2\">");
            out.println("              <img src=\"Bases_files/droppedImage.jpg\" alt=\"\" style=\"border: none; height: 56px; width: 210px; \" />");
            out.println("            </div>");
            out.println("            <div style=\"height: 63px; width: 88px;  height: 63px; left: 389px; position: absolute; top: 40px; width: 88px; z-index: 1; \" class=\"tinyText style_SkipStroke_2\">");
            out.println("              <img src=\"Bases_files/droppedImage_1.jpg\" alt=\"\" style=\"border: none; height: 63px; width: 89px; \" />");
            out.println("            </div>");
            out.println("            <div style=\"height: 65px; width: 82px;  height: 65px; left: 262px; position: absolute; top: 44px; width: 82px; z-index: 1; \" class=\"tinyText style_SkipStroke_2\">");
            out.println("              <img src=\"Bases_files/droppedImage_2.jpg\" alt=\"\" style=\"border: none; height: 65px; width: 82px; \" />");
            out.println("            </div>");
            out.println("            <div style=\"height: 78px; width: 144px;  height: 78px; left: 510px; position: absolute; top: 33px; width: 144px; z-index: 1; \" class=\"tinyText style_SkipStroke_2\">");
            out.println("              <img src=\"Bases_files/droppedImage_3.jpg\" alt=\"\" style=\"border: none; height: 78px; width: 145px; \" />");
            out.println("            </div>");
            out.println("          </div>");
            out.println("        </div>");
            out.println("      </div>");
            out.println("    </div>");
            out.println("  </body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}
