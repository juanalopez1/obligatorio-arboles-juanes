```
Ejercicio #1
Operaciones Complementarias – seudocódigo y análisis
```
## Descripción en lenguaje natural del los algoritmos solicitados
- Obtener la menor clave del árbol

Para obtener la mayor clave del árbol, teniendo el cuenta que el arbol es de busqueda, sabemos que la clave menor va a ser la que este mas abajo a la izquierda

- Obtener la mayor clave del árbol

Para obtener la mayor clave del árbol, teniendo el cuenta que el arbol es de busqueda, sabemos que la clave mayor va a ser la que este mas abajo a la derecha

- Obtener la clave inmediata anterior a una clave dada (pasada por parámetro)

Para obtener el padre de una clave pasada por parametro lo que hicimos fue ir recorriendo el arbol desde un nodo inicial(pasado por parametro ya que es necesario para la recursividad) e ir identificando hijo izquierdo y derecho del mismo, para posteriormente comparar dichos hijos con la clave pasada por parametro. Si la clave coincide con el hijo, tenemos anteriormente el padre de la misma guardado en "inicial".

- Obtener la cantidad de nodos de un nivel dado (por parámetro)

- Listar todas las hojas cada una con su nivel

Para esto fuimos contando en un contador que incrementa en 1 cada vez que pasamos por un nivel que no tiene hoja hasta hallar una hoja e imprimir la misma con su respectivo nivel. 

- Verificar si el árbol es de búsqueda.

El método creado "isItBST" comprueba si un árbol binario es un árbol de búsqueda binario. Primero, si el nodo actual no tiene hijos, se considera automáticamente un BST, ya que no hay subárboles que puedan violar las reglas. Luego, el método verifica los hijos del nodo actual. Si el hijo izquierdo tiene un valor mayor o igual al del nodo actual, o si el hijo derecho tiene un valor menor o igual, el árbol no es un BST.
Posterior a eso, si el hijo izquierdo es menor, se llama recursivamente a la función dentro de *if (!hijoIzq.isItBST())*, si el resultado de isItBST es true, no entra dentro del if (por la negación), ya que si no lo hace se retorna verdadero afuera del if. Si entra significa que el resultado de la recursión fue false, ! la cambia a true, entra al if, y retorna falso. Lo mismo para el caso de si el hijo derecho es mayor.


