package day5;

public class ForLoopBreak {
    public static void main(String[] args) {

        ForLoopBreak brk = new ForLoopBreak();
        brk.breakMethod();
    }

    void breakMethod(){
        String[] names = {"Sk", "Milad", "Shahin", "Alimur", "Rezaul", "Asm"};
        for(int i = 0; i < names.length  ; i++ ) {
            if(names[i] == "Alimur"){
                break;
            }
            System.out.println(names[i]);
        }
    }
}
