package com.csc435.app;

public class ServerSideEngine {
    private IndexStore store;

    public ServerSideEngine(IndexStore store) {
        this.store = store;
        // TO-DO implement constructor
    }

    public void initialize() {
        // TO-DO create one dispatcher threads
    }
    
    public void runDispatcher() {
        // TO-DO create the server socket and listen for and accept new connections
        // HINT each new connection gets managed by a different worker thread -> create new worker thread
    }

    public void runWorker() {
        // TO-DO receive and index data from the client until the client disconnects
    }

    public void shutdown() {
        // TO-DO join the dispatcher and worker threads
    }
}
