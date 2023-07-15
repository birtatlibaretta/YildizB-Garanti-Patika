// Bu program, çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazar.

public class B {

    public static void main(String[] args) {
  
      // Çok boyutlu diziyi oluştur.
      char[][] array = new char[3][3];
  
      // Diziyi yıldızlarla doldur.
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (i == 0 || i == 2 || j == 0 || j == 2) {
            array[i][j] = '*';
          } else {
            array[i][j] = ' ';
          }
        }
      }
  
      // Diziyi ekrana yazdır.
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          System.out.print(array[i][j]);
        }
        System.out.println();
      }
    }
  }
  
