package proy;

public class EmpleadoBR {
	
	public float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) throws ExceptionBR {
		if (tipo == null || ventasMes < 0 || horasExtra < 0)
			throw new ExceptionBR ("Invalid parameters!");
		
		float salario = 0.0f;
		if (tipo.equals(TipoEmpleado.VENDEDOR)) {
			salario = 1000;
		}
		if (tipo.equals(TipoEmpleado.ENCARGADO)) {
			salario = 1500;
		}
		if (ventasMes >= 1500) {
			salario += 200;
		} else if (ventasMes >= 1000) {
			salario += 100;
		}
		salario += (horasExtra * 20);
		return salario;
	}
	
	public float calculaSalarioNeto(float salarioBruto) throws ExceptionBR {
		float retencion = 0.0f;
		if (salarioBruto < 0) throw new ExceptionBR("Neagtive salary!");
		if (salarioBruto >= 1500) retencion = 0.18f;
		else if (salarioBruto >= 1000 && salarioBruto < 1500) retencion = 0.16f;
		return (1 - retencion) * salarioBruto;
	}

}
