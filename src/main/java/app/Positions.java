package app;

public enum Positions {
    CENTER("c"),BOTTOM("b"),TOP("t");

    private final String codigo;

    Positions(String c) {
        this.codigo = c;
    }

    public static String escolherPosicao(String c){
        for (Positions positions : Positions.values()) {
            if (c == positions.codigo) {
                return positions.codigo;
            }
        }
        throw new IllegalArgumentException();
    }
}
