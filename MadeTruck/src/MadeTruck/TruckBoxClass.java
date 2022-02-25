/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MadeTruck;
public class TruckBoxClass extends TruckDecoratorClass{
    
    public TruckBoxClass(ITruckClass box) {
        super(box);
    }
    @Override
    public void truckBody(){
       // box.truckBody();
        setBox(box);
    }
    private void setBox(ITruckClass box) {
        System.out.println("Add Semi Trailer Box with truck"); //To change body of generated methods, choose Tools | Templates.
    }
}
