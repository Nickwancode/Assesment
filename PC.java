package lol;

public class PC {


    private String Case;
    private String monitor;
    private String motherboard;


    public String getCase() {
        return Case;
    }

    public void setCase(String aCase) {
        Case = aCase;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public PC(String Case, String Monitor, String Motherboard){
        this.Case = Case;
        this.monitor = Monitor;
        this.motherboard = Motherboard;
    }


    private static void drawLogo(int x, int y, String color){

        


    }



}
