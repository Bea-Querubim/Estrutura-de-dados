package aulas.POO;

public class programa {

    // set valores para o primeiro obj(userClub) da classe socio
    public static void main(String[] args) {

        Carro c1 = new Carro();

        c1.potencia = 10;
        c1.nome = "Fusca";
        c1.velocidade = 0;

        c1.imprimir();

        for (int i=0; i<3; i++){
            c1.acelerar();
        }
        c1.imprimir();

        c1.frear();
        c1.imprimir();

        Socio userClubTeste = new Socio(); //depois de colocar um construtor com parametros, nao é possivel criar um objeto sem passar parametros, a nao ser que tenha o construtor sem parametros

        Socio userClub = new Socio(
        "Guilherme Andrade",1234567910,1234567809,"rua amarenas 78",912345678,"Plano individual");

        Socio userClub2 = new Socio("Plano Familia");

        System.out.println(userClub.toString());
        System.out.println(userClub2.toString());
    }
}
