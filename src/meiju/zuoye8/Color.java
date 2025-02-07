package meiju.zuoye8;

/**
 * @author czq
 * @version 1.0
 */
class Test{
    public static void main(String[] args) {
        Color c = Color.RED;

        switch(c){
            case RED:
                break;
            case BLUE:
                break;
            case GREEN:
                break;
            case BLACK:
                break;
            case YELLOW:
                break;
            default:
                break;
        }
    }
}


enum Color implements Show{
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);
    private double redValue;
    private double greenValue;
    private double blueValue;

    Color(double redValue, double greenValue, double blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }



    @Override
    public void show() {
        System.out.println("Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}');
    }
}
interface Show{
    void show();
}
