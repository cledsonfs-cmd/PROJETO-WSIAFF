/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.rn.emater;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;
import org.neuroph.contrib.imgrec.ImageRecognitionPlugin;
import org.neuroph.core.NeuralNetwork;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import br.gov.rn.emater.Classes.Amostra;
import br.gov.rn.emater.Controler.AmostraController;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import br.gov.rn.emater.Classes.Reconhecimento;
import br.gov.rn.emater.Controler.AnaliseController;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.struts2.dispatcher.mapper.ActionMapping;

/**
 *
 * @author cledsonfs
 */
public class ResultadoServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String base = request.getParameter("base");        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        NumberFormat numberFormat = DecimalFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(4);

        String nome = "/WSIAFF/imgrec/reconhecer.jpeg";
        List<Reconhecimento> resultado = reconhecimento(base, nome);

        try {
            out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"pt\" lang=\"pt\">");
            out.println("<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");

            out.println("<meta name=\"Generator\" content=\"iWeb 3.0.2\" />");
            out.println("<meta name=\"iWeb-Build\" content=\"local-build-20101103\" />");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\" />");
            out.println("<meta name=\"viewport\" content=\"width=700\" />");
            out.println("<title>SIAFF ");
            out.println("Sistema Inteligente da Analise da Folha do Feijoeiro</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen,print\" href=\"Resultado_files/Resultado.css\" />");
            out.println("<!--[if lt IE 8]><link rel='stylesheet' type='text/css' media='screen,print' href='Resultado_files/ResultadoIE.css'/><![endif]-->");
            out.println("<!--[if gte IE 8]><link rel='stylesheet' type='text/css' media='screen,print' href='Media/IE8.css'/><![endif]-->");
            out.println("<script type=\"text/javascript\" src=\"Scripts/iWebSite.js\"></script>");
            out.println("<script type=\"text/javascript\" src=\"Scripts/Widgets/SharedResources/WidgetCommon.js\"></script>");
            out.println("<script type=\"text/javascript\" src=\"Scripts/Widgets/Navbar/navbar.js\"></script>");
            out.println("<script type=\"text/javascript\" src=\"Scripts/iWebImage.js\"></script>");
            out.println("<script type=\"text/javascript\" src=\"Resultado_files/Resultado.js\"></script>");
            out.println("</head>");
            out.println("<body style=\"background: rgb(255, 255, 255) url(Resultado_files/Creme_browserbg.jpg) repeat scroll top left; margin: 0pt; \" onload=\"onPageLoad();\" onunload=\"onPageUnload();\">");
            out.println("<div style=\"text-align: center; \">");
            out.println("<div style=\"margin-bottom: 20px; margin-left: auto; margin-right: auto; margin-top: 20px; overflow: hidden; position: relative; word-wrap: break-word;  text-align: left; width: 700px; \" id=\"body_content\">");
            out.println("<div style=\"background: transparent url(Resultado_files/LayeredPaper_03-1.jpg) repeat scroll top left; width: 700px; \">");
            out.println("<div style=\"height: 136px; margin-left: 0px; position: relative; width: 700px; z-index: 5; \" id=\"header_layer\">");
            out.println("<div style=\"height: 0px; line-height: 0px; \" class=\"bumper\"> </div>");
            out.println("<div style=\"height: 248px; width: 700px;  height: 248px; left: 0px; position: absolute; top: 0px; width: 700px; z-index: 1; \" class=\"tinyText style_SkipStroke\">");
            out.println("  <img src=\"Resultado_files/LayeredPaper_01.jpg\" alt=\"\" style=\"border: none; height: 248px; width: 700px; \" />");
            out.println("            </div>");



            out.println("            <div style=\"height: 117px; width: 625px;  height: 114px; left: 20px; position: absolute; top: 22px; width: 625px; z-index: 1; \" class=\"tinyText style_SkipStrokeSkipFillSkipOpacity\">");
            out.println(" <div style=\"position: relative; width: 625px; \">");
            out.println("   <img src=\"Resultado_files/shapeimage_1.png\" alt=\"SIAFF &#10;Sistema Inteligente da Analise da Folha do Feijoeiro\" style=\"height: 111px; left: 0px; margin-left: 23px; margin-top: 6px; position: absolute; top: 0px; width: 578px; \" />");
            out.println(" </div>");
            out.println("</div>");
            out.println("          </div>");
            out.println("<div style=\"margin-left: 0px; position: relative; width: 700px; z-index: 10; \" id=\"nav_layer\">");
            out.println("<div style=\"height: 0px; line-height: 0px; \" class=\"bumper\"> </div>");
            out.println("<div style=\"height: 1px; line-height: 1px; \" class=\"tinyText\"> </div>");
            out.println("<div class=\"com-apple-iweb-widget-navbar flowDefining\" id=\"widget0\" style=\"margin-left: 19px; margin-top: -1px; opacity: 1.00; position: relative; width: 627px; z-index: 1; \">");

            out.println("<div id=\"widget0-navbar\" class=\"navbar\">");


            out.println("<div id=\"widget0-bg\" class=\"navbar-bg\">");


            out.println("<ul id=\"widget0-navbar-list\" class=\"navbar-list\">");
            out.println("<li></li> ");
            out.println("</ul>");


            out.println("</div>");


            out.println("</div>");
            out.println("</div>");
            out.println("<script type=\"text/javascript\"><!--//--><![CDATA[//><!--");
            out.println("new NavBar('widget0', 'Scripts/Widgets/Navbar', 'Scripts/Widgets/SharedResources', '.', {\"path-to-root\": \"\", \"navbar-css\": \".navbar {\\n\\tfont-family: 'Hoefler Text', 'Times New Roman', serif;\\n\\tfont-size: .9em;\\n\\tcolor: #817B67;\\n\\tmargin: 0px;\\n\\tline-height: 25px;\\n}\\n\\n.navbar-bg {\\n\\ttext-align: left;\\n}\\n\\n.navbar-bg ul {\\n\\tlist-style: none;\\n\\tmargin: 0px;\\n\\tpadding: 0px;\\n}\\n\\n\\nli {\\n\\tlist-style-type: none;\\n\\tdisplay: inline;\\n\\tpadding: 0 25px 0 0px;\\n}\\n\\n\\nli a {\\n\\ttext-decoration: none;\\n\\tpadding: 0px;\\n\\tcolor: #817B67;\\n}\\n\\nli a:visited {\\n\\ttext-decoration: none;\\n\\tpadding: 0px;\\n\\tcolor: #817B67;\\n}\\n\\nli a:hover\\r{\\r\\n \\tcolor: #3F3F3C;\\n\\ttext-decoration: none;\\r}\\n\\n\\nli.current-page a\\r{\\r\\t color: #3F3F3C;\\n\\ttext-decoration: none;\\r}\", \"current-page-GUID\": \"65827EBE-B00E-4D58-841F-AD1BA79FCFDC\", \"isCollectionPage\": \"NO\"});");
            out.println("//--><!]]></script>");
            out.println("<div style=\"clear: both; height: 0px; line-height: 0px; \" class=\"spacer\"> </div>");
            out.println("</div>");
            out.println("<div style=\"margin-left: 0px; position: relative; width: 700px; z-index: 15; \" id=\"body_layer\">");
            out.println("<div style=\"height: 0px; line-height: 0px; \" class=\"bumper\"> </div>");
            out.println("<div style=\"height: 110px; width: 111px;  height: 110px; left: 41px; position: absolute; top: 28px; width: 111px; z-index: 1; \" class=\"tinyText\">");
            out.println("<div style=\"position: relative; width: 111px; \">");
            out.println("<img src=\"http://localhost:8484/Apoio/getImagem?amo=S\" alt=\"\" style=\"height: 110px; left: 0px; margin-top: 1px; position: absolute; top: 0px; width: 111px; \" />");
            out.println("</div>");
            out.println("</div>");


            double v = Double.parseDouble(resultado.get(0).getIndiceReconhecimento().replace(",", "."));
            numberFormat.setMaximumFractionDigits(4);
            v = (v * 100);

            out.println("<div id=\"id1\" style=\"height: 146px; left: 180px; position: absolute; top: 20px; width: 270px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with - text\">");
            out.println("<div class=\"text-content Normal_External_211_146\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\">");
            out.println("<p style=\"font-size:13px;\"><b>Base: </b> " + base + "<br/></p5>");
            out.println("<p style=\"font-size:12px;\"><b>Provavel doen&ccedil;a: </b><br/></p5>");
            out.println("Nome popular: " + resultado.get(0).getAmostra().getDoenca().getDescricao().trim() + "<br/>");
            out.println("Nome cientifico: " + resultado.get(0).getAmostra().getDoenca().getNomecientifico().trim() + "<br/>");
            out.println("Código amostra: " + resultado.get(0).getAmostra().getIdamostra() + "<br/>");
            out.println("Percentual de reconhecimento: " + numberFormat.format(v) + "%");
            out.println("<p style=\"font-size:12px;\"><b>Data do reconhecimento:: </b>" + sdf.format(new Date()) + "<br/></p5>");
            out.println("</p>");


            out.println("</div>");
            out.println("</div>");
            out.println("</div>");



            out.println("<div id=\"id2\" style=\"height: 22px; left: 2px; position: absolute; top: 143px; width: 190px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\" >");

            out.println("<div class=\"text-content Normal_External_190_22\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\">");
            out.println("<p style=\"padding-bottom: 0pt; padding-top: 0pt; \" class=\"paragraph_style\">Imagem Proposta</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");



            out.println("<div style=\"height: 110px; width: 111px;  height: 110px; left: 501px; position: absolute; top: 28px; width: 111px; z-index: 1; \" class=\"tinyText\">");
            out.println("<div style=\"position: relative; width: 111px; \">");
            out.println("<img src=\"http://localhost:8484/Apoio/getImagem?id=" + resultado.get(0).getAmostra().getIdamostra() + "\" alt=\"\" style=\"height: 110px; left: 0px; position: absolute; top: 0px; width: 111px; \" />");
            out.println("</div>");
            out.println("</div>");

            out.println("<div id=\"id3\" style=\"height: 22px; left: 462px; position: absolute; top: 143px; width: 190px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\">");
            out.println("<div class=\"text-content Normal_External_190_22\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\">");
            out.println("<p style=\"padding-bottom: 0pt; padding-top: 0pt; \" class=\"paragraph_style\">Imagem Identificada</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");



            out.println("<div style=\"height: 74px; width: 75px;  height: 74px; left: 23px; position: absolute; top: 200px; width: 75px; z-index: 1; \" class=\"tinyText\">");
            out.println("<div style=\"position: relative; width: 75px; \">");
            out.println("<img src=\"http://localhost:8484/Apoio/getImagem?id=" + resultado.get(1).getAmostra().getIdamostra() + "\" alt=\"\" style=\"height: 74px; left: 0px; margin-top: 1px; position: absolute; top: 0px; width: 75px; \" />");
            out.println("</div>");
            out.println("</div>");


            v = Double.parseDouble(resultado.get(1).getIndiceReconhecimento().replace(",", "."));
            numberFormat.setMaximumFractionDigits(4);
            v = (v * 100);

            out.println("<div id=\"id4\" style=\"height: 22px; left: 105px; position: absolute; top: 226px; width: 540px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\">");
            out.println("<div class=\"text-content Normal_External_540_22\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\">");
            out.println("<p style=\"padding-bottom: 0pt; padding-top: 0pt; \" class=\"paragraph_style\">Percentual de reconhecimento: " + numberFormat.format(v) + "% ( doença: " + resultado.get(1).getAmostra().getDoenca().getDescricao().trim() + " )</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");



            out.println("<div style=\"height: 74px; width: 75px;  height: 74px; left: 22px; position: absolute; top: 284px; width: 75px; z-index: 1; \" class=\"tinyText\">");
            out.println("<div style=\"position: relative; width: 75px; \">");
            out.println("<img src=\"http://localhost:8484/Apoio/getImagem?id=" + resultado.get(2).getAmostra().getIdamostra() + "\" alt=\"\" style=\"height: 74px; left: 0px; position: absolute; top: 0px; width: 75px; \" />");
            out.println("</div>");
            out.println("</div>");

            v = Double.parseDouble(resultado.get(2).getIndiceReconhecimento().replace(",", "."));
            numberFormat.setMaximumFractionDigits(4);
            v = (v * 100);

            out.println("<div id=\"id5\" style=\"height: 22px; left: 104px; position: absolute; top: 310px; width: 540px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\">");
            out.println("<div class=\"text-content Normal_External_540_22\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\">");
            out.println("<p style=\"padding-bottom: 0pt; padding-top: 0pt; \" class=\"paragraph_style\">Percentual de reconhecimento: " + numberFormat.format(v) + "% ( doença: " + resultado.get(2).getAmostra().getDoenca().getDescricao().trim() + " )</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");



            out.println("<div style=\"height: 74px; width: 75px;  height: 74px; left: 21px; position: absolute; top: 368px; width: 75px; z-index: 1; \" class=\"tinyText\">");
            out.println("<div style=\"position: relative; width: 75px; \">");
            out.println("<img src=\"http://localhost:8484/Apoio/getImagem?id=" + resultado.get(3).getAmostra().getIdamostra() + "\" alt=\"\" style=\"height: 74px; left: 0px; position: absolute; top: 0px; width: 75px; \" />");
            out.println("</div>");
            out.println("</div>");


            v = Double.parseDouble(resultado.get(3).getIndiceReconhecimento().replace(",", "."));
            numberFormat.setMaximumFractionDigits(4);
            v = (v * 100);


            out.println("<div id=\"id6\" style=\"height: 22px; left: 103px; position: absolute; top: 394px; width: 540px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\">");
            out.println("<div class=\"text-content Normal_External_540_22\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\">");
            out.println("<p style=\"padding-bottom: 0pt; padding-top: 0pt; \" class=\"paragraph_style\">Percentual de reconhecimento: " + numberFormat.format(v) + "% ( doença: " + resultado.get(3).getAmostra().getDoenca().getDescricao().trim() + " )</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");



            out.println("<div id=\"id7\" style=\"height: 22px; left: 105px; position: absolute; top: 796px; width: 540px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\">");
            out.println("<div class=\"text-content Normal_External_540_22\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\"></div>");
            out.println("</div>");
            out.println("</div>");



            out.println("<div style=\"height: 74px; width: 75px;  height: 74px; left: 22px; position: absolute; top: 455px; width: 75px; z-index: 1; \" class=\"tinyText\">");
            out.println("<div style=\"position: relative; width: 75px; \">");
            out.println("<img src=\"http://localhost:8484/Apoio/getImagem?id=" + resultado.get(4).getAmostra().getIdamostra() + "\" alt=\"\" style=\"height: 74px; left: 0px; position: absolute; top: 0px; width: 75px; \" />");
            out.println("</div>");
            out.println("</div>");


            v = Double.parseDouble(resultado.get(4).getIndiceReconhecimento().replace(",", "."));
            numberFormat.setMaximumFractionDigits(4);
            v = (v * 100);


            out.println("<div id=\"id8\" style=\"height: 22px; left: 104px; position: absolute; top: 481px; width: 540px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\">");
            out.println("<div class=\"text-content Normal_External_540_22\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\">");
            out.println("<p style=\"padding-bottom: 0pt; padding-top: 0pt; \" class=\"paragraph_style\">Percentual de reconhecimento: " + numberFormat.format(v) + "% ( doença: " + resultado.get(4).getAmostra().getDoenca().getDescricao().trim() + " )</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");



            out.println("<div style=\"height: 74px; width: 75px;  height: 74px; left: 21px; position: absolute; top: 539px; width: 75px; z-index: 1; \" class=\"tinyText\">");
            out.println("<div style=\"position: relative; width: 75px; \">");
            out.println("<img src=\"http://localhost:8484/Apoio/getImagem?id=" + resultado.get(5).getAmostra().getIdamostra() + "\" alt=\"\" style=\"height: 74px; left: 0px; position: absolute; top: 0px; width: 75px; \" />");
            out.println("</div>");
            out.println("</div>");

            v = Double.parseDouble(resultado.get(5).getIndiceReconhecimento().replace(",", "."));
            numberFormat.setMaximumFractionDigits(4);
            v = (v * 100);

            out.println("<div id=\"id9\" style=\"height: 22px; left: 103px; position: absolute; top: 565px; width: 540px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\">");
            out.println("<div class=\"text-content Normal_External_540_22\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\">");
            out.println("<p style=\"padding-bottom: 0pt; padding-top: 0pt; \" class=\"paragraph_style\">Percentual de reconhecimento: " + numberFormat.format(v) + "% ( doença: " + resultado.get(5).getAmostra().getDoenca().getDescricao().trim() + " )</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");



            out.println("<div style=\"height: 74px; width: 75px;  height: 74px; left: 20px; position: absolute; top: 623px; width: 75px; z-index: 1; \" class=\"tinyText\">");
            out.println("<div style=\"position: relative; width: 75px; \">");
            out.println("<img src=\"http://localhost:8484/Apoio/getImagem?id=" + resultado.get(6).getAmostra().getIdamostra() + "\" alt=\"\" style=\"height: 74px; left: 0px; position: absolute; top: 0px; width: 75px; \" />");
            out.println("</div>");
            out.println("</div>");

            v = Double.parseDouble(resultado.get(6).getIndiceReconhecimento().replace(",", "."));
            numberFormat.setMaximumFractionDigits(4);
            v = (v * 100);


            out.println("<div id=\"id10\" style=\"height: 22px; left: 102px; position: absolute; top: 649px; width: 540px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\">");
            out.println("<div class=\"text-content Normal_External_540_22\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\">");
            out.println("<p style=\"padding-bottom: 0pt; padding-top: 0pt; \" class=\"paragraph_style\">Percentual de reconhecimento: " + numberFormat.format(v) + "% ( doença: " + resultado.get(6).getAmostra().getDoenca().getDescricao().trim() + " )</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");



            out.println("<div style=\"height: 74px; width: 75px;  height: 74px; left: 19px; position: absolute; top: 707px; width: 75px; z-index: 1; \" class=\"tinyText\">");
            out.println("<div style=\"position: relative; width: 75px; \">");
            out.println("<img src=\"http://localhost:8484/Apoio/getImagem?id=" + resultado.get(7).getAmostra().getIdamostra() + "\" alt=\"\" style=\"height: 74px; left: 0px; position: absolute; top: 0px; width: 75px; \" />");
            out.println("</div>");
            out.println("</div>");

            v = Double.parseDouble(resultado.get(7).getIndiceReconhecimento().replace(",", "."));
            numberFormat.setMaximumFractionDigits(4);
            v = (v * 100);

            out.println("<div id=\"id11\" style=\"height: 22px; left: 101px; position: absolute; top: 733px; width: 540px; z-index: 1; \" class=\"style_SkipStroke_1 shape-with-text\">");
            out.println("<div class=\"text-content Normal_External_540_22\" style=\"padding: 0px; \">");
            out.println("<div class=\"Normal\">");
            out.println("<p style=\"padding-bottom: 0pt; padding-top: 0pt; \" class=\"paragraph_style\">Percentual de reconhecimento: " + numberFormat.format(v) + "% ( doença: " + resultado.get(7).getAmostra().getDoenca().getDescricao().trim() + " )</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");


            out.println("<div style=\"height: 818px; line-height: 818px; \" class=\"spacer\"> </div>");
            out.println("</div>");
            out.println("<div style=\"height: 120px; margin-left: 0px; position: relative; width: 700px; z-index: 0; \" id = \"footer_layer\">");
            out.println("<div style=\"height: 0px; line-height: 0px; \" class=\"bumper\"> </div>");
            out.println("<div style=\"height: 236px; width: 700px;  height: 236px; left: 0px; position: absolute; top: -116px; width: 700px; z-index: 1; \" class=\"tinyText style_SkipStroke\">");
            out.println("<img src=\"Resultado_files/LayeredPaper_04.jpg\" alt=\"\" style=\"border: none; height: 236px; width: 700px; \" />");
            out.println("</div>");



            out.println("<div style=\"height: 90px; width: 664px;  height: 90px; left: 4px; position: absolute; top: 27px; width: 664px; z-index: 1; \" class=\"tinyText shadow_0\">");
            out.println("<div style=\"position: relative; width: 664px; \" >");

            out.println("<img src=\"Resultado_files/shapeimage_11.png\" alt=\"\" style=\"height: 90px; left: 0px; position: absolute; top: 0px; width: 664px; \" />");
            out.println("</div>");
            out.println("</div>");



            out.println("<div style=\"height: 56px; width: 210px;  height: 56px; left: 21px; position: absolute; top: 49px; width: 210px; z-index: 1; \" class=\"tinyText style_SkipStroke_2\">");
            out.println("<img src=\"Resultado_files/droppedImage.jpg\" alt=\"\" style=\"border: none; height: 56px; width: 210px; \" />");
            out.println("</div>");



            out.println("<div style=\"height: 63px; width: 88px;  height: 63px; left: 389px; position: absolute; top: 40px; width: 88px; z-index: 1; \" class=\"tinyText style_SkipStroke_2\">");
            out.println("<img src=\"Resultado_files/droppedImage_1.jpg\" alt=\"\" style=\"border: none; height: 63px; width: 89px; \" />");
            out.println("</div>");



            out.println("<div style=\"height: 65px; width: 82px;  height: 65px; left: 262px; position: absolute; top: 44px; width: 82px; z-index: 1; \" class=\"tinyText style_SkipStroke_2\">");
            out.println("<img src=\"Resultado_files/droppedImage_2.jpg\" alt=\"\" style=\"border: none; height: 65px; width: 82px; \" />");
            out.println("</div>");



            out.println("<div style=\"height: 78px; width: 144px;  height: 78px; left: 510px; position: absolute; top: 33px; width: 144px; z-index: 1; \" class=\"tinyText style_SkipStroke_2\">");
            out.println("<img src=\"Resultado_files/droppedImage_3.jpg\" alt=\"\" style=\"border: none; height: 78px; width: 145px; \" />");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
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

    private List<Reconhecimento> reconhecimento(String nomeBase, String nome) {

        AmostraController amostraController = new AmostraController();

        File base = new File("C:/SIAFF/WSIAFF/bases/" + nomeBase);
        NeuralNetwork nnet = NeuralNetwork.load(base.getAbsolutePath());

        ImageRecognitionPlugin imageRecognition = (ImageRecognitionPlugin) nnet.getPlugin(ImageRecognitionPlugin.IMG_REC_PLUGIN_NAME);
        
        //Image im = Toolkit.getDefaultToolkit().getImage(nome);

        //ImageIcon Img = new ImageIcon("/WSIAFF/imgrec/reconhecer.jpg");
        ImageIcon Img = new AnaliseController().find("1").getImagem();

        BufferedImage bi = amostraController.ImageIconBufferedImage(Img);
        HashMap<String, Double> output = imageRecognition.recognizeImage(bi);
        NumberFormat numberFormat = DecimalFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(4);
        Iterator keys = output.keySet().iterator();
        List<Reconhecimento> reconhecimentos = new ArrayList<Reconhecimento>();
        Amostra amostra;
        Reconhecimento reconhecimento;
        TreeMap<Double, Reconhecimento> valores = new TreeMap<Double, Reconhecimento>();
        while (keys.hasNext()) {
            try {
                String key = (String) keys.next();
                amostra = amostraController.find(key.trim());
                reconhecimento = new Reconhecimento();
                reconhecimento.setAmostra(amostra);
                reconhecimento.setImagem(Img);
                reconhecimento.setIndiceReconhecimento(numberFormat.format(output.get(key)));
                valores.put(output.get(key), reconhecimento);
            } catch (Exception ex) {
                Logger.getLogger(ListarBasesServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        reconhecimentos.addAll(valores.values());
        List<Reconhecimento> ordenado = new ArrayList<Reconhecimento>();
        for (int i = reconhecimentos.size() - 1; i >= 0; i--) {
            ordenado.add(reconhecimentos.get(i));
        }
        return ordenado;
    }
}
