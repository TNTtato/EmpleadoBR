# EmpleadoBR Testing

Este es un proyecto de práctica para probar los métodos de una clase EmpleadoBR, haciendo uso de pruebas unitariarias con JUnit 4.

Las Especificaciones son las siguientes:

| Método | Especificación |
|--------|----------------|
|float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) | El salario base será 1000 euros si el empleado es de tipo TipoEmpleado.vendedor, y de 1500 euros si es de tipo TipoVendedor.encargado. A esta cantidad se le sumará una prima de 100 euros si ventasMes es mayor o igual que 1000 euros, y de 200 euros si fuese al menos de 1500 euros. Por último, cada hora extra se pagará a 20 euros. Si tipo es null, o ventasMes o horasExtra toman valores negativos el método lanzará una excepción de tipo BRException. |
|float calculaSalarioNeto(float salarioBruto) | Si el salario bruto es menor de 1000 euros, no se aplicará ninguna retención. Para salarios a partir de 1000 euros, y menores de 1500 euros se les aplicará un 16%, y a los salarios a partir de 1500 euros se les aplicará un 18%. El método nos devolverá salarioBruto * (1-retencion), o BRExcepcion si el salario es menor que cero. |

## Clase y Tests

La Clase se encuentra [aquí](./src/proy/EmpleadoBR.java).
Los Test se encuentran [aquí](./src/proy/test/EmpleadoBRTest.java)