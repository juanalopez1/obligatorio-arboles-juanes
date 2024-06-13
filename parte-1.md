```
Ejercicio #1
Operaciones Complementarias – seudocódigo y análisis
```
# Descripción en lenguaje natural del algoritmo solicitado
### Obtener la menor clave del árbol
Para obtener la mayor clave del árbol, teniendo el cuenta que el arbol es de busqueda, sabemos que la clave menor va a ser la que este mas abajo a la izquierda
### Obtener la mayor clave del árbol
Para obtener la mayor clave del árbol, teniendo el cuenta que el arbol es de busqueda, sabemos que la clave mayor va a ser la que este mas abajo a la derecha
### Obtener la clave inmediata anterior a una clave dada (pasada por parámetro)
Para obtener el padre de una clave pasada por parametro lo que hicimos fue ir recorriendo el arbol desde un nodo inicial(pasado por parametro ya que es necesario para la recursividad) e ir identificando hijo izquierdo y derecho del mismo, para posteriormente comparar dichos hijos con la clave pasada por parametro. Si la clave coincide con el hijo, tenemos anteriormente el padre de la misma guardado en "inicial".
### Obtener la cantidad de nodos de un nivel dado (por parámetro)

### Listar todas las hojas cada una con su nivel
Para esto fuimos contando en un contador que incrementa en 1 cada vez que pasamos por un nivel que no tiene hoja hasta hallar una hoja e imprimir la misma con su respectivo nivel. 

### Verificar si el árbol es de búsqueda.
El método creado "isItBST" comprueba si un árbol binario es un árbol de búsqueda binario. Primero, si el nodo actual no tiene hijos, se considera automáticamente un BST, ya que no hay subárboles que puedan violar las reglas. Luego, el método verifica los hijos del nodo actual. Si el hijo izquierdo tiene un valor mayor o igual al del nodo actual, o si el hijo derecho tiene un valor menor o igual, el árbol no es un BST.
Posterior a eso, si el hijo izquierdo es menor, se llama recursivamente a la función dentro de *if (!hijoIzq.isItBST())*, si el resultado de isItBST es true, no entra dentro del if (por la negación), ya que si no lo hace se retorna verdadero afuera del if. Si entra significa que el resultado de la recursión fue false, ! la cambia a true, entra al if, y retorna falso. Lo mismo para el caso de si el hijo derecho es mayor.


# Identificación de precondiciones y postcondiciones correspondientes
# Descripción en lenguaje natural de los casos de prueba correspondientes a cada operación
# Escritura del algoritmo en seudocódigo formal 
# Análisis detallado del orden del tiempo de ejecución del algoritmo