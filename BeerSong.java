public class BeerSong{
  public static void main (String[] args) {
    int beerNum = 99;
    String word = "bottles";

    while (beerNum> 0){

      if (beerNum == 1) {
        word = "bottle"; // singular, as in ONE bottle.
        System.out.println(beerNum + " " + word + " of beer on the wall, "+ beerNum + " " + word + " of beer");
        System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
        beerNum = beerNum - 1;
       }

       if (beerNum > 0){
         System.out.println(beerNum + " " + word + " of beer on the wall, "+ beerNum + " " + word + " of beer");
         beerNum = beerNum - 1;
         System.out.println("Take one down and pass it around, "+ beerNum +" bottles of beer on the wall.\n");
       }

       if (beerNum == 0){
         System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
         System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
       }

    } // End while loop

  }// End main method

}//End Class
