/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerider;

import java.util.concurrent.Semaphore;

/**
 *
 * @author daniela
 */
public class Box {

    public String state;

    public Box(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Box{" + "state=" + state + '}';
    }

    
    

}
