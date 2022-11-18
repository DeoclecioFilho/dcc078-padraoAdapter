package padroesestruturais;

public class TemperaturaAdpter extends TemperaturaValor{

    private ITemperatura temperaturaDescricao;

    public TemperaturaAdpter(ITemperatura temperaturaDescricao){
        this.temperaturaDescricao = temperaturaDescricao;
    }

    public String recuperarTemperatura() {
        if (this.getValor() >= 101.0f)
            temperaturaDescricao.setTemperatura("Alta");
        else
        if (this.getValor() >= 80.0f && this.getValor() <= 100.0f)
            temperaturaDescricao.setTemperatura("Normal");
        else
        if (this.getValor() <= 79.0f)
            temperaturaDescricao.setTemperatura("Baixa");

        return temperaturaDescricao.getTemperatura();
    }

    public void salvarTemperatura() {
        if (temperaturaDescricao.getTemperatura().equals("Alta"))
            this.setValor(101.0f);
        else
        if (temperaturaDescricao.getTemperatura().equals("Normal"))
            this.setValor(90.0f);
        else
        if (temperaturaDescricao.getTemperatura().equals("Baixa"))
            this.setValor(79.0f);
        else
            this.setValor(0.0f);
    }
}
