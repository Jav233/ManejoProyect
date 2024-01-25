# Inteligencia de Negocios Segundo Parcial

**Overfiting**=Si se tiene pocos datos y demasiadas caracteristicas el modelo puede sobre ajustarse 

## Sistemas Predictivos

Son sistemas reactivos

Trabajan en función a los datos históricos

Son sistemas proactivos

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled.jpeg)

## Como funcionan los sistemas proactivos?

Variables - Entradas → Son observaciones=Data Sets

ejemplo de entrada

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%201.jpeg)

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%202.jpeg)

## Aprendizaje Automático

-Aprendizaje Supervisado→(Tenemos 1 dataset que tiene X={(X1,Y1),(X2,Y2),(XN,YK)})

X→ Vector de caracteristicas

y se etiqueta con una y 

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%203.jpeg)

X1,X2,X3,XN conjunto de observaciones

En donde X1={x1,x2,x3}atributos de cada TUPLA

[https://www.notion.so](https://www.notion.so)

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%204.jpeg)

Contamos con procesos de :

**Dataset debe estar balanceado**

**Clasificación:**

La etiqueta es una variable categóricas 

**Ejemplo:** 

Identificar si es Hombre ponga 1 o Mujer ponga 2

teniendo misma cantidad de numero de hombre y mujeres

porque si no el sistema se sesga 

aprende con mayor destreza de acuerdo al numero que mas cantidad tenga 

**Sistema binomial** k=2 →{y1,y2}

**Sistema Multiclase** k>3 → {y1,y2,yk}

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%205.jpeg)

---

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%206.jpeg)

Balanceo de clases

K^(0) se lee K de la etiqueta 0

K^(1) se lee k de la etiqueta 1

K^(0)=K^(1) 

## Como se ajustan los modelos ?

me da una etiqueta predicha y la compara con la etiqueta verdadera

si ambas son diferentes se debe volver a entrenar el modelo (épocas → cuantas épocas se definen para entrenar el modelo) 

en el caso del error se deben ajustar los pesos 

Las variables deben ser independientes no deben ser variables correlacionales x1,x2,x3 (atributos) y deben ser idénticamente distribuidas 

Se utilizan cuando son problemas estocásticos (probabilístico) es decir no son determinísticos

**Regresión:**

La etiqueta es una variable numérica

 

-Aprendizaje no supervisado

-Aprendizaje por refuerzo

# Dicotomías

(Aprendizaje supervisado)

Es la feacibilidad de una hipótesis que pueda clasificar de manera adecuada los diferentes puntos

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%207.jpeg)

la probabilidad conjunta de (X, y)

P(X,Y)=P(Y|X)* P(X) → Función desconocida=g(X→Y)

debe retornar la clasificación que se haga de forma correcta a los datos

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%208.jpeg)

 hi=m(pendiente)x+b(intercepto - beta) 

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%209.jpeg)

si tengo menos caracteristicas debería tener mas observaciones debido a la probabilidad conjunta puedo hacerlo 

Deber etiquetar el dataset, no sesgar la etiquetación etiqueta predicha diferente a la verdadera sirve para entrenar al algoritmo.

## Error de entrenamiento

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2010.jpeg)

# Testeo

Mínimo de observaciones para realizar un testeo

no se puede generalizar en el caso de tener un conjunto poblacional determinado por una solo muestra.

Mientras mas veces se sacan muestras mas parecidas serian a la población 

## Calcular el mínimo de datos para test

Se utiliza la Desigualdad de hoeffding’s 

La población es definida con u

La muestra es definida con v

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2011.jpeg)

1 sigma 68%

El intervalo de confianza es de 2 sigma es decir  95% de confianza

3 sigma 99.7%

cuando se trabaja con machine Learning se debe trabaja con una distribución normal de esta manera se debe realizar un muestreo estratificado aleatorio simple en donde por lo general se encuentra una distirbucion normal o una gaussiana.

## Dicotomias:

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2012.jpeg)

## Clasificadores

Saber cual es el numero máximo de clasificadores que podemos tener para un cierto numero de datos dados.

**Requerimientos:**

Dataset (Balanceado → Se puede utilizar aumento de datos)

## La ley de los grandes números

Es un proceso estadístico

La media de una muestra cogida al azar debería ser una media que represente a la media poblacional.

**EDA(Análisis exploratorio de datos)**

Debe cargarse el dataset

Debe definir una correlación de variables(Alta o Baja )

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2013.jpeg)

Variables aleatorias **discretas** o **continuas**

Variable discreta

Variable continua puede tomar valores intermedios entre uno y otro.

**Necesitamos variables sin correlación**

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2014.jpeg)

Identificar la correlación que existe entre las variables que se tenga

Distribución de la variable aleatoria puede ser gaussiana, uniforme, exponencial, binomial , sesgada a la izquierda o derecha.

Como funciona con variables categóricas, deben convertirse a números , en el caso de que no se quiera tener números se debe a mandar a contar el numero de veces que se repite.

