# PC3-Software #

## Principio de responsabilidad única ##
- Pregunta 1	
Muestra la salida y explica los resultados en función de los métodos entregados

- Pregunta 2
¿Cuál es el problema con este diseño y las razones posibles del problema?

- Pregunta 3
Modifica la clase Empleado. Agrega dos clases SeniorityChecker que contiene el
método checkSeniority() y la clase GeneradorIDEmpleado contiene el método
generateEmpId(...) para generar la identificación del empleado.
Para mejorar la legibilidad del código y evitar torpezas dentro del método main(), utiliza el
método estático showEmpDetail(...). Este método llama al método displayEmpDetail() de
Empleado, al método generateEmpId() de GeneradorIDEmpleado y al método checkSeniority()
de SeniorityChecker. Tú entiendes que este método no era necesario, pero hace que el código
del cliente sea simple y fácilmente comprensible.

- Pregunta 4
Realiza una demostración completa que sigue a SRP. Explica tus resultados

## Principio abierto/cerrado ##
- Pregunta 5
¿Por que no es correcto colocar displayResult() y evaluateDistinction() en la misma
clase, como la siguiente:
```
class Estudiante {
    // ....
    public void displayResult() {
        // codigo
    }
    public void evaluateDistinction() {
        // codigo
    }
    // ...
}
```

- Pregunta 6
Muestra la salida y explica los resultados en función de los métodos entregados

- Pregunta 7
¿Cuál es el problema con este diseño y las razones posibles del problema?

- Pregunta 8
Debes abordar el método de evaluación para la distinción de una mejor manera.
Por lo tanto, crea la interfaz DistinctionDecider que contiene un método llamado
EvaluationDistinction.

- Pregunta 9
Completa el código de ArtsDistinctionDecider y ScienceDistinctionDecider que
implementan esta interfaz y sobreescriben el método de evaluateDistinction(...) para
especificar los criterios de evaluación según sus necesidades. De esta forma, los criterios de
distinción específicos de flujo se envuelven en una unidad independiente.

- Pregunta 10
Realiza una demostración completa que sigue a OCP. Explica tus resultados

- Pregunta 11
¿Cuáles son las principales ventajas ahora?

## Principio de sustitución de Liskov ##

- Pregunta 12
Muestra la salida y explica los resultados en función de los métodos entregados

- Pregunta 13
Ahora supongamos que tienes un nuevo requisito que dice que necesitas admitir
usuarios invitados en el futuro. Puedes procesar la solicitud de pago de un usuario invitado,
pero no muestra su último detalle de pago. Entonces, crea la siguiente clase que implementa la
interfaz de pago de la siguiente manera:
```
class GuestUserPayment implements Payment {
    String name;
    public GuestUserPayment() {
        this.name = "guest";
    }
    @Override
    public void previousPaymentInfo(){
        throw new UnsupportedOperationException();
    }
    @Override
    public void newPayment(){
        System.out.println("Procesando de "+name+ "pago actual
                request.");
    }
}
```
- Pregunta 14
Dentro del método main(), utilizas una instancia de usuario invitado e intentas
usar su clase auxiliar de la misma manera,¿ qué tipo de excepción te encuentras?¿Cuál es la
solución?

- Pregunta 15
Todo lo anterior Lo más importante es que viola el OCP cada vez que modifica una
clase existente que usa esta cadena if-else. Entonces, busquemos una mejor solución.

- Pregunta 16
En el próximo programa, eliminaremos el método newPayment() de la interfaz de
payment. Coloca este método en otra interfaz llamada NewPayment. Como resultado, ahora
tienes dos interfaces con las operaciones específicas. Dado que todos los tipos de usuarios
pueden generar una nueva solicitud de pago, las clases concretas de RegisteredUserPayment y
GuestUserPayment implementan la interfaz NewPayment.

- Pregunta 17
¿Cuáles son los cambios clave?

- Pregunta 18
Ten que aquí el enfoque clave estaba en el principio LSP, nada más. Podrías
refactorizar fácilmente el código del cliente usando algún método estático. Por ejemplo realiza
una modificación donde utilizas un método estático para mostrar todas las solicitudes de pago
y utilizar este método siempre que lo necesites.

## Principio de segregación de interfaz ##

- Pregunta 19
¿Por qué un usuario necesita cambiar una clase base (o una interfaz)? Para
responder a esto, supongamos que deseas mostrar qué el tipo de fax está utilizando en una fase
de desarrollo posterior.

- Pregunta 20
Para usar esta jerarquía de herencia, una vez que modificas el método sendFax() a
sendFax(Fax faxType) en la clase ImpresoraAvanzada, exige que cambies la interfaz de
Impresora (sí, aquí también rompe el OCP).

- Pregunta 21
Si has entendido correctamente el problema. El ISP te sugiere que te ocupes de
este tipo de escenario. Explica tu respuesta.

- Pregunta 22
¿Es conveniente usar e inicializar el siguiente código?
```
interface Impresora {
    void printDocument();
    void sendFax();
}
```
- Pregunta 23
Si comienzas tu codificación considerando las impresoras avanzadas que pueden
imprimir y enviar un fax, está bien. Pero en una etapa posterior, si tu programa también
necesita admitir impresoras básicas,¿ qué código puedes escribir?,

- Pregunta 24
Comprueba tus respuestas añadiendo dentro de main(), el siguiente código
polimórfico:
```
Impresora impresora = new ImpresoraAvanzada();
impresora.printDocument();
        impresora.sendFax();
        impresora = new ImpresoraBasica();
        impresora.printDocument();
//impresora .sendFax();
```

- Pregunta 25
Reemplaza el segmento de código
```
for (Impresora dispositivo : impresoras) { .printDocument();
    // dispositivo.sendFax();
}
```
- Pregunta 26
Muestra la salida y explica los resultados en función de los métodos entregados.

- Pregunta 27
Supongamos que necesitas admitir otra impresora que pueda imprimir, enviar
faxes y fotocopiar. En este caso, si agregas un método de fotocopiado en la interfaz Impresora,
los dos clientes existentes, ImpresoraBasica y ImpresoraAvanzada, deben adaptarse al cambio.

- Pregunta 28
¿Qué sucede si usa un método predeterminado dentro de la interfaz?

- Pregunta 29
¿Qué sucede si proporcionas un método de fax predeterminado en una interfaz?.
Viste el problema potencial con esto!

- Pregunta 30
¿Qué sucede si usa un método vacío, en lugar de lanzar la excepción?

## Principio de inversión de dependencia ##

- Pregunta 31
Muestra la salida y explica los resultados en función de los métodos entregados

- Pregunta 32
El programa es simple, pero ¿qué tipo de problemas presenta?

- Pregunta 33
En el programa de la carpeta SOLID, para el caso DIP verás la siguiente jerarquía:

BaseDatos.java

OracleDatabase.java

- Pregunta 34
Completa todos los archivos siguientes de la sección SOLID

- Pregunta 35
Encuentra alguna excepción a esta sugerencia.

- Pregunta 36
El constructor de la clase InterfazUsuario acepta un parámetro de base de datos.
Proporciona una instalación adicional a un usuario cuando utiliza tanto el constructor como el
método setter (setDatabase) dentro de esta clase. ¿Cuál es el beneficio?.

