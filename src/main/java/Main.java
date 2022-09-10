public class Main {
    public static void main(String[] args){
        Builder builder = new Builder();
        builder.setTempo("92%",32,"96%",true);
        builder.setLocalidade("Nordeste","Paraiba","Bahia");
        Builder previsaoTempo = builder.getBuilder();
        System.out.println(previsaoTempo.localidade.cidade);
    }
}
