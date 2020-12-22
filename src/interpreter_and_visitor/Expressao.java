package interpreter_and_visitor;

public interface Expressao {
    int avalia();
    void aceita(Visitor visitor);
}
