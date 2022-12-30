/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.rn.emater;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author cledsonfs
 */
public class FileUploadAction extends ActionSupport implements
        ServletRequestAware {

    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    private HttpServletRequest servletRequest;
    private List<String> bases = new ArrayList<String>();

    public String execute() {
        
        try {
            String filePath = "c:/SIAFF/WSIAFF/bases";
            //System.out.println("Server path:" + filePath);
            File fileToCreate = new File(filePath, this.userImageFileName);

            FileUtils.copyFile(this.userImage, fileToCreate);

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

    /**
     * @return the bases
     */
    public List<String> getBases() {
        return bases;
    }

    /**
     * @param bases the bases to set
     */
    public void setBases(List<String> bases) {
        this.bases = bases;
    }
}
