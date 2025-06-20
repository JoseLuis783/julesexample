# Plan de Pruebas Funcionales: Calculadora Simple

## 1. Introducción

### 1.1. Propósito
Este documento define el plan de pruebas funcionales para la aplicación Calculadora Simple. Describe los casos de prueba diseñados para verificar que las características y comportamientos de la aplicación se ajustan a las especificaciones funcionales definidas.

### 1.2. Alcance
Este plan de pruebas cubre las pruebas funcionales de la aplicación Calculadora Simple. Esto incluye:
-   Verificación de los elementos de la Interfaz Gráfica de Usuario (GUI).
-   Pruebas de la funcionalidad aritmética central (actualmente la suma).
-   Validación de las reglas de comportamiento de la interfaz de usuario, incluyendo la editabilidad de campos y la gestión del foco.
-   Comprobación de los mecanismos de manejo de errores.

Este plan no cubre:
-   Pruebas no funcionales como rendimiento, usabilidad (más allá de los comportamientos especificados), seguridad o pruebas de compatibilidad en una extensa matriz de SO/hardware más allá de la compatibilidad general de Java Swing.
-   Pruebas unitarias o pruebas de integración a nivel de código (que son actividades separadas).

### 1.3. Referencias
-   `functional_specifications.md`: Contiene las especificaciones funcionales detalladas para la calculadora.

## 2. Enfoque de Pruebas
Las pruebas se realizarán manualmente ejecutando los casos de prueba definidos. Cada caso de prueba implica interactuar con la GUI de la calculadora y observar las respuestas de la aplicación para asegurar que coinciden con los resultados esperados. Los resultados de las pruebas (Pasa/Falla) y cualquier observación se registrarán para cada caso de prueba.

## 3. Entorno de Pruebas

### 3.1. Software
-   **Aplicación Bajo Prueba**: Calculadora Simple (aplicación Java Swing).
-   **Entorno de Ejecución Java (JRE)**: Versión compatible con Java 8 o posterior (ya que el proyecto ha sido configurado para Java 1.8 y más recientemente, con objetivo "24", lo que implica que se necesita un JRE moderno para ejecutar si se compila con objetivo 24, pero el código en sí es compatible con 1.8).
-   **Sistema Operativo (Recomendado)**: Windows 10/11, macOS (últimas 3 versiones), Linux (distribuciones comunes como Ubuntu). (Se espera compatibilidad estándar de Java Swing).

### 3.2. Hardware
-   Un ordenador de escritorio o portátil estándar capaz de ejecutar aplicaciones Java Swing con pantalla gráfica, teclado y ratón.

## 4. Casos de Prueba

Cada caso de prueba incluye:
-   **ID del Caso de Prueba**: Identificador único (ej., TC_GUI_001).
-   **Funcionalidad Probada**: Referencia a `functional_specifications.md`.
-   **Descripción**: Propósito de la prueba.
-   **Precondiciones**: Cualquier configuración requerida.
-   **Pasos a Ejecutar**: Acciones a realizar.
-   **Resultado Esperado**: El resultado anticipado si la aplicación se comporta correctamente.
-   **Resultado Real**: (A rellenar durante las pruebas)
-   **Estado**: (A rellenar durante las pruebas: No Ejecutado, Pasado, Fallado)

---

### 4.1. Pruebas de Verificación de GUI

**ID del Caso de Prueba**: TC_GUI_001
**Funcionalidad Probada**: GUI - Título de la Ventana Principal (Spec 2.1)
**Descripción**: Verificar que el título de la ventana principal de la aplicación es correcto.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Iniciar la aplicación de la calculadora.
    2. Observar la barra de título de la ventana de la aplicación.
**Resultado Esperado**: El título de la ventana debe ser "Calculator".
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_GUI_002
**Funcionalidad Probada**: GUI - Etiquetas del Área de Entrada (Spec 2.2)
**Descripción**: Verificar que las etiquetas para los campos de entrada de números y visualización de resultados son correctas.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Observar las etiquetas junto a los campos de entrada y el campo de resultado.
**Resultado Esperado**:
    - Etiqueta para la entrada del primer número: "Numero real 1:"
    - Etiqueta para la entrada del segundo número: "Numero real 2:"
    - Etiqueta para la visualización del resultado: "Resultado:"
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_GUI_003
**Funcionalidad Probada**: GUI - Campo de Resultado No Editable (Spec 2.2)
**Descripción**: Verificar que el campo de visualización de resultados no es editable directamente por el usuario.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Intentar hacer clic en el campo "Resultado:".
    2. Intentar escribir caracteres en el campo "Resultado:".
**Resultado Esperado**: El campo "Resultado:" no debe aceptar el foco para escribir, y no deben aparecer caracteres si se escriben. Debe ser no editable.
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_GUI_004
**Funcionalidad Probada**: GUI - Botones Numéricos (Spec 2.3)
**Descripción**: Verificar que todos los botones numéricos (0-9) están presentes.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Observar el panel de botones.
**Resultado Esperado**: Deben estar visibles los botones etiquetados "0", "1", "2", "3", "4", "5", "6", "7", "8", "9".
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_GUI_005
**Funcionalidad Probada**: GUI - Botones de Operación (Spec 2.4)
**Descripción**: Verificar que todos los botones de operación (+, =, C) están presentes.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Observar el panel de botones.
**Resultado Esperado**: Deben estar visibles los botones etiquetados "+", "=", y "C".
**Resultado Real**:
**Estado**:

---

### 4.2. Pruebas de Entrada de Números

**ID del Caso de Prueba**: TC_NI_001
**Funcionalidad Probada**: Entrada de Números (Spec 3.1), Estado Inicial (Spec 4.1)
**Descripción**: Verificar que los clics en los botones numéricos se añaden a `numField1` cuando está activo.
**Precondiciones**: La aplicación está iniciada. `numField1` está activo y editable.
**Pasos a Ejecutar**:
    1. Pulsar el botón "1".
    2. Pulsar el botón "2".
    3. Pulsar el botón "3".
**Resultado Esperado**: `numField1` debe mostrar "123".
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_NI_002
**Funcionalidad Probada**: Entrada de Números (Spec 3.1), Interacción del Botón '+' (Spec 4.2)
**Descripción**: Verificar que los clics en los botones numéricos se añaden a `numField2` después de procesar `numField1` y '+'.
**Precondiciones**:
    1. La aplicación está iniciada.
    2. Se ha introducido "111" en `numField1`.
    3. Se ha pulsado el botón "+". `numField2` está ahora activo y editable.
**Pasos a Ejecutar**:
    1. Pulsar el botón "4".
    2. Pulsar el botón "5".
    3. Pulsar el botón "6".
**Resultado Esperado**: `numField2` debe mostrar "456". `numField1` debe seguir mostrando "111".
**Resultado Real**:
**Estado**:

---

### 4.3. Pruebas de Operación de Suma

**ID del Caso de Prueba**: TC_ADD_001
**Funcionalidad Probada**: Operación de Suma (Spec 3.2), Comportamiento UI (Spec 4.2, 4.3)
**Descripción**: Verificar la suma básica de dos enteros positivos.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Introducir "5" en `numField1` (ej., pulsar botón "5").
    2. Pulsar el botón "+".
    3. Introducir "3" en `numField2` (ej., pulsar botón "3").
    4. Pulsar el botón "=".
**Resultado Esperado**:
    - `resultField` debe mostrar "8.0" (o "8").
    - `numField1` debe mostrar "8.0" (o "8").
    - `numField2` debe estar vacío y no editable.
    - El foco debe estar en `numField1`.
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_ADD_002
**Funcionalidad Probada**: Operación de Suma (Spec 3.2), Comportamiento UI (Spec 4.2, 4.3)
**Descripción**: Verificar la suma con un número negativo.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Introducir "10" en `numField1`.
    2. Pulsar el botón "+".
    3. Introducir "-3" en `numField2` (requiere escritura directa para '-').
    4. Pulsar el botón "=".
**Resultado Esperado**:
    - `resultField` debe mostrar "7.0" (o "7").
    - `numField1` debe mostrar "7.0" (o "7").
    - `numField2` debe estar vacío y no editable.
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_ADD_003
**Funcionalidad Probada**: Operación de Suma (Spec 3.2), Comportamiento UI (Spec 4.2, 4.3)
**Descripción**: Verificar la suma con números decimales.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Introducir "2.5" en `numField1` (requiere escritura directa para '.').
    2. Pulsar el botón "+".
    3. Introducir "3.7" en `numField2`.
    4. Pulsar el botón "=".
**Resultado Esperado**:
    - `resultField` debe mostrar "6.2".
    - `numField1` debe mostrar "6.2".
    - `numField2` debe estar vacío y no editable.
**Resultado Real**:
**Estado**:

---

### 4.4. Pruebas del Botón Igual (=)
(Las pruebas específicas de propagación de resultados y cambio de estado están cubiertas por TC_ADD_001, TC_ADD_002, TC_ADD_003 y TC_UI_004. No hay pruebas separadas únicamente para "=" más allá de estas interacciones.)

---

### 4.5. Pruebas del Botón Limpiar (C)

**ID del Caso de Prueba**: TC_CLR_001
**Funcionalidad Probada**: Operación de Limpiar (Spec 3.4), Comportamiento UI (Spec 4.4)
**Descripción**: Verificar que el botón 'C' limpia todos los campos y restablece el estado después de introducir números.
**Precondiciones**:
    1. La aplicación está iniciada.
    2. Se ha introducido "123" en `numField1`.
    3. Se ha pulsado el botón "+".
    4. Se ha introducido "456" en `numField2`.
**Pasos a Ejecutar**:
    1. Pulsar el botón "C".
**Resultado Esperado**:
    - `numField1` debe estar vacío y editable.
    - `numField2` debe estar vacío y no editable.
    - `resultField` debe estar vacío.
    - El foco debe estar en `numField1`.
    - El estado interno de la operación debe restablecerse (verificado intentando una nueva operación).
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_CLR_002
**Funcionalidad Probada**: Operación de Limpiar (Spec 3.4), Comportamiento UI (Spec 4.4)
**Descripción**: Verificar que el botón 'C' limpia los campos y restablece el estado después de un cálculo.
**Precondiciones**:
    1. La aplicación está iniciada.
    2. Se ha introducido "7" en `numField1`.
    3. Se ha pulsado el botón "+".
    4. Se ha introducido "2" en `numField2`.
    5. Se ha pulsado el botón "=". (`resultField` muestra "9.0", `numField1` muestra "9.0").
**Pasos a Ejecutar**:
    1. Pulsar el botón "C".
**Resultado Esperado**:
    - `numField1` debe estar vacío y editable.
    - `numField2` debe estar vacío y no editable.
    - `resultField` debe estar vacío.
    - El foco debe estar en `numField1`.
**Resultado Real**:
**Estado**:

---

### 4.6. Pruebas de Comportamiento de UI y Reglas

**ID del Caso de Prueba**: TC_UI_001
**Funcionalidad Probada**: Estado Inicial (Spec 4.1)
**Descripción**: Verificar el estado inicial de los campos de entrada y el foco.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Observar `numField1`.
    2. Observar `numField2`.
    3. Observar qué campo tiene el foco (ej., escribiendo sin hacer clic).
**Resultado Esperado**:
    - `numField1` es editable.
    - `numField2` es no editable.
    - El foco del teclado está en `numField1`.
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_UI_002
**Funcionalidad Probada**: Interacción del Botón '+' - `numField1` Válido (Spec 4.2)
**Descripción**: Verificar que `numField2` se vuelve editable después de `numField1` válido y '+'.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Introducir "10" en `numField1`.
    2. Pulsar el botón "+".
    3. Observar `numField2`.
    4. Comprobar si `numField2` tiene el foco.
**Resultado Esperado**:
    - `numField2` es ahora editable.
    - `numField2` está vacío.
    - El foco está en `numField2`.
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_UI_003
**Funcionalidad Probada**: Interacción del Botón '+' - Inicio de Operación Encadenada (Spec 4.3 implica esto)
**Descripción**: Verificar que pulsar '+' después de una operación "=" usa correctamente el valor de `numField1` (el resultado anterior).
**Precondiciones**:
    1. La aplicación está iniciada.
    2. "5" en `numField1`, "+", "3" en `numField2`, se pulsa "=". (`numField1` ahora muestra "8.0").
**Pasos a Ejecutar**:
    1. Pulsar el botón "+".
**Resultado Esperado**:
    - El valor "8.0" de `numField1` debe tomarse como el primer operando para una nueva suma.
    - `numField2` debe volverse editable y limpiarse.
    - El foco debe estar en `numField2`.
    - `resultField` debe permanecer sin cambios (mostrando "8.0" o limpiarse según el detalle exacto de implementación de '+' para el campo de resultado).
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_UI_004
**Funcionalidad Probada**: Interacción del Botón '=' - Estado después del cálculo (Spec 4.3)
**Descripción**: Verificar los estados de los campos y el foco después de pulsar "=".
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Introducir "12" en `numField1`.
    2. Pulsar "+".
    3. Introducir "3" en `numField2`.
    4. Pulsar "=".
**Resultado Esperado**:
    - `resultField` muestra "15.0".
    - `numField1` muestra "15.0".
    - `numField2` está vacío y no editable.
    - El foco está en `numField1`.
**Resultado Real**:
**Estado**:

---

### 4.7. Pruebas de Manejo de Errores

**ID del Caso de Prueba**: TC_ERR_001
**Funcionalidad Probada**: Manejo de Errores - `numField1` vacío al pulsar '+' (Spec 4.2, Spec 5)
**Descripción**: Verificar mensaje de error y estado si se pulsa '+' con `numField1` vacío.
**Precondiciones**: La aplicación está iniciada. `numField1` está vacío.
**Pasos a Ejecutar**:
    1. Pulsar el botón "+".
**Resultado Esperado**:
    - `resultField` debe mostrar "Numero real 1 no puede estar vacio".
    - `numField2` debe permanecer no editable.
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_ERR_002
**Funcionalidad Probada**: Manejo de Errores - `numField1` inválido al pulsar '+' (Spec 4.2, Spec 5)
**Descripción**: Verificar mensaje de error y estado si se pulsa '+' con texto inválido en `numField1`.
**Precondiciones**: La aplicación está iniciada.
**Pasos a Ejecutar**:
    1. Escribir "abc" en `numField1`.
    2. Pulsar el botón "+".
**Resultado Esperado**:
    - `resultField` debe mostrar "Error: Numero real 1 invalido".
    - `numField2` debe permanecer no editable.
**Resultado Real**:
**Estado**:

**ID del Caso de Prueba**: TC_ERR_003
**Funcionalidad Probada**: Manejo de Errores - `numField2` inválido al pulsar '=' (Spec 5)
**Descripción**: Verificar mensaje de error si se pulsa '=' con texto inválido en `numField2`.
**Precondiciones**:
    1. La aplicación está iniciada.
    2. Se ha introducido "10" en `numField1`.
    3. Se ha pulsado el botón "+".
    4. Se ha escrito "xyz" en `numField2`.
**Pasos a Ejecutar**:
    1. Pulsar el botón "=".
**Resultado Esperado**:
    - `resultField` debe mostrar "Error: Numero real 2 invalido" (o similar, ej. "Error in Number 2").
    - `numField2` debe volverse no editable.
**Resultado Real**:
**Estado**:

## 5. Ejecución de Pruebas e Informes
Los resultados de las pruebas se registrarán rellenando los campos "Resultado Real" y "Estado" para cada caso de prueba directamente en una copia de este documento o en una herramienta de gestión de pruebas compatible. Cualquier desviación de los resultados esperados debe documentarse detalladamente.
```
