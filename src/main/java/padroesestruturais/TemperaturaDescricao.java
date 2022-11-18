package padroesestruturais;

public class TemperaturaDescricao implements ITemperatura {

    private String descricao;

    @Override
    public String getTemperatura() {
        return this.descricao;
    }

    @Override
    public void setTemperatura(String descricao) {
        this.descricao = descricao;
    }
}
