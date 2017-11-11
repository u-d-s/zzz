package uds.birdmanbros.test.mvntest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
    	JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");
    	
    	try (Jedis jedis = pool.getResource()) {
    		  /// ... do stuff here ... for example
    		  jedis.set("client", "jedis");
    		  String str  = jedis.get("client");
    		  System.out.format(":->  %s%n", str);
    		}
    	/// ... when closing your application:
    	pool.destroy();
    }
}
