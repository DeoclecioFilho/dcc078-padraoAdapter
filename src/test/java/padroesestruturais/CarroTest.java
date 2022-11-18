package padroesestruturais;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarTemperaturaBaixa() {
        Carro carro = new Carro();
        carro.setTemperatura("Baixa");
        assertEquals("Baixa", carro.getTemperatura());
    }
    @Test
    void deveRetornarTemperaturaNormal() {
        Carro carro = new Carro();
        carro.setTemperatura("Normal");
        assertEquals("Normal", carro.getTemperatura());
    }

    @Test
    void deveRetornarTemperaturaAlta() {
        Carro carro = new Carro();
        carro.setTemperatura("Alta");
        assertEquals("Alta", carro.getTemperatura());
    }

    @Test
    void deveRetornarValorDaTemperatura() {
        Carro carro = new Carro();
        carro.setTemperatura("Normal");
        assertEquals(90.0f, carro.getValor());
    }

}