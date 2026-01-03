public class ExceptionDemo {
    static void main(String[] args) {
        int a = 10;
        //int result = 10 / 0;//Exception error
//        int result = 10 / 3;//Exception error
//        System.out.println("Exicute suceessfully: ");

//        try{
//            //EXCEPTION GENERATING ERRORS
//            int result = 10/0;
//        } catch(Exception e){
//            //EXCEPTION HANDLING ERRORS
//            System.out.println("In catch block");
//        }

        //Arrayindexout of bounds Exception
//        int[] a = {1,2,3};
//

        int[] b = {1,2,3};
        try{
            System.out.println(b[6]);

        }catch (Exception e){
            System.out.println("Array index out of bounds");
        }
    }
}
