/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.gov.rn.emater;

import br.gov.rn.emater.Controler.AmostraController;
import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author cledsonfs
 */

public class getImagemAction extends ActionSupport implements
        ServletRequestAware{

    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private InputStream sImage;

    public getImagemAction() {
    }

    @Override
    public String execute() throws Exception {
         try {
            AmostraController amostraController = new AmostraController();
            byte[] bytearray = new byte[1024];
            int size = 0;
            
            setsImage(amostraController.getImageStream(servletRequest.getParameter("idamostra")));
            servletResponse.reset();
            servletResponse.setContentType("image/jpeg");
            servletResponse.addHeader("Content-Disposition", "filename=" + servletRequest.getParameter("idamostra") + ".jpeg");
            while ((size = getsImage().read(bytearray)) != -1) {
                servletResponse.getOutputStream().write(bytearray, 0, size);
            }
            servletResponse.flushBuffer();
            getsImage().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return SUCCESS;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        servletRequest = hsr;
        try {
            AmostraController amostraController = new AmostraController();
            byte[] bytearray = new byte[1024];
            int size = 0;

            setsImage(amostraController.getImageStream(hsr.getParameter("idamostra")));
            servletResponse.reset();
            servletResponse.setContentType("image/jpeg");
            servletResponse.addHeader("Content-Disposition", "filename=" + servletRequest.getParameter("idamostra") + ".jpeg");
            while ((size = getsImage().read(bytearray)) != -1) {
                servletResponse.getOutputStream().write(bytearray, 0, size);
            }
            servletResponse.flushBuffer();
            getsImage().close();
        } catch (IOException ex) {
            Logger.getLogger(getImagemAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @return the sImage
     */
    public InputStream getsImage() {
        return sImage;
    }

    /**
     * @param sImage the sImage to set
     */
    public void setsImage(InputStream sImage) {
        this.sImage = sImage;
    }



}