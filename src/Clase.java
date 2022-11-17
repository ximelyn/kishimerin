/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 21PROGA310
 */
public class Clase {
    private String Autor,NLibro,Editorial,Luga;
    private int A,NPag,NEdicion;

    public Clase() {
        this.Autor = null;
        this.NLibro = null;
        this.Editorial = null;
        this.Luga = null;
        this.A = 0;
        this.NPag = 0;
        this.NEdicion = 0;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String A) {
        this.Autor = A;
    }

    public String getNLibro() {
        return NLibro;
    }

    public void setNLibro(String NL) {
        this.NLibro = NL;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String E) {
        this.Editorial = E;
    }

    public String getLuga() {
        return Luga;
    }

    public void setLuga(String L) {
        this.Luga = L;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getNPag() {
        return NPag;
    }

    public void setNPag(int NP) {
        this.NPag = NP;
    }

    public int getNEdicion() {
        return NEdicion;
    }

    public void setNEdicion(int NE) {
        this.NEdicion = NE;
    }
    
    
}
