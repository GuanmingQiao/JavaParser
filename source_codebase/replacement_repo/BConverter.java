package replacement_repo;

import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class BConverter implements Converter {
	
	public static boolean shouldBlock(Class<?> clazz) {
		if (Reader.class.isAssignableFrom(clazz) 
				|| Writer.class.isAssignableFrom(clazz) 
				|| Scanner.class.isAssignableFrom(clazz)
				|| StringTokenizer.class.isAssignableFrom(clazz))
			return true;
		else
			return false;
	}

	@Override
	public boolean canConvert(Class arg0) {
		if (arg0 == null)
			return false;
		return shouldBlock(arg0);
	}

	@Override
	public void marshal(Object arg0, HierarchicalStreamWriter arg1, MarshallingContext arg2) {}

	@Override
	public Object unmarshal(HierarchicalStreamReader arg0, UnmarshallingContext arg1) {
		return null;
	}
}