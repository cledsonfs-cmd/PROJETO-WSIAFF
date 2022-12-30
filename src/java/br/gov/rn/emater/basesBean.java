/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.rn.emater;

import java.io.File;
import java.util.*;

/**
 *
 * @author cledsonfs
 */
public class basesBean {

    private List<String> bases = new ArrayList<String>();
    private File file = new File("C:/SIAFF/WSIAFF/bases");

    public basesBean() {
        bases = new ArrayList<String>();
        for (File f : file.listFiles()) {
            bases.add(f.getName());
        }
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
