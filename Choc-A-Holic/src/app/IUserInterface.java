package app;

import java.lang.reflect.Type;

public interface IUserInterface {
	/**
	 * @param Message
	 * Adds a message to the listing for display
	 */
	public void addMessageLine(String Message);
	
	/**
	 * @param maxCharCOunt - Allowed number of characters entered
	 * Displays the stored messages to the user and wipes out the display
	 *
	 */
	public void displayMsg(String methodName, Class<?> cls, int maxCharCount);
	
	public void setMethodInvoker(IMethodInvoker methodInvoker);

}