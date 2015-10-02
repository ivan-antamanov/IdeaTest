package Test;

/**
 * Created by iantaman on 01.10.2015.
 */
enum Type {
    INT(true) {
        public Object parse(String string) { return Integer.valueOf(string); }
    },
    INTEGER(false) {
        public Object parse(String string) { return Integer.valueOf(string); }
    },
    STRING(false) {
        public Object parse(String string) { return string; }
    };

    boolean primitive;
    Type(boolean primitive) { this.primitive = primitive; }

    public boolean isPrimitive() { return primitive; }
    public abstract Object parse(String string);
}
