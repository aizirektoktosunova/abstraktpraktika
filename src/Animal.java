public abstract   class Animal {

 public void dog() {
     System.out.println("dog");
 }
   public void cat() {
       System.out.println("cat");
   }

    public Animal() {
    }

    @Override
    public String toString() {
        return "AbstraktAnimal{}";
    }
}
