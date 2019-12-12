package util;

import java.util.HashMap;
import java.util.Map;

public class LocalVariable <T> {
    private String name;
    private T type;
    private Map<String, String> primitiveConversion;

    public LocalVariable(String name, T type) {
        this.name = name;
        this.type = type;
        this.primitiveConversion = new HashMap<>();
        primitiveConversion.put(boolean.class.toString(), "java.lang.Boolean");
        primitiveConversion.put(byte.class.toString(), "java.lang.Byte");
        primitiveConversion.put(short.class.toString(), "java.lang.Short");
        primitiveConversion.put(char.class.toString(), "java.lang.Character");
        primitiveConversion.put(int.class.toString(), "java.lang.Integer");
        primitiveConversion.put(long.class.toString(), "java.lang.Long");
        primitiveConversion.put(float.class.toString(), "java.lang.Float");
        primitiveConversion.put(double.class.toString(), "java.lang.Double");
    }

    public String getName() {
        return this.name;
    }

    public T getType() {
        return this.type;
    }

    public String getTypeAsString() {
        return convertPrimitive(this.type.toString());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(T type) {
        this.type = type;
    }

    public String convertPrimitive(String type) {
        if (this.primitiveConversion.containsKey(type)) {
            return primitiveConversion.get(type);
        }
        return type;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !LocalVariable.class.isAssignableFrom(object.getClass())) {
            return false;
        }
        LocalVariable other = (LocalVariable) object;
        if (!this.getName().equals(other.getName())) {
            return false;
        }
        if (!this.getType().equals(other.getType())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.getName() != null ? this.getName().hashCode() : 0);
        hash = 53 * hash + (this.getType() != null ? this.getType().hashCode() : 0);
        return hash;
    }
}

