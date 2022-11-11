package proy.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import org.junit.BeforeClass;

import proy.EmpleadoBR;
import proy.ExceptionBR;
import proy.TipoEmpleado;

public class EmpleadoBRTest {
	
	private static EmpleadoBR emp; 
	@BeforeClass
	public static void init() {
		emp = new EmpleadoBR();
	}
	
	////SalariosBruto Tests 
		
	//Salario Brutobase
	
	@Test
	public void testCalcularSalarioBrutoBase() throws ExceptionBR {
		float result = emp.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 0, 0);
		assertEquals(1000.0f, result, 0.0f);
		result = emp.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 0, 0);
		assertEquals(1500.0f, result, 0.0f);
	}

	//Test salarios brutos excepciones
	
		@Test(expected=ExceptionBR.class)
		public void testSBException3() throws ExceptionBR {
			emp.calculaSalarioBruto(null, 1500.0f, 8);
		}
	
		@Test(expected=ExceptionBR.class)
		public void testSBException2() throws ExceptionBR {
			emp.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1500.0f, -1);
		}
	
		@Test(expected=ExceptionBR.class)
		public void testSBException1() throws ExceptionBR {
			emp.calculaSalarioBruto(TipoEmpleado.VENDEDOR, -1, 8);
		}
		
	//Test salarios brutos
		
		@Test
		public void testSBEncargado5() throws ExceptionBR {
			float result = emp.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 0.0f, 8);
			assertEquals(1660.0f, result, 0.0f);
		}
	
		@Test
		public void testSBEncargado4() throws ExceptionBR {
			float result = emp.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 500.0f, 0);
			assertEquals(1500.0f, result, 0.0f);
		}
	
		@Test
		public void testSBEncargado3() throws ExceptionBR {
			float result = emp.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 999.99f, 3);
			assertEquals(1560.0f, result, 0.0f);
		}
	
		@Test
		public void testSBEncargado2() throws ExceptionBR {
			float result = emp.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 1000.0f, 0);
			assertEquals(1600.0f, result, 0.0f);
		}
	
		@Test
		public void testSBEncargado1() throws ExceptionBR {
			float result = emp.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 1250.0f, 8);
			assertEquals(1760.0f, result, 0.0f);
		}
	
		@Test
		public void testSBVendedor3() throws ExceptionBR {
			float result = emp.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1500.0f, 3);
			assertEquals(1260.0f, result, 0.0f);
		}
		
		@Test
		public void testSBVendedor2() throws ExceptionBR {
			float result = emp.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1499.9f, 0);
			assertEquals(1100.0f, result, 0.0f);
		}
	
		@Test
		public void testSBVendedor1() throws ExceptionBR {
			float result = emp.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 2000, 8);
			assertEquals(1360.0f, result, 0.0f);
		}
		
		//Test Salario Neto Excepcion
		
		@Test(expected=ExceptionBR.class)
		public void testSNetoException1() throws ExceptionBR {
			emp.calculaSalarioNeto(-1);
		}
		
		//Test Salario Neto
		
		@Test
		public void testSNeto7() throws ExceptionBR {
			float result = emp.calculaSalarioNeto(0.0f);
			assertEquals(0.0f, result, 0.0f);
		}
		
		@Test
		public void testSNeto6() throws ExceptionBR {
			float result = emp.calculaSalarioNeto(500.0f);
			assertEquals(500.0f, result, 0.0f);
		}
		
		@Test
		public void testSNeto5() throws ExceptionBR {
			float result = emp.calculaSalarioNeto(999.99f);
			assertEquals(999.99f, result, 0.0f);
		}
		
		@Test
		public void testSNeto4() throws ExceptionBR {
			float result = emp.calculaSalarioNeto(1250.0f);
			assertEquals(1050.0f, result, 0.0f);
		}
		
		@Test
		public void testSNeto3() throws ExceptionBR {
			float result = emp.calculaSalarioNeto(1499.99f);
			assertEquals(1259.9917f, result, 0.0f);
		}
		
		@Test
		public void testSNeto2() throws ExceptionBR {
			float result = emp.calculaSalarioNeto(1500.0f);
			assertEquals(1230.0f, result, 0.0f);
		}
		
		@Test
		public void testSNeto1() throws ExceptionBR {
			float result = emp.calculaSalarioNeto(2000.0f);
			assertEquals(1640.0f, result, 0.0f);
		}
}