## Como se transforma de variables categóricas a numéricas

Ejemplo estado civil:

Soltero → 1

Casado → 2

Viudo → 3

Divorciado → 4

Unión Libre →5

identificar mediante la frecuencia de las veces que una variable se repite:

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2015.jpeg)

Mostrar la correlación y la distribución de las variables

## Probabilidad a priori

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2016.jpeg)

## Clasificador de bayes

debemos conocer una población a priory

## Regla de clasificación para un clasificador de Bayes Binario

Probabilidad conjunta 

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2017.jpeg)

# Clasificador Bayesiano en excel

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled.png)

## Preguntas examen:

Aplicando la ley de los grandes números cual seria la probabilidad promedio de alcanzar una distribución igualitaria

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%201.png)

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2018.jpeg)

# Redes Neuronales Artificiales

Es un algoritmo parametrico

Se deben ajustar los parametros (ajustar los pesos).

**ventajas:**

Se pueden utilizar menos datos para entrenamiento

**desventaja:**

Puede verse detenida en una funcion silla en un minimo local o maximo local

### Perceptron es un clasificador binomial

**Dendrite(Dendritas)** = Censan los estímulos si me pellizco envían un estimulo al cerebro.

**El estimulo en una neurona son:** Vectores de caracteristicas en una red artificial

**Núcleo de la neurona:** Se genera algún proceso químico y se activa la neurona.

en la red neuronal se genera un proceso matemático va a tener la sumatoria ponderada de las entradas por los pesos

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2019.jpeg)

**Bias**: es el termino independiente que se traduce al intercepto.

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2020.jpeg)

Debe evaluarce la funcion de activacion que seria Hardlims

**valores menores a 0** = 0

**valores mayores a 1**= 1

**cuando la etiqueta es 1** = W0+EXiWj ≥ 0

**cuando la etiqueta es 0** = otros casos

## Para que sirve un perceptrón?

Damos una gran cantidad de imágenes o bloque de datos al clasificador(perceptrón ) estos datos deben ser etiquetados,

Una vez entrenado el perceptrón se testea el clasificador pasando un nuevo dato y que lo identifique.

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2021.jpeg)

## Como se ajustan los pesos:

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2022.jpeg)

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2023.jpeg)

1. Todos los pesos inicialmente van a valer 0 en los perceptrones
2. Repito el proceso hasta que  converjan los pesos (es decir cuando ya no cambien , la recta se quede estable)
3. si se tiene un error en la multiplicación de los pesos por las x sea menor o igual a 0
4. actualizo los pesos todos los pesos con la sumatoria de  

 ejemplo camino que se va formando por varios ejercicios de un tema dependiendo de la cantidad de ejercicios que se hagan se va a fortificar.

80000 y 10000 neuronas en nuestro cerebro

3billones de conexiones

Fortificación de una conexión neuronal  

**Conocimiento tiene 3 etapas:**

Absorber el Conocimiento

Consolidar el conocimiento en el cerebro(cuando se descansa o duerme)

Cuando se tiene la capacidad de recordad lo que se aprendió(Evocar ese conocimiento)

# Funcionamiento de un perceptrón:

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2024.jpeg)

**Testeo de un perceptron:**

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2025.jpeg)

# Regresión logística y Regresión lineal

Se aplica para datasets numericos que las etiquetas tengan valores continuos ejemplo : casa con valor 74k , casa con valor:75k

En una regresión linea lo que se predice es un valor continuo.

Logistica → Clasificacion

Lineal → Predicción en función de labels numéricos (reales o continuos)→permite hacer prediccion con regresión lineal= cada una de las observaciones tiene una etiqueta y esa etiqueta es un valor continuo

Caracteristicas

nummetros construc

num bañor

Se tiene una función 

Los pesos se actualizan mediante la actualización de unos costos en función al gradiente 

El segundo grafico es un overfiting: un sobre ajuste del modelo.

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2026.jpeg)

Caracteristicas son las columnas → N= #Obs

X1 son tuplas

Binarios[-1,+1]

el clasificador se ve alimentado por el vector de caracteristicas

**Entropía cruzada:** E[Pi LgP+(1-P)(1-LgP)]=1

Función de activacion: Hardlims(0,1)

## Regresión Logistica

Es un clasificador binario (-1 +1)

Siempre va a identificar a una clase , la diferencia con un perceptron es a la hora de la actualizacion de los pesos , necesitamos que sea esa funcion derivable, puede ser una logsig,relu,tgh

**Función sigmoidea** =1/1+e^-X}

Si se manda -1 y +1 se debe utilizar la tangente hiperbolica

si se manda 1 y 0 , se debe utilizar una logsi

### Pesos iniciales

Los pesos son valores aleatorios que cumplan una distribución normal  

## Regla de la cadena

Utilizando la regla de la cadena 

### Actualización de pesos:

Función de costo → descenso del gradiente 

## Deber

