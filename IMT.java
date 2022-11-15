public class IMT {
    double beratBadan, tinggiBadan;
    
    IMT(double bBadan, double tBadan)
    {
        this.beratBadan = bBadan;
        this.tinggiBadan = tBadan;
    }
    
    double hitung()
    {
        return this.beratBadan / Math.pow(this.tinggiBadan/100, 2);
    }
    
    void nilai()
    {
        if (hitung() >= 40)
        {
            System.out.println("Kriteria: Sangat Gemuk");
        }
        
        else if (hitung() <= 39.9 && hitung() >=30)
        {
            System.out.println("Kriteria: Gemuk");
        }
        
        else if (hitung() <=29.9 && hitung() >=25)
        {
            System.out.println("Kriteria: Berat Badan Lebih");
        }
        
        else if (hitung() <=24.9 && hitung() >= 18.5)
        {
            System.out.println("Kriteria: Berat Badan Ideal");
        }
        
        else
        {
            System.out.println("Kriteria: Berat Badan Kurang");
        }
    }
}
