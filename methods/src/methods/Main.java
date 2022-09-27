package methods;

public class Main {
    public static void main(String[] args) {
        findNumber();
    }
    public static void findNumber(){
        int [] numbers = new int[] {1,2,6,8,9,10};
        int findNumber = 7;
        boolean avaible= false;

        for (int number: numbers){
            if (number==findNumber){
                avaible=true;
                break;
            }
        }

        if (avaible){

            mesajVer("Number available: "+findNumber);
        }
        else{
            mesajVer("Number not available: "+findNumber);
        }

    }
    public static void mesajVer(String mesaj ){
        System.out.println(mesaj);
    }

}