## Descripción en lenguaje natural del algoritmo solicitado
# Obtener la menor clave del árbol
Para obtener la mayor clave del árbol, teniendo el cuenta que el arbol es de busqueda, sabemos que la clave menor va a ser la que este mas abajo a la izquierda
# Obtener la mayor clave del árbol
Para obtener la mayor clave del árbol, teniendo el cuenta que el arbol es de busqueda, sabemos que la clave mayor va a ser la que este mas abajo a la derecha
# Obtener la clave inmediata anterior a una clave dada (pasada por parámetro)
Para obtener el padre de una clave pasada por parametro lo que hicimos fue ir recorriendo el arbol desde un nodo inicial(pasado por parametro ya que es necesario para la recursividad) e ir identificando hijo izquierdo y derecho del mismo, para posteriormente comparar dichos hijos con la clave pasada por parametro. Si la clave coincide con el hijo, tenemos anteriormente el padre de la misma guardado en "inicial".
# Obtener la cantidad de nodos de un nivel dado (por parámetro)

# Listar todas las hojas cada una con su nivel
Para esto fuimos contando en un contador que incrementa en 1 cada vez que pasamos por un nivel que no tiene hoja, hasta hayar una hoja e imprimir la misma con su respectivo nivel. Cuando la hallamos, la guardamos en una lista de nodos, donde la etiqueta es el nivel, y el dato el TElementoAB (la hoja).
# Verificar si el árbol es de búsqueda.
El método creado "esDeBusqueda" comprueba si un árbol binario es un árbol de búsqueda binario. Primero, si el nodo actual no tiene hijos, se considera automáticamente un BST, ya que no hay subárboles que puedan violar las reglas. Luego, el método verifica los hijos del nodo actual. Si el hijo izquierdo tiene un valor mayor o igual al del nodo actual, o si el hijo derecho tiene un valor menor o igual, el árbol no es un BST. Si ambas condiciones se cumplen, el método llama a sí mismo recursivamente en los subárboles izquierdo y derecho, y solo devuelve true si ambos subárboles también son BST.


Si es una hoja = true (sin hijos)
si hijoizq>this || hijoder<this = false
recurso return (esdebusqueda(hijoizq) && esdebusqueda(hijoder))

## Identificación de precondiciones y postcondiciones correspondientes
## Descripción en lenguaje natural de los casos de prueba correspondientes a cada operación
## Escritura del algoritmo en seudocódigo formal 
## Análisis detallado del orden del tiempo de ejecución del algoritmo