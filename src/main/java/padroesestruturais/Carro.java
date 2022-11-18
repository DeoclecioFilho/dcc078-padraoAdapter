package padroesestruturais;

public class Carro {

    ITemperatura temperatura;
    TemperaturaAdpter temperaturaAdpter;

    public Carro(){
        temperatura = new TemperaturaDescricao();
        temperaturaAdpter = new TemperaturaAdpter(temperatura);
    }

    public void setTemperatura(String descricao){
        temperatura.setTemperatura(descricao);
        temperaturaAdpter.salvarTemperatura();
    }

    public String getTemperatura(){
        return temperaturaAdpter.recuperarTemperatura();
    }

    /** Método apenas para mostrar que está convertendo DESCRICÃO para TEMPERATURA através do adaptador */
    public float getValor() {
        return temperaturaAdpter.getValor();
    }
}
