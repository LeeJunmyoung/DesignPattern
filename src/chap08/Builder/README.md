# 8 BuilderMethod 패턴

> 빌더 패턴(Builder pattern)이란 복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴이다.  


* 생성자에 몰아 넣다보면 각인자가 어떤 의미인지 알기 어렵고
* 1회 호출로 객체 생성이 끝나는 걸 방지 ( setter 남발 )
* 빌더패턴은 한번에 객체를 생성하므로 가독성과 선언이 한번에 가능하다!.