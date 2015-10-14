package Testing.Test.EnumTest;

/**
 * Created by iantaman on 05.10.2015.
 */
public enum S {

    HELLO(true){

    },
    HI() {

    },
    HEY(false) {

    };

    private boolean b;
    private String command;
    private String shortcCommand;

    S(){

    }

    S(boolean b){
        this.b = b;
    }

    public boolean isB(){
        return b;
    }




}
