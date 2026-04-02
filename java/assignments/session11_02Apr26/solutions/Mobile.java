package solutions;

public class Mobile {
    private int percentage;

    public int getPercentage(){
        return percentage;
    }

    public void setPercentage(int precentage){
        if(precentage < 0 || precentage > 100){
            System.out.println(precentage+" is not a valid battery percentage.");
            return;
        }
        this.percentage = precentage;
        System.out.println("Battery percentage is: "+getPercentage());
    }
}
