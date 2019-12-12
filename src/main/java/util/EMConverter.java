package util;

import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class EMConverter implements Converter {
	
	private Map<Class, Map<String, Enum>> enumRecorder = new HashMap<Class, Map<String, Enum>>();

	public boolean canConvert(Class type) {
		if (type == null) {
			return false;
		}
		
        return type.isEnum() || Enum.class.isAssignableFrom(type);
    }

    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        Enum enumObj = (Enum) source;
        
        if(!enumRecorder.containsKey(source.getClass())) {
        	Map<String, Enum> enumMap = new HashMap<String, Enum>();
        	enumMap.put(enumObj.name(), enumObj);
        	enumRecorder.put(source.getClass(), enumMap);
        }
        else {
        	Map<String, Enum> enumMap = enumRecorder.get(source.getClass());
        	if(!enumMap.containsKey(enumObj.name()))
        		enumMap.put(enumObj.name(), enumObj);
        }
        
    	writer.setValue(((Enum) source).name());
    }

    @SuppressWarnings("unchecked")
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        Class type = context.getRequiredType();
        if(type.getSuperclass() != Enum.class)
            type = type.getSuperclass();
        String name = reader.getValue();
        
        try {
        	if(!enumRecorder.containsKey(type))
        		return Enum.valueOf(type, name);
        	else
        		return enumRecorder.get(type).get(name);
        } catch(IllegalArgumentException e) {
            for (Enum c : (Enum[]) type.getEnumConstants())
                if (c.name().equalsIgnoreCase(name))
                    return c;
            throw e;
        }
    }
}