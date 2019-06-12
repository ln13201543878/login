package service;

public class IServiceFactory {

	public static IService getISrviceImpl() {
		return new IServiceImpl();
	}
}
