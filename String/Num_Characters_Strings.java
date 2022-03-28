class Num_Characters_Strings{
    public static void main(String args[]){
        String name="bit23la56bs";
        System.out.println("Letters Are ");
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)>='a'&&name.charAt(i)<='z'){
                System.out.println(name.charAt(i));
            }
        }
         System.out.println("Numbers Are ");
            for(int i=0;i<name.length();i++){
            if(name.charAt(i)>='1'&&name.charAt(i)<='9'){
                System.out.println(name.charAt(i));
            }
        }
    }
}