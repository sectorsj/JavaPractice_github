package oreilybooks.java.beerSong;

class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бытылок";

        while (beerNum > 0) {

            if(beerNum == 1) {
                word = "бутылка";
            }

            System.out.println(beerNum + " " + word + " пива на стене.");
            System.out.print("Возьми одну, ");
            System.out.print("пусти по кругу. ");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива осталось на стене");
                System.out.println("");
            } else {
                System.out.println("Нет будылок пива на стене!!! )");
            } // end else
        }//end while
    } //end method main
} // end class
