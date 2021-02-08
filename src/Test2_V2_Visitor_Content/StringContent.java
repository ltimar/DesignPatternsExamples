package Test2_V2_Visitor_Content;

public class StringContent implements Content{
    String myString;

    public StringContent(String sir){
        this.myString = sir;
    }
    @Override
    public String printContent() {
        return myString;
    }
}
