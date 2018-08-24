

public class Dog {
String favoriteObject;
int age;
Dog(String favoriteObject, int age){
	this.favoriteObject = favoriteObject;
	this.age = age;
}
void speak() {
	System.out.println("Bark!");
}
void fetch() {
	System.out.println("Pant pant");
}
public static void main(String[] args) {
	Dog allie = new Dog("Paper towel", 1);
	allie.speak();
}
}
