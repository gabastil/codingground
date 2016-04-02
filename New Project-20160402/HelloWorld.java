import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;

public abstract class NeuralNetwork{
    ArrayList<Double> weightVector = new ArrayList<>();
    
    public NeuralNetwork(){
        // Basic constructor
    }
    
    /**
     * Constructor with one parameter
     * @param   trainSet: Collection of training Examples
     */
    public NeuralNetwork(Collection<Collection<Double>> trainSet){
        train(trainSet);
    }
}