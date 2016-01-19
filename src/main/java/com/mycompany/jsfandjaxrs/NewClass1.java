/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsfandjaxrs;

import java.util.Objects;

/**
 *
 * @author cucos
 */
public class NewClass1 {
 String s;   
 Integer i;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "NewClass1{" + "s=" + s + ", i=" + i + '}';
    }
 

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.s);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NewClass1 other = (NewClass1) obj;
        if (!Objects.equals(this.s, other.s)) {
            return false;
        }
        return true;
    }
 
 
 
}
