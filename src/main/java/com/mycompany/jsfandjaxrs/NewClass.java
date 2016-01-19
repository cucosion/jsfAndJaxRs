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
public class NewClass {
    String somechanges;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.somechanges);
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
        final NewClass other = (NewClass) obj;
        if (!Objects.equals(this.somechanges, other.somechanges)) {
            return false;
        }
        return true;
    }

    public String getSomechanges() {
        return somechanges;
    }

    public void setSomechanges(String somechanges) {
        this.somechanges = somechanges;
    }
    
}
