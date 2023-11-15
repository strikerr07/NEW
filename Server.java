package com.csc435.app;

public class Server
{
    public static void main( String[] args )
    {
        IndexStore store = new IndexStore();
        ServerSideEngine engine = new ServerSideEngine(store);
        ServerAppInterface appInterface = new ServerAppInterface(engine);
        
        engine.initialize();
        appInterface.readCommands();
    }
}