Hacer un perceptron y entrenarlo 

cuantas epocas van a entre

---

## Clasificadores Multiclase

## Regresion Lineal

**Regresión Lineal:** Es necesario que se tenga una correlación, se tiene varias etiquetas en función a la cantidad de datos que se tengan.

Funcion de costo : Los pesos se ajustan mediante el **error cuadrático medio** Ec.M

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2027.jpeg)

---

## Regresion Logistica

En contraposición a una **regresión Logística** cuando se hace un EDA se identifica que las variables independientes e idénticamente distribuidas.

Puede contar con una de las 2 etiquetas que se definieron.

Y=mx+b

Ypredicha=B0+B1x1+B2x2+BnXn

**Requisitos:**

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2028.jpeg)

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2029.jpeg)

En la regresión logística la función de activación necesita derivar la función de activación porque los pesos se multiplican hacia delante.

Los pesos se ajustan en función a la derivada de la entropía cruzada sobre la derivada de b

---

**Entropia: -1/n * E Pi Lg base 2 * Pi**

**Definicion de una funcion sigmoidea** 

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2030.jpeg)

Para optimizar una función de costo:

Se debe realizar los procesos de realizar los ajustes de los pesos .

Función de costo: Se utiliza la entropía.

**Formula de la entropía cruzada:**

castigo menores a 0.5

premio mayores a 0.5

Además se necesita para ajustar los pesos el calculo del descenso del gradiente

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2031.jpeg)

1. Compruebo que las variables sean independientes cuando la correlación tienda a 0.
2. Es un clasificador binomial.

Perceptrón → Regreción Logistica (Son clasificadores Lineales o Binarios)

Un clasificador multiclase es conocido como SoftMax

---

## Clasificador multiclase SOFTMAX

Ya no se tiene una sola salida ahora se tienen varias salidas

Se utiliza regresiones logisticas en softmax

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2032.jpeg)

Se tiene una matriz de pesos tomando cada vector de pesos de las regresiones logísticas.

La funcion de activacion para que nos devuelva se utiliza una softmax: mediante el uso de la formula.

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2033.jpeg)

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%202.png)

Y al tener el dataset de 26 x 13 se multiplica el vector de pesos transpuesto 13 x 3

Pesos finales que se deben ajustar :

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%203.png)

**Funcion para actualizar los pesos:**

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2034.jpeg)

---

## Redes Neuronales Artificial

### Como diferenciar un perceptrón de una regresión logística

PERCEPTRON SE DIFERENCIA CON LA FORMA DE ENTRENAMIENTO DE LOS PESOS

Cuando la dispercion es circular puede entenederse que la distribucion tiene a ser normal:

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%204.png)

Funcion de activacion en un perceptron es una hardlims

que no es derivable

Deben actualizarse los pesos cuando la y verdadera es diferente de la y predicha

Calcular Y^= (B transpuesto * X)

## Actualización de los pesos en un perceptron

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2035.jpeg)

---

### Regresion logisitca

cambia la funcion de activacion

se tiene funcion sigmidea , relu ,elu que sea derivable porque los pesos se actualizan en cuanto a la funcion de pesos.

Para optimizar se utiliza el gradiente **(derivadas parciales de sus variables)** como funcion de optimizacion 

Funcion de costo = derivada de la entropia cruzada

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2036.jpeg)

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2037.jpeg)

Robustez del modelo con muestra aleatoria simple 

datos de etrenamiento, validación y testeo

guardar los datos de testeo

trabajacr con los datos de entrenamiento y validación

entrenar la red neuronal

diseñar un sitio web 

se de o se cargue la misma cantidad de datos entrenados sin la etiqueta y un boton resultado

y arroje la etiqueta

---

## Calcular cantidad de entrenamiento del dataset

Se debe despejar n de la desigualdad universal de hoffding

## Calcular la cantidad de testeo en un dataset

---

### Modelo

Esta formado por modulos:

Adquisición de datos →Pre procesamiento→Extraccion de caracteristicas→Clasificacion → PostProcesamiento

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2038.jpeg)

## Red neuronal artificial

Se tiene la funcion de activacion → Sig 

Tiene una capa oculta (hiding Layer) de entrada y una de salida deben tener la misma funcion de activacion de la capa oculta.

Es igual a tener como tener una multiple regresion logistica 

La capa de salida siempre va a tener una softmax

la capa de entrada siempre va a tener una multiples regresiones logisticas

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2039.jpeg)

si se tiene un red neuronal para una clase binomial se tiene una funcion de activacion que seria una sigmoidea.

![Untitled](Inteligencia%20de%20Negocios%20Segundo%20Parcial%2044685e54bb9b415e930d97248f298538/Untitled%2040.jpeg)

para no caer en un overfiting se debe tener una gran cantidad de datos para entrenar el modelo:

## Lo minimo para entrenar el modelo

4caracteristicas +1 bias =5 x 2 =10

2 + 1 = 3 * 3 = 9

90 x 10 =900
