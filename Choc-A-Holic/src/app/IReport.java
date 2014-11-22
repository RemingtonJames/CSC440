package app;

public interface IReport {

	/**
	 * @param args
	 */
	public void runReport(String filename);
	
	public void setMemeber(Member m);
	
	public void setProvider(Provider p);
	
	public void setProviderService(ProvidedService ps);

}
