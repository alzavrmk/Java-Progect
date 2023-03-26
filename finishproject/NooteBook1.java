package finishproject;

public class NooteBook1 {
    private String title;
    public String os;
    public int ramValue;
    public int hddValue;
    private String color;
    public String historyBreak;

    public NooteBook1 (String title, String os, String color){
        this.title = title;
        this.os = os;
        this.color = color;
    }

    public NooteBook1() {
        this("None","None");
    }
    public int getramValue(){
        return ramValue;
    }

    public void setramValue(int ramValue){
        this.ramValue=ramValue;
    }


    public int gethddValue(){
        return hddValue;
    }

    public void sethddValue(int hddValue){
        this.hddValue=hddValue;
    }

    public String gethistoryBreak(){
        return historyBreak;
    }

    public void sethistoryBreak(String histpryBreak){
        this.historyBreak = histpryBreak;
    }
    

    public String defect(String defect) {
        return this.historyBreak = this.historyBreak + defect;
    }

    private String getInfo(){
       return String.format("Ноутбук: %s; \nОперационная система: %s;\nОЗУ: %s;\nОбъем жесткого диска: %s;\nЦвет: %s\n", title,os, ramValue,hddValue,color);
    }

    @Override
    public String toString(){
        return getInfo();
    }
}
