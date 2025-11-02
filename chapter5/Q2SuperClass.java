package chapter5;

class Q2SuperClass {

    private String parivate_val;
    public String public_val;

    public Q2SuperClass(String parivate_val,String public_val){
        this.parivate_val = parivate_val;
        this.public_val = public_val;
    }

    private void func(){
        System.out.println("privatr method");
    }
}
