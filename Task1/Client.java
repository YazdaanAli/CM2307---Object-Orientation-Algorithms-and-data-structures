public class Client {
  public static void main(String[] args) {
    Pet p=new Chinchilla(); // for explanation please check the pdf
    p.setName("Grumpy");
    System.out.println("The " + p.classOfAnimal() + "'s name is " + p.getName());

    p = new ZebraFinch();
    p.setName("Happy");
    System.out.println("The " + p.classOfAnimal() + "'s name is " + p.getName());
  }
}
