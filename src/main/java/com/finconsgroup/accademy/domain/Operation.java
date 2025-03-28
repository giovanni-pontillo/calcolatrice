package com.finconsgroup.accademy.domain;

public interface Operation {
    double executeOperation(double a, double b);

    enum OperationType{
        ADD('+'), SUBTRACT('-'), DIVIDE('/'), MULTIPLY('*');

        private final char symbol;

        OperationType(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }

        public static OperationType findEnum(int index) {
            return switch(index) {
             case 1 -> ADD;
             case 2 -> SUBTRACT;
             case 3 -> DIVIDE;
             case 4 -> MULTIPLY;
                default -> throw new RuntimeException("invalid operation");
            };
        }
    }
}
