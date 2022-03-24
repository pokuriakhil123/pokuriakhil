class NestedTry{
    public static void main(String[]args){
        try{
            int a[] = {1,2,3,4};
            System.out.println(a[5]);
            try{
                int x = a[2]/0;
            }
            catch (Exception e2) 
            {
                System.out.println("divisible by zero is not possible");
            }
        }
        catch (StringIndexOutOfBoundsException e1){
             System.out.println("ArrayIndexOutOfBoundException");
              System.out.println("Elements at such index does not exsits");
        }
    }
}