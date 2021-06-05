package br.com.x10d.banco;

import java.nio.file.Paths;

import one.microstream.storage.types.EmbeddedStorage;
import one.microstream.storage.types.EmbeddedStorageManager;

public class TesteComBanco {

	public static void main(String[] args) throws InterruptedException {
		
		final DataRoot root = new DataRoot();
		final EmbeddedStorageManager storageManager = EmbeddedStorage.start(root, Paths.get("data"));
		Thread.sleep(1000);
		//salva(storageManager, root, "Fernando Pereira Santos", 32);
		Thread.sleep(1000);
			DataRoot encontrados = findAll(storageManager);
			//encontrados.setConteudo("Lais ribeiro");
			//encontrados.setNumero(26);
			//update(storageManager,  encontrados);
		Thread.sleep(1000);
			findAll(storageManager);
		Thread.sleep(1000);
			storageManager.shutdown();
		Thread.sleep(1000);
	}
	private static void salva(EmbeddedStorageManager storageManager, DataRoot root, String conteudo, int numero) {
		root.setConteudo(conteudo);
		root.setNumero(numero);
		storageManager.storeRoot();
	}
	private static DataRoot findAll(EmbeddedStorageManager storageManager) {
		DataRoot root2 = (DataRoot)storageManager.root();
		System.out.println("getConteudo: "+root2.getConteudo());
		System.out.println("getNumero: "+root2.getNumero());
		return root2;
	}
	private static void update(EmbeddedStorageManager storageManager, DataRoot encontrado) {
		salva(storageManager, encontrado, encontrado.getConteudo(), encontrado.getNumero());
	}
	
}
