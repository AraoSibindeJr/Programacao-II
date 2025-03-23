package Ficha01.Exercicio03.domain;

public class PortaoAutomatico {
    /* Exercício 3: Portão Automático
        Crie uma Porta, abra e feche a mesma, altere as suas dimensões e use o metodo
        estaAberto para verificar se a porta esta aberta
    */
    // Atributos
        private double  largura;
        private double  altura;
        private boolean aberta;

        public void setLargura(double largura){
            this.largura = largura;
        }
        public double getLargura(){
            return largura;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }
        public double getAltura(){
            return altura;
        }
        public void abrirPorta(){
            aberta = true;
            System.out.println(" Porta esta aberta!");
        }
        public void fecharPorta(){
            aberta = false;
            System.out.println(" Porta esta fechada!");
        }
        public boolean estaAberta(boolean aberta){
            return aberta;
        }
        public void statusDaPorta(){
            System.out.println(" Dimensoes da porta");
            System.out.println(" Largura: " + this.largura);
            System.out.println(" Altura: " + this.altura);
            System.out.println(" A porta esta aberta? " + estaAberta(aberta) );
        }
    }



