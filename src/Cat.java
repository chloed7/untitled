public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge() {
        return age;
    }

    // add a getAge() getter below for
    // obtaining the Cat's age



    // MODIFY this method so that the Cat randomly
    // returns one of three different messages
    // (make any messages you want!) rather than always returning "meow".
    // Each message should have equal chance of being returned.
    public String speak() {
        double ran = ((Math.random() * 4) + 1);
        if (ran == 1) {
            return "meow!";
        } if (ran == 2) {
            return "purrrr";
        } if (ran == 3) {
            return "mouse!";
        } else {
            return "hisssss";
        }

    }

    public void introduce() {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}