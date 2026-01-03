//custom exception
class BookUnavalableException extends Exception{
    public BookUnavalableException(String message) {
        super(message);
    }
}




class lIBRARY{

//throw and throws
    int availableBOOKS = 3;
    public void borrowBook(int booksRequestedCount)throws Exception  {
//        try{
            if(booksRequestedCount > availableBOOKS)
//                Exception e = new Exception("Not enough books available");
//               throw e;
                throw new BookUnavalableException("Not enough books available");
        if (booksRequestedCount >= 0) {
            return;
        }
        throw new Exception("You must request atleast 1 book");

//            }
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception Occured, You requested a book which is not exists");
//        }catch(NullPointerException e){
//            System.out.println("Null pointer");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println("finally block");
//        }
//
          }
     }

      class LibraryDemo {
    public static void main(String[] args) {
        lIBRARY library = new lIBRARY();
        try {
            library.borrowBook(10);
        } catch (BookUnavalableException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
        catch (Exception e) {
//
            System.out.println("Exception Occured" + e.getMessage());
        }
//            throw new RuntimeException(e);
    }
}
/*
        library.borrowBook(2);
       library.borrowBook(5);
        library.borrowBook(-1);
public void borrowBook(int booksRequested){
    try{
        int[] books = {101, 102, 103};
        System.out.println("Book Requested: "+ books[booksRequested]);
        System.out.println("Books is there");
        System.out.println("\n");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception Occured, You requested a book which is not exists");
    }catch(NullPointerException e){
        System.out.println("Null pointer");
    }finally {
        System.out.println("finally block");
    }

}
*/



