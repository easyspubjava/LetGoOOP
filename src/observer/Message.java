package observer;

public class Message {

    String[] greetings = {"안녕하세요", "반갑습니다", "hello", "hi", "좋은 아침입니다."};
    static int index = 0;

    public String getMessage(){
        if(index == greetings.length) index = 0;
        return greetings[index++];
    }
}
