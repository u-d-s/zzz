package uds.birdmanbros.test;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisConnection;
import com.lambdaworks.redis.api.StatefulRedisConnection;
import com.lambdaworks.redis.api.sync.RedisCommands;


public class App
{
    public static void main( String[] args )
    {
    	System.out.format("alo%n");
    	RedisClient redisClient = RedisClient.create("redis://localhost:6379");
    	StatefulRedisConnection<String, String> connection = redisClient.connect();
    	RedisCommands<String, String> syncCommands = connection.sync();

    	syncCommands.set("lettuce2", "Hello, Redis!");

   	connection.close();
    	redisClient.shutdown();

    }
}
