/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.rn.emater;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;

/**
 *
 * @author cledsonfs
 */
public class ComboBasesAction extends ActionSupport {

    private List<String> fruits;
    private List<Base> bases;
    private String yourFruits;
    private String yourMonth;

    public String getYourMonth() {
        return yourMonth;
    }

    public void setYourMonth(String yourMonth) {
        this.yourMonth = yourMonth;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public String getYourFruits() {
        return yourFruits;
    }

    public void setYourFruits(String yourFruits) {
        this.yourFruits = yourFruits;
    }

    public ComboBasesAction() {

        fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");

        bases = new ArrayList<Base>();
        bases.add(new Base("teste"));
        bases.add(new Base("teste1"));
        bases.add(new Base("teste2"));
    }

    public String execute() {
        fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");

        bases = new ArrayList<Base>();
        bases.add(new Base("teste"));
        bases.add(new Base("teste1"));
        bases.add(new Base("teste2"));
        return SUCCESS;
    }

    public String display() {
        return NONE;
    }

    /**
     * @return the bases
     */
    public List<Base> getBases() {
        if (bases == null) {
            bases = new ArrayList<Base>();
            bases.add(new Base("teste"));
            bases.add(new Base("teste1"));
            bases.add(new Base("teste2"));
        }
        return bases;
    }

    /**
     * @param bases the bases to set
     */
    public void setBases(List<Base> bases) {
        this.bases = bases;
    }
}
