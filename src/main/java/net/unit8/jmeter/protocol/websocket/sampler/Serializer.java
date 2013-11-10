package net.unit8.jmeter.protocol.websocket.sampler;

/**
 * Interface for binaryMessage serializer
 * 
 * @author sakurai_yoshinobu
 *
 */
public interface Serializer {

	byte[] serialize(String arg) throws Exception;

	String deserialize(byte[] arg) throws Exception;

}