package nuts.context;

/**
 * The is the root context ,provide life-cycle control 
 * 
 * @author cui.jiajun
 *
 */
public interface NutsHome {
	/**
	 * Initialize context by given resource 
	 * 
	 * @throws NutsHomeInitializeException
	 */
	public void init(Resource resource) throws NutsHomeInitializeException;
	/**
	 * Destroy the context and all nuts registered
	 * 
	 * @throws ContextDestroyException
	 */
	public void destroy() throws ContextDestroyException;
	
	/**
	 * Get nut by passing name ,and type.
	 * The name type combination should be UNIQUE across all nuts
	 * If anyone is founded ,then return it,otherwise just throw {@code NutsNotFoundException}
	 * 
	 * @param name
	 * @return return a list of all nuts founded,if searching by name works ,then the return 
	 */
	public<T> T getNut(String name,T type) throws NutsNotFoundException;
	
	/**
	 * Refresh the Nut by given name and type 
	 * The name type combination should be UNIQUE across all nuts
	 * 
	 * @param name
	 */
	public<T> void refreshNut(String name,T type) throws NutsRegisterException;
}
