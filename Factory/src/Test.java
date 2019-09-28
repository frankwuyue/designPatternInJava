import java.security.acl.Permission;

class Person
{
  public int id;
  public String name;

  public Person(int id, String name)
  {
    this.id = id;
    this.name = name;
  }
  
  public String toString() {
	  return "Person[" + id + "]:" + name;
  }
}

class PersonFactory
{
	private int i = 0;
	
	  public Person createPerson(String name)
	  {
	    return new Person(i++, name);
	  }
}

class Demo {
	public static void main(String[] args) {
		PersonFactory factory = new PersonFactory();
		Person fr = factory.createPerson("Frank");
		Person pp = factory.createPerson("PP");
		System.out.println(fr);
		System.out.println(pp);
	}
}