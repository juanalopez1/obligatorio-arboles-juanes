/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juana
 */
public class TElementoABTest {

    public TElementoABTest() {
    }

    /**
     * Test del metodo findLargest (buscar la mayor clave), de la clase TElementoAB.
     */
    @Test
    public void testFindLargest() {
        TElementoAB<Integer> raiz = new TElementoAB<>(5, 5);
        TElementoAB<Integer> tres = new TElementoAB<>(3, 3);
        TElementoAB<Integer> diez = new TElementoAB<>(10, 10);
        TElementoAB<Integer> uno = new TElementoAB<>(1, 1);
        TElementoAB<Integer> catorce = new TElementoAB<>(14, 14);
        TElementoAB<Integer> seis = new TElementoAB<>(6, 6);
        raiz.setHijoDer(diez);
        raiz.setHijoIzq(tres);
        tres.setHijoIzq(uno);
        tres.setHijoDer(seis);
        diez.setHijoDer(catorce);
        TElementoAB expResult = catorce;
        TElementoAB result = raiz.findLargest();
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo findShortest (buscar la menor clave), de la clase
     * TElementoAB.
     */
    @Test
    public void testFindShortest() {
        TElementoAB<Integer> raiz = new TElementoAB<>(5, 5);
        TElementoAB<Integer> tres = new TElementoAB<>(3, 3);
        TElementoAB<Integer> diez = new TElementoAB<>(10, 10);
        TElementoAB<Integer> uno = new TElementoAB<>(1, 1);
        TElementoAB<Integer> catorce = new TElementoAB<>(14, 14);
        TElementoAB<Integer> seis = new TElementoAB<>(6, 6);
        raiz.setHijoDer(diez);
        raiz.setHijoIzq(tres);
        tres.setHijoIzq(uno);
        tres.setHijoDer(seis);
        diez.setHijoDer(catorce);
        ;
        TElementoAB expResult = uno;
        TElementoAB result = raiz.findShortest();
        assertEquals(expResult, result);
    }

    /**
     * Test of getParent method, of class TElementoAB.
     */
    @Test
    public void testGetParent() {
        System.out.println("getParent");
        TElementoAB<Integer> raiz = new TElementoAB<>(5, 5);
        TElementoAB<Integer> tres = new TElementoAB<>(3, 3);
        TElementoAB<Integer> diez = new TElementoAB<>(10, 10);
        TElementoAB<Integer> uno = new TElementoAB<>(1, 1);
        TElementoAB<Integer> catorce = new TElementoAB<>(14, 14);
        TElementoAB<Integer> seis = new TElementoAB<>(6, 6);
        raiz.setHijoDer(diez);
        raiz.setHijoIzq(tres);
        tres.setHijoIzq(uno);
        tres.setHijoDer(seis);
        diez.setHijoDer(catorce);
        TElementoAB expResult = diez;
        TElementoAB result = raiz.getParent(catorce);
        assertEquals(expResult, result);
    }

    @Test
    public void testNodesPerLevel() {
        System.out.println("nodesPerLevel");
        TArbolBB<Integer> arbol = new TArbolBB<>();
        TElementoAB<Integer> raiz = new TElementoAB<>(5, 5);
        TElementoAB<Integer> nueve = new TElementoAB<>(9, 9);
        TElementoAB<Integer> diez = new TElementoAB<>(10, 10);
        TElementoAB<Integer> uno = new TElementoAB<>(1, 1);
        TElementoAB<Integer> catorce = new TElementoAB<>(14, 14);
        TElementoAB<Integer> seis = new TElementoAB<>(6, 6);
        raiz.setHijoDer(diez);
        raiz.setHijoIzq(nueve);
        nueve.setHijoIzq(uno);
        nueve.setHijoDer(seis);
        diez.setHijoDer(catorce);
        int expResult = 3;
        int result = raiz.nodesPerLevel(2, 0);
        assertEquals(expResult, result);
    }

    /**
     * Test of isItBST method, of class TElementoAB.
     */
    @Test
    public void testItIsBST() {
        System.out.println("isItBST");
        TElementoAB<Integer> raiz = new TElementoAB<>(5, 5);
        TElementoAB<Integer> tres = new TElementoAB<>(3, 3);
        TElementoAB<Integer> diez = new TElementoAB<>(10, 10);
        TElementoAB<Integer> uno = new TElementoAB<>(1, 1);
        TElementoAB<Integer> catorce = new TElementoAB<>(14, 14);
        TElementoAB<Integer> seis = new TElementoAB<>(6, 6);
        raiz.setHijoDer(diez);
        raiz.setHijoIzq(tres);
        tres.setHijoIzq(uno);
        tres.setHijoDer(seis);
        diez.setHijoDer(catorce);
        boolean expResult = true;
        boolean result = raiz.isItBST();
        assertEquals(expResult, result);
    }

    @Test
    public void testItIsNotBST() {
        System.out.println("isItBST");
        TArbolBB<Integer> arbol = new TArbolBB<>();
        TElementoAB<Integer> raiz = new TElementoAB<>(5, 5);
        TElementoAB<Integer> nueve = new TElementoAB<>(9, 9);
        TElementoAB<Integer> diez = new TElementoAB<>(10, 10);
        TElementoAB<Integer> uno = new TElementoAB<>(1, 1);
        TElementoAB<Integer> catorce = new TElementoAB<>(14, 14);
        TElementoAB<Integer> seis = new TElementoAB<>(6, 6);
        raiz.setHijoDer(diez);
        raiz.setHijoIzq(nueve);
        nueve.setHijoIzq(uno);
        nueve.setHijoDer(seis);
        diez.setHijoDer(catorce);
        boolean expResult = false;
        boolean result = raiz.isItBST();
        assertEquals(expResult, result);
    }

}
