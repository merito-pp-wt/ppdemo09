# Przykład 09 - Kolekcje obiektów

W tym ćwiczeniu przedstawiono sposób korzystania z kolekcji.

Kolekcje w języku Java są obiektami przechowującymi inne obiekty. Są bardziej elastyczne od tablic
ponieważ nie mają określonego rozmiaru. Ponieważ rozmiar kolekcji może się zmieniać, `size()` jest 
metodą, a nie publicznym polem jak `length` w tablicach.

Znajdź w dokumentacji Javy [opis klasy `java.util.ArrayList`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html), która zawiera różne funkcje umożliwiające 
manipulowanie kolekcją.

## Zadanie

Dodaj do klasy `Invoice` następujące metody:

1. Metodę `minGrossPrice()` zwracającą nazwę produktu o najmniejszej cenie brutto.
2. Metodę `averageGrossPrice()` obliczającą średnią cenę brutto produktów trzymanych w kolekcji.
3. Metodę `lastProductIndex()` zwracającą pozycję ostatniego elementu w kolekcji lub -1 jeśli kolekcja jest pusta.
4. Metodę `lastProductName()` zwracającą wartość ostatniego elementu w kolekcji lub pusty łańcuch `""` jeśli kolekcja jest pusta. 
   
   *Wskazówka*: użyj metody `lastProductIndex()`.
