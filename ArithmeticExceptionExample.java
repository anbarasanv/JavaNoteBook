class ArithmeticExceptionExample{
    public static void main(String[] args) {
        try{
            int a = 100/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        //Rest of the code can go here
        System.out.println("Rest of the code");
    }
}