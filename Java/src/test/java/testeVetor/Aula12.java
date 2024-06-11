//usando API Java: ArrayList
import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        //entre <> passa-se o tipo dos dados do arrayList
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("e");
        arrayList.add("a");
        System.out.println(arrayList);

        //add é similar ao metodo adiciona que implementamos
        arrayList.add(1, "b");
        System.out.println(arrayList);

        //contains é similar ao metodo busca que implementamos (o qual retorna true ou false)
        boolean existe = arrayList.contains("c");

        if(existe) System.out.println("Elemento existe no array");
        else System.out.println("Elemento nao existe no array");

        //indexOf é similar ao metodo busca que implementamos (o qual retorna o valor da posicao no array)
        int pos = arrayList.indexOf("p");

        if(pos > -1) System.out.println("Elemento existe no array na posição "+ pos);
        else System.out.println("Elemento nao existe no array "+ pos);

        //busca por posicao é feito pelo .get
        System.out.println(arrayList.get(0));
        //System.out.println(arrayList.get(4)); //retorna um exception

        //remove é igual ao metodo remove desenvolvido nas aulas
        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.remove("b");
        System.out.println(arrayList);

        //tamanho do array é passado pelo .size();
        System.out.println(arrayList.size());

        /*
         * ver mais detelhes do metodo pesquisando sobre  'metodo + linguagem + source code'
         * ou seja:  arraylist JAVA source code
         */

    }
}
