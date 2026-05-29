# 🚀 Examen - Unidad 5: Sistema Inteligente de Riego por Sectores 🍓💧

**Objetivo:** 🎯 Resolver un problema de negocio complejo aplicando el principio de modularidad. El estudiante deberá determinar por sí mismo cuántas subrutinas son necesarias, qué parámetros deben recibir (paso por valor o por referencia) y qué valores deben retornar para lograr una solución limpia y eficiente.

**Contexto:** 🚜 Agricultura de precisión y gestión hídrica en Zapotlán el Grande (Ciudad Guzmán).

---

## 📖 Contexto del Problema 🌊

En las plantaciones tecnificadas de arándanos y frambuesas de **Ciudad Guzmán**, el riego por goteo se gestiona de manera automatizada. El agua se distribuye a través de múltiples **Sectores de Riego** dentro de diferentes **Invernaderos**. Para evitar el desperdicio de agua y la asfixia radicular de las plantas, se requiere un sistema que evalúe las lecturas de humedad de suelo capturadas por sensores.

Tu tarea es desarrollar el **Módulo de Simulación y Análisis Hídrico**. Para garantizar que el software sea mantenible, escalable y profesional, el código debe estar estrictamente modularizado.

---

## 📥 Especificaciones de Datos y Reglas de Negocio ⚙️

El sistema procesará la información utilizando una matriz numérica de humedad de `int[3][4]`:
* **Filas (3):** Representan los Invernaderos (Invernadero A, Invernadero B, Invernadero C).
* **Columnas (4):** Representan los Sectores de Monitoreo (Sector 1, Sector 2, Sector 3, Sector 4).

### 📋 Requerimientos del Sistema:

1.  📊 **Análisis por Invernadero:** El sistema debe calcular el promedio de humedad de cada invernadero de forma independiente.
2.  🌡️ **Diagnóstico de Humedad:** Basado en el promedio obtenido para cada invernadero, se debe emitir un diagnóstico operativo:
    * Promedios por debajo del **35%** requieren riego de emergencia.
    * Promedios entre el **35% y 75%** (inclusive) se consideran estables y óptimos.
    * Promedios superiores al **75%** indican exceso de agua y requieren activar el drenaje.
3.  ⚠️ **Auditoría de Sequía:** El sistema debe analizar la totalidad de los sectores de la instalación para contar cuántos de ellos (de manera individual en toda la matriz) registran una humedad críticamente baja (por debajo del **30%**).
4.  🖥️ **Reporte Final:** Se debe imprimir en pantalla el desglose por invernadero (promedio y diagnóstico) junto con la métrica de sequía global.

---

## ⚠️ Restricciones de Arquitectura y Diseño (Evaluación) 🚧

Para que el proyecto sea aprobado, el diseño de la solución debe cumplir estrictamente con las siguientes reglas:

1.  📁 **Código en un Solo Archivo:** Todo el programa debe residir en un único archivo llamado `SistemaRiego.java`.
2.  🧩 **Modularidad Obligatoria:** Queda estrictamente prohibido programar la lógica de cálculo de promedios, la clasificación de diagnósticos o el conteo de sectores críticos dentro del método principal `main`.
3.  🏗️ **Diseño de Subrutinas:** Debes identificar, diseñar y declarar **al menos tres métodos auxiliares** que resuelvan las tareas del sistema. 
    * *Nota para el estudiante:* Tú debes determinar los nombres de los métodos, qué modificadores usar, qué parámetros necesitan recibir (¿una variable simple, un vector, una matriz?) y qué tipo de valor deben retornar al invocador para mantener el flujo del sistema.
4.  🧹 **Rol del `main`:** El método `main` debe ser sumamente limpio. Únicamente debe declarar los datos iniciales de la matriz de sensores, invocar coordinadamente a tus subrutinas para procesar la información y dar salida al reporte final en consola.

---

## 📤 Ejemplo de Salida Esperada en Consola ✨

Utilizando los siguientes datos de prueba iniciales en tu matriz:
* Invernadero A: `[40, 25, 35, 30]%`
* Invernadero B: `[80, 85, 78, 90]%`
* Invernadero C: `[50, 60, 55, 48]%`

La consola de salida debe lucir exactamente así:

```text
=====================================================
 🚜 MONITOREO HÍDRICO BERRYWATER - CD. GUZMÁN 🍓💧
=====================================================

📡 Analizando lecturas de humedad por sector...
-----------------------------------------------------
🏠 Invernadero A (Sectores: [40, 25, 35, 30]%)
   + Promedio Humedad: 32.50%
   + Diagnóstico: [🚨 ALERTA: Riego Crítico Necesario]

🏠 Invernadero B (Sectores: [80, 85, 78, 90]%)
   + Promedio Humedad: 83.25%
   + Diagnóstico: [⚠️ ADVERTENCIA: Exceso de Agua / Activar Drenaje]

🏠 Invernadero C (Sectores: [50, 60, 55, 48]%)
   + Promedio Humedad: 53.25%
   + Diagnóstico: [✅ ESTABLE: Humedad Óptima]

-----------------------------------------------------
📊 REPORTE DE INCIDENCIAS GLOBAL:
-----------------------------------------------------
⚠️ Alerta de Sequía: Se detectaron 2 sectores en estado crítico (Humedad < 30%).
=====================================================
Monitoreo de riego finalizado. Válvulas automatizadas calibradas.
```
