package java8_aula7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {

		Cliente cliente = new Cliente();
		
		cliente.setCodigo(1);
		cliente.setCpf("123.456.789-10");
		cliente.setNome("Mar Celo");
		cliente.setEmail("mar@celo.com");
		cliente.setIdade(112);
		cliente.setNumero_cartao("1234 4567 7890");
		
		cliente.getAll();
		
		Reflexao.refletirClasse(cliente, Cliente.class);
		Reflexao.refletirAtributo(cliente, Cliente.class);
		Reflexao.refletirMetodo(cliente, Cliente.class);
		
		Class clienteClasse = Class.forName("java8_aula7.Cliente");
		Object cliente2 = clienteClasse.getConstructor().newInstance();
		
		Field F;
		
		F = cliente2.getClass().getDeclaredField("codigo");
		F.setAccessible(true);
		F.set(cliente2, 2);
		
		F = cliente2.getClass().getDeclaredField("nome");
		F.setAccessible(true);
		F.set(cliente2, "Ro berto");
		
		F = cliente2.getClass().getDeclaredField("cpf");
		F.setAccessible(true);
		F.set(cliente2, "098.876.654-32");
		
		F = cliente2.getClass().getDeclaredField("email");
		F.setAccessible(true);
		F.set(cliente2, "Ro@berto.com");
		
		F = cliente2.getClass().getDeclaredField("idade");
		F.setAccessible(true);
		F.set(cliente2, 07);
		
		F = cliente2.getClass().getDeclaredField("numero_cartao");
		F.setAccessible(true);
		F.set(cliente2, "0987 7654 4321");
		
		Reflexao.refletirClasse(cliente2, cliente2.getClass());
		Reflexao.refletirAtributo(cliente2, cliente2.getClass());
		Reflexao.refletirMetodo(cliente2, cliente2.getClass());
	}

}
