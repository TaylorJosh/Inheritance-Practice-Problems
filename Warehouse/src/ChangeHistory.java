import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        history = new ArrayList<>();
    }
    
    public void add(double status){
        history.add(status);
    }
    
    public void clear(){
        history.clear();
    }
    
    public double maxValue(){
        double i=0;
        for (double x: history) {
            if (x>i) {
                i=x;
            }
        }
        return i;
    }
    
    public double minValue(){
        double i=Double.MAX_VALUE;
        for (double x: history) {
            if (x<i) {
                i=x;
            }
        }
        if(i==Double.MAX_VALUE) {
            i=0;
        }
        return i;
    }
    
    public double average(){
        double sum=0;
        double average=0;
        for (double x: history) {
            sum+=x;
        }
        if(history.size()>0) {
            average = sum/history.size();
        }
        return average;
    }

    @Override
    public String toString() {
        return history.toString();
    }
    
    
}