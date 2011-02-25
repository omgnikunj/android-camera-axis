package com.myapps;

/**
 * Camera class describe information's camera
 */
public class Camera implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    protected String id, login, pass, ip, protocol, uri;
    protected int port, channel;

    /**
     * Public constructor for a camera with information
     * 
     * @param id
     *            The camera name
     * @param login
     *            Your login for private acces
     * @param pass
     *            Your pass for private acces
     * @param ip
     *            Ip's Camera
     * @param port
     *            Port's Camera
     * @param protocol
     *            Only "http" at the moment
     * @param channel
     *            The channel's camera (no channel = 1)
     */
    public Camera(String id, String login, String pass, String ip, int port,
	    String protocol, int channel) {
	this.id = id;
	this.login = login;
	this.pass = pass;
	this.ip = ip;
	this.port = port;
	this.protocol = protocol;
	this.channel = channel;
	this.uri = makeURL(ip, port, protocol);
    }

    /**
     * Public constructor for a camera with a URI form QrCode
     * 
     * @param id
     *            The name of th camera
     * @param login
     *            Your login for private acces
     * @param pass
     *            Your pass for private acces
     * @param uri
     *            The address's camera
     * @param channel
     *            The channel's camera (no channel = 1)
     */
    public Camera(String id, String login, String pass, String uri, int channel) {
	this.id = id;
	this.login = login;
	this.pass = pass;
	this.uri = uri;
	this.channel = channel;
    }

    /**
     * Create the address from camera's information
     * 
     * @param ip
     *            Ip's camera
     * @param port
     *            Port's camera
     * @param protocol
     *            Only "http" at the moment
     * @return The camera URL
     */
    private String makeURL(String ip, int port, String protocol) {
	return "" + protocol + "://" + ip + ":" + port + "/";
    }

    /**
     * Get the address's camera
     * 
     * @return address's camera
     */
    public String getURI() {
	return uri;
    }

    /**
     * toString with camera name
     * 
     * @return camera.id
     */
    @Override
    public String toString() {
	return id;
    }
}