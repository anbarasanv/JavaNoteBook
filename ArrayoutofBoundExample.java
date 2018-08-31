class ArrayoutofBoundExample{
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[6] = 10;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        //Rest of the code
        System.out.println("Restof the code!");
    }
}