package mx.developer.jcbp.structural.proxy;

import mx.developer.jcbp.structural.proxy.batch.BatchProcess;

public class ProxyPatternExample {
	
	public static void main(String[] args) {

        BatchProcess batchProcess = new ProxyBatchProcess("big_file.txt");

        //batchProcess will be loaded from disk
        System.out.println("BatchProcess will be loaded from disk");
        batchProcess.process();

        System.out.println("-----------------");

        //batchProcess will not be loaded from disk
        System.out.println("BatchProcess will not be loaded from disk");
        batchProcess.process();
    }
}
