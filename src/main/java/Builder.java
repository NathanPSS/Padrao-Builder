public class Builder {
    public Localidade  localidade;
    public Tempo tempo;

    public void setLocalidade(String regiao,String estado,String cidade) {
        this.localidade = new Localidade(regiao,cidade,estado);
    }

    public void setTempo(String densidadeAr,Integer temperatura,String previsãoChuva,Boolean diaNublado) {
        this.tempo = new Tempo(densidadeAr,temperatura,previsãoChuva,diaNublado);
    }
    public Builder getBuilder(){

        return this;
    }
}
