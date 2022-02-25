
package MadeTruck;


public abstract class TruckDecoratorClass implements ITruckClass{
    
    protected ITruckClass box;
    protected ITruckClass colour; 
    TruckDecoratorClass(ITruckClass box){
        this.box = box;
    }
    TruckDecoratorClass(TruckColourClass colour){
        this.colour = colour;
    }

    

}
