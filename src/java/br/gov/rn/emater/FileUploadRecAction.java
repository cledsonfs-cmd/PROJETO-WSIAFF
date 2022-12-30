package br.gov.rn.emater;

import br.gov.rn.emater.Classes.Analise;
import br.gov.rn.emater.Controler.AnaliseController;
import com.opensymphony.xwork2.ActionSupport;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.swing.ImageIcon;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cledsonfs
 */
public class FileUploadRecAction extends ActionSupport implements
        ServletRequestAware {

    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    private HttpServletRequest servletRequest;

    public FileUploadRecAction() {
    }

    public String execute() {

        try {
            String filePath = "c:/SIAFF/WSIAFF/imgrec/";
            //String filePath = servletRequest.getRealPath("/WSIAFF/imgrec/");
            //System.out.println("Server path:" + filePath);
            //File fileToCreate = new File(filePath, this.userImageFileName);
            File fileToCreate = new File(filePath, "reconhecer.jpg");

            FileUtils.copyFile(this.userImage, fileToCreate);
            //Image i = Toolkit.getDefaultToolkit().getImage(filePath + "reconhecer.jpg");
            Image i = ImageIO.read(fileToCreate);


            Analise analise = new Analise();
            analise.setIdAnalise(1);
            analise.setImagem(new ImageIcon(i));
            analise.setData(new Timestamp(new Date().getTime()));
            analise.setNome(this.userImageFileName);

            AnaliseController analiseController = new AnaliseController();
            analiseController.set(analise);
            analiseController.salvar();

        } catch (Exception e) {
            e.printStackTrace();
            addActionError(e.getMessage());

            return INPUT;
        }

        return SUCCESS;
    }

    public File getUserImage() {
        return userImage;
    }

    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }

    public String getUserImageContentType() {
        return userImageContentType;
    }

    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }

    public String getUserImageFileName() {
        return userImageFileName;
    }

    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }

    @Override
    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;

    }
}
