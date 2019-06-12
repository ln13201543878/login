package dao;

public class IDaoFactory {
	
	
public static IDao getIDaoImpl() {
	return new IDaoImpl();
}
}
