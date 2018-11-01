# 7 FactoryMethod 패턴

> 프로토타입 패턴(prototype pattern)은 소프트웨어 디자인 패턴 용어로, 생성할 객체들의 타입이 프로토타입인 인스턴스로부터 결정되도록 하며, 인스턴스는 새 객체를 만들기 위해 자신을 복제(clone)하게 된다.  
> 프로토타입 패턴은, 추상 팩토리 패턴과는 반대로, 클라이언트 응용 프로그램 코드 내에서 객체 창조자(creator)를 서브클래스(subclass)하는 것을 피할 수 있게 해준다.  
> 프로토타입 패턴은 새로운 객체는 일반적인 방법(예를 들어, new를 사용해서라든지)으로 객체를 생성(create)하는 고유의 비용이 주어진 응용 프로그램 상황에 있어서 불가피하게 매우 클 때, 이 비용을 감내하지 않을 수 있게 해준다.  
> 패턴을 구현하려면, 우선 clone() 메소드를 선언하는 추상 베이스 클래스를 하나 만든다. 다형적 생성자(polymorphic constructor) 기능이 필요한 클래스가 있다면, 그것을 앞에서 만든 클래스를 상속받게 한 후, clone() 메소드 내의 코드를 구현한다.  

* GUI에서 복사 붙여넣기 할때 많이 쓰일듯하다.
* 같은 객체를 복사해올때 쓰면 편할듯 .