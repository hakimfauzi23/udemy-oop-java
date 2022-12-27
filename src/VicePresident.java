class VicePresident extends Manager {
    /*
     * Because VicePresident is inherite Manager class
     * All of properties and method Manager class can be used
     * by VicePresident Object
     * 
     * If the Parent class has a constructor with param
     * Child class must access parent constructor with super keyword
     */

    VicePresident(String name) {
        super(name); // Access Parent Constructor
    }
  
    void sayHello(String name){
      System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }
  
  }
  