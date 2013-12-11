package denobo;

/**
 * Implemented by any class that wants to receive events from a {@link NetworkPortal}.
 *
 * @author Alex Mullen
 */
public interface NetworkPortalObserver {
    
    /**
     * Invoked whenever an incoming connection request is accepted.
     * 
     * @param ip        The IP address of the remote host.
     * @param port      The port address the remote host is using.
     */
    public void incomingConnectionAccepted(String ip, int port);
    
    /**
     * Invoked whenever a connection is closed or lost/dropped.
     * 
     * @param ip        The IP address of the remote host.
     * @param port      The port address the remote host was using.
     */
    public void connectionClosed(String ip, int port);
}