package com.example.parkdusang.healthtrainer;

/**
 * Created by parkdusang on 16. 4. 8..
 */
public class MyCustomDTO2 {
    Boolean checkboxt;
    String title;
    String content;
    int setexercise,number;

    public MyCustomDTO2(Boolean checkboxt,String title, String content) {
        this.checkboxt = checkboxt;
        this.title = title;
        this.content = content;

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }


    public void setCheckboxt(Boolean checkboxt){
        this.checkboxt = checkboxt;
    }
    public Boolean getCheckboxt(){
        return checkboxt;
    }

    public void setnumber(int checkboxt){
        this.number = checkboxt;
    }
    public String getnumber(){
        return number+"";
    }
    public void setexercise(int checkboxt){
        this.setexercise = checkboxt;
    }
    public String getexercise(){
        return setexercise+"";
    }
}
