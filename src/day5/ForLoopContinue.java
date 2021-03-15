package day5;

public class ForLoopContinue {
    public static void main(String[] args){
        //ClassName ref = new ClassName();
        ForLoopContinue ref = new ForLoopContinue();
    }

    void continueMethod(){
        //We want to print 1 to 10

        int i ;
        for(i = 1; i <= 10; i++) {
            if(i == 6){
                continue;
            }
            System.out.println(i);
        }
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
