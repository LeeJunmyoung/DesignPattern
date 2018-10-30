# 3 Singleton 패턴

> 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다. 이와 같은 디자인 유형을 싱글턴 패턴이라고 한다. 주로 공통된 객체를 여러개 생성해서 사용하는 DBCP(DataBase Connection Pool)와 같은 상황에서 많이 사용된다.



> NonThreadSafe singleton구현
* thread를 이용해 동시에 객체를 생성하면 객체가 다르게 생성 될 수도 있다. 

> DCLThreadSafe singleton구현
* synchronized keyword 를 이용하여 thread safe 하게 구현. 다만 성능저하가 있다.

> LazyHolderThreadSafe singleton구현
* holder 안에 선언된 instance가 static이기 때문에 클래스 로딩 시점에 한번만 호출된다는 점을 이용한 thread safe 방식 (권장)

* 디자인패턴의 고도화를 보는듯하다...