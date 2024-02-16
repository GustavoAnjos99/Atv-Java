package carro;


public class Carro {
    private String marca, modelo;
    private double potencia, velocidade;
    private int ano;
    
    public Carro(String marca, String modelo, double potencia, double velocidade, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidade = velocidade;
        this.ano = ano;
    }
    public Carro(double potencia, double velocidade){
        this.potencia = potencia;
        this.velocidade = velocidade;
    }
    
    public double obterVelocidade(){
        return this.velocidade;
    }
    public void acelerar(){
        this.velocidade += this.potencia;
    }
    public void frear(){
        reduzir();
        parar();
    }
    private void reduzir(){
        while(this.velocidade > 10){this.velocidade -= this.potencia;}
    }
    private void parar(){
        this.velocidade = 0;
    }
    public boolean ehIgual(Carro a, Carro b){
        if (a.marca.equals(b.marca) && a.modelo.equals(b.modelo) && a.ano == b.ano){
            return true;
        } else {
            return false;
        }
    }
    
    
}
