/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MadeTruck;
public class TruckColourClass extends TruckDecoratorClass{
    
    public TruckColourClass(ITruckClass colour) {
        super(colour);
    }
    @Override
    public void truckBody(){
        setColour(colour);
    }

    private void setColour(ITruckClass colour) {
         System.out.println("truck body colour is Red");//To change body of generated methods, choose Tools | Templates.
    }
}
