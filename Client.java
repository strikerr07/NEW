package com.csc435.app;

public class Client 
{
    public static void main(String[] args)
    {
        ClientSideEngine engine = new ClientSideEngine();
        ClientAppInterface appInterface = new ClientAppInterface(engine);

        appInterface.readCommands();
    }
}
