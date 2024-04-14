public class Objektas {
    private String parametras1;
    private String parametras2;
    private int paramID;

    public Objektas(String parametras1, String parametras2, int paramID) {
        this.parametras1 = parametras1;
        this.parametras2 = parametras2;
        this.paramID = paramID;
    }

    public String getParametras1() { return parametras1;}
    public String getParametras2() { return parametras2;}
    public int getParamID() { return paramID;}

    public void setParametras1(String parametras1) { this.parametras1 = parametras1;}
    public void setParametras2(String parametras2) { this.parametras2 = parametras2;}
    public void setParamID(int paramID) {this.paramID = paramID;}

    @Override
    public String toString() {
        return "Aprasas: " + getParametras1() + " " + getParametras2() + " " + getParamID();
    }

}