## Identificación de precondiciones y postcondiciones correspondientes
## Descripción en lenguaje natural de los casos de prueba correspondientes a cada operación
En todos los tests el árbol armado es el siguiente:
![solo hasta el nivel 2.](https://www.google.com/search?sca_esv=8785e4754248b691&sca_upv=1&rlz=1C1ONGR_esUY1051UY1051&sxsrf=ADLYWILZlH1Ol_hDt0pFZmn5a7714z-uGg:1718297014555&q=arboles+binarios+de+busqueda&udm=2&fbs=AEQNm0CbCVgAZ5mWEJDg6aoPVcBgWizR0-0aFOH11Sb5tlNhdzTfxpAVBoexMFZnKJBpl_NibeLqpdqLlYXarYwntqndckCh-_UekfZeEUHAriRf3YwL5wTERH5F8ox7T1JVfAU01pSNpD9G8Gvf0MTkVlPR7TV0tmVzH1FdFoibpEGS6UXFi43aeq0Evrw4VoDrdA24iBpJ&sa=X&ved=2ahUKEwiD8q6Zg9mGAxWOA7kGHYvhDTMQtKgLegQIDRAB&biw=1707&bih=772&dpr=1.13#vhid=FvEwWNxTSkyxtM&vssid=mosaic)

- Caso de prueba **testFindLargest()**

Se crea el arbol mostrado en la imagen, se espera que el resultado que el metodo retorna sea 14 (recrdemos que el arbol esta armado hasta el nivel 2). El test comprueba que el método findLargest() correctamente identifica al nodo con el valor 14 como el más grande en el árbol y compara este resultado con el valor esperado usando assertEquals.

- Caso de prueba **testFindShortest()**

Se crea el arbol mostrado en la imagen, se espera que el resultado que el metodo retorna sea 1 (recrdemos que el arbol esta armado hasta el nivel 2). El test comprueba que el método findShortest() correctamente identifica al nodo con el valor 1 como el más chico en el árbol y compara este resultado con el valor esperado usando assertEquals.

- Caso de prueba **testGetParent()**

Se crea el arbol mostrado en la imagen, se espera que el resultado que el metodo retorna sea 10, ya que el nodo que se pasa como parametro es el 14. El test comprueba que el método getParent() correctamente identifica al nodo padre con el valor 10 como la clave inmediata anterior a la clave dada por parametro (14) y compara este resultado con el valor esperado usando assertEquals.

- Caso de prueba **testItIsBST()**

El método testIsItBST() verifica si un árbol binario de búsqueda (BST) está construido correctamente. Se crean varios nodos con valores específicos (1, 3, 5, 6, 10 y 14) y se estructuran de la siguiente manera:

El nodo raíz tiene el valor 5.
El nodo con valor 10 se establece como el hijo derecho de la raíz.
El nodo con valor 3 se establece como el hijo izquierdo de la raíz.
El nodo con valor 1 se establece como el hijo izquierdo del nodo con valor 3.
El nodo con valor 6 se establece como el hijo derecho del nodo con valor 3.
El nodo con valor 14 se establece como el hijo derecho del nodo con valor 10.
Luego, el método llama a isItBST() para verificar si esta estructura es un BST válido. El resultado esperado es true, indicando que el árbol cumple con las propiedades de un BST. La prueba compara este resultado con el valor esperado utilizando assertEquals.

- Caso de prueba **testItIsNotBST()**

El método testIsItBST() verifica si un árbol binario de búsqueda (BST) está construido correctamente. Se crean varios nodos con valores específicos (1, 9, 5, 6, 10 y 14) y se estructuran de la siguiente manera:

El nodo raíz tiene el valor 5.
El nodo con valor 10 se establece como el hijo derecho de la raíz.
El nodo con valor 9 se establece como el hijo izquierdo de la raíz.
El nodo con valor 1 se establece como el hijo izquierdo del nodo con valor 9.
El nodo con valor 6 se establece como el hijo derecho del nodo con valor 9.
El nodo con valor 14 se establece como el hijo derecho del nodo con valor 10.
Luego, el método llama a isItBST() para verificar si esta estructura es un BST válido. El resultado esperado es false, ya que el 9 esta incorrectamente posicionado, indicando que el árbol no cumple con las propiedades de un BST. La prueba compara este resultado con el valor esperado utilizando assertEquals.

- Caso de prueba **levelAndLeaf()**

No testeamos este metodo ya que no retorna nada (void), simplemente imprime una string con los datos.

## Escritura del algoritmo en seudocódigo formal 

- Seudocódigo **findLargest**

Algoritmo findLargest
    Si (hijoDer == nulo) Entonces
        retornar este
    Sino
        retornar hijoDer.findLargest()
    FinSi
FinAlgoritmo

- Seudocódigo **findShortest**

Algoritmo findShortest
    Si (hijoIzq == nulo) Entonces
        retornar este
    Sino
        retornar hijoIzq.findShortest()
    FinSi
FinAlgoritmo

- Seudocódigo **getParent**

Algoritmo getParent(hijoAbuscar: TElementoAB) -> TElementoAB
    Si (hijoAbuscar.getEtiqueta() < this.getEtiqueta()) Entonces
        Si (hijoIzq ≠ nulo Y hijoAbuscar.getEtiqueta() == hijoIzq.getEtiqueta()) Entonces
            retornar este
        Sino
            retornar hijoIzq.getParent(hijoAbuscar)
        FinSi
    FinSi
    Si (hijoAbuscar.getEtiqueta() > this.getEtiqueta()) Entonces
        Si (hijoDer ≠ nulo Y hijoAbuscar == hijoDer) Entonces
            retornar este
        Sino
            retornar hijoDer.getParent(hijoAbuscar)
        FinSi
    Sino
        retornar nulo
    FinSi
FinAlgoritmo

- Seudocódigo **isItBST**

Algoritmo isItBST() -> boolean
    Si (hijoIzq == nulo Y hijoDer == nulo) Entonces
        retornar verdadero
    FinSi
    Si (hijoIzq ≠ nulo) Entonces
        Si (hijoIzq.getEtiqueta() > this.getEtiqueta()) Entonces
            retornar falso
        Sino
            Si (NO hijoIzq.isItBST()) Entonces
                retornar falso
            FinSi
        FinSi
    FinSi
    Si (hijoDer ≠ nulo) Entonces
        Si (hijoDer.getEtiqueta() < this.getEtiqueta()) Entonces
            retornar falso
        Sino
            Si (NO hijoDer.isItBST()) Entonces
                retornar falso
            FinSi
        FinSi
    FinSi
    retornar verdadero
FinAlgoritmo

- Seudocódigo **levelAndLeaf**

Procedimiento levelAndLeaf(level: entero)
    Si (hijoIzq ≠ nulo O hijoDer ≠ nulo) Entonces
        level += 1
        Si (hijoDer ≠ nulo Y hijoIzq ≠ nulo) Entonces
            hijoIzq.levelAndLeaf(level)
            hijoDer.levelAndLeaf(level)
        Sino Si (hijoDer == nulo) Entonces
            hijoIzq.levelAndLeaf(level)
        Sino Si (hijoIzq == nulo) Entonces
            hijoDer.levelAndLeaf(level)
        FinSi
    FinSi
    Si (hijoDer == nulo Y hijoIzq == nulo) Entonces
        Escribir("La hoja " + this.getEtiqueta().toString() + " está en el nivel " + nivel)
    FinSi
FinProcedimiento

## Análisis detallado del orden del tiempo de ejecución del algoritmo