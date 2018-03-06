
/**
 * Write a description of class Complex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Complex
{
    // instance variables - replace the example below with your own
    private int real;
    private int img;

    /**
     * Constructor for objects of class Complex
     */
    public Complex(int real, int img)
    {
        this.real = real;
        this.img = img;
    }

    /**
     * Returns real part
     * @return (int) real part
     */
    public int getReal(){
        return this.real;
    }
    
    /**
     * Returns img part
     * @return (int) img part
     */
    public int getImg(){
        return this.img;
    }
    
    /**
     * Returns complex object to string
     * @return (String) complex object to string
     */
    public String toString(){
        return ""+this.real+" + "+this.img+"i";
    }
    
    /**
     * Add to another complex
     * @param complex (complex) another complex
     * @return (complex) a new complex
     */
    public Complex addTo(Complex complex){
        return new Complex(this.real+complex.getReal(), this.img+complex.getImg());
    }
    
    /**
     * Subs to another complex
     * @param complex (complex) another complex
     * @return (complex) a new complex
     */
    public Complex subTo(Complex complex){
        return new Complex(this.real-complex.getReal(), this.img-complex.getImg());
    }
    
    /**
     * Returns module of complex object
     * @return (double) module of complex object 
     */
    public double getModule(){
        return java.lang.Math.sqrt((this.real*this.real)+(this.img*this.img));
    }
}
