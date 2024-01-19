package Algorithms;

/**
 * MangoesPrice
 */
public class MangoesPrice {
    public static void mangos(int quantity, int price) {
        int freeCounter = 0, paidCounter = 0;
        int total;
  
        for (int i = 1; i <= quantity; i++) {
           if (i % 3 == 0) {
              freeCounter++;
           } else {
              paidCounter++;
           }
  
        }
        total = paidCounter * price;
  
        switch (freeCounter) {
           case 0:
              System.out.printf("\n# %d mangoes for $%d per unit = $%d; no mango for free", paidCounter, price, total);
              break;
           case 1:
              System.out.printf("\n# %d mangoes for $%d per unit = $%d; +%d mango for free", paidCounter, price, total,
                    freeCounter);
              break;
           default:
              System.out.printf("\n# %d mangoes for $%d per unit = $%d; +%d mangoes for free", paidCounter, price, total,
                    freeCounter);
              break;
        }
     }
    public static void main(String[] args) {
<<<<<<< HEAD
        mangos(3, 5);
=======
        mangos(0, 0);
>>>>>>> 17a0938a6f2ca6e122484646264787a3dd71534d
    }
}