package tarefa;

public class AnimalPersonalizado extends Animal {

    private final String som;

    public AnimalPersonalizado(String nome) {
        super(nome);
        this.som = buscarSomPadrao(nome);
    }

    public AnimalPersonalizado(String nome, String som) {
        super(nome);
        this.som = som;
    }

    private String buscarSomPadrao(String tipo) {
        switch (tipo.toLowerCase()) {
            case "cachorro": return "Au Au Au!";
            case "gato":     return "Miau Miau!";
            case "vaca":     return "Muuu Muuu!";
            case "pato":     return "Quack Quack!";
            case "leão":     return "Rooaarrr!";
            default:         return null;
        }
    }

    @Override
    public void fazerSom() {
        if (som != null && !som.isEmpty()) {
            System.out.println(nome + " faz o som: " + som);
        } else {
            System.out.println("Som não cadastrado para o animal: " + nome);
        }
    }

    public boolean temSom() {
        return som != null && !som.isEmpty();
    }
}