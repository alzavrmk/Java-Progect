package finishproject;

public class NooteBook1 {
    public String title;
    public String os;
    public int ramValue;
    public int hddValue;
    public String color;
    public int price;
    public String historyBreak;

    public NooteBook1 (String title, String os, String color, int ramValue, int hddValue, int price){
        this.title = title;
        this.os = os;
        this.color = color;
        this.ramValue = ramValue;
        this.hddValue = hddValue;
        this.price = price;
    
    }

    public NooteBook1(){
        this("None","None", "None", 0,0,0);
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
       return String.format("Ноутбук: %s; \nОперационная система: %s;\nОЗУ: %s;\nОбъем жесткого диска: %s;\nЦвет: %s\n \n", title,os, ramValue,hddValue,color);
    }

    @Override
    public String toString(){
        return getInfo();
    }

    public NooteBook1 add (String strTitle, String strOs, String strcolor, int ramValue1, int hddValue1, int price){
        NooteBook1 nb = new NooteBook1(strTitle,strOs,strcolor,ramValue1,hddValue1,price);
        //System.out.println(nb);
        return nb;
 /*       this.title = strTitle;
        this.os = strOs;
        this.color = strcolor;
        this.ramValue = ramValue1;
        */ 

    }
}
