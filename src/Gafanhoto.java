public class Gafanhoto extends Pessoa {
    private String login;
    private int toAsstindo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.toAsstindo = 0;
    }

    public void viuMaisUm() {
        this.toAsstindo++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getToAsstindo() {
        return toAsstindo;
    }

    public void setToAsstindo(int toAsstindo) {
        this.toAsstindo = toAsstindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                super.toString() +
                ", login='" + login + '\'' +
                ", toAsstindo=" + toAsstindo +
                '}';
    }
}