/*analizę poniższego kodu i zaimplementowanie metod
metody: findBlockByColor, findBlocksByMaterial, count w klasie Wall -
najchętniej unikając powielania kodu i umieszczając całą logikę w klasie Wall.
uwzględnić w analizie i implementacji interfejsu CompositeBlock!

interface Structure {
// zwraca dowolny element o podanym kolorze
Optional<Block> findBlockByColor(String color);

// zwraca wszystkie elementy z danego materiału
List<Block> findBlocksByMaterial(String material);

//zwraca liczbę wszystkich elementów tworzących strukturę
int count();
}

public class Wall implements Structure {
private List<Block> blocks;
}

interface Block {
String getColor();
String getMaterial();
}

interface CompositeBlock extends Block {
List<Block> getBlocks();
}*/
public class Main {
    public static void main(String[] args) {

    }
}