# 4 Strategy 패턴

> 전략 패턴(strategy pattern) 또는 정책 패턴(policy pattern)은 실행 중에 알고리즘을 선택할 수 있게 하는 행위 소프트웨어 디자인 패턴이다. 전략 패턴은
* 특정한 계열의 알고리즘들을 정의하고
* 각 알고리즘을 캡슐화하며
* 이 알고리즘들을 해당 계열 안에서 상호 교체가 가능하게 만든다.




> Strategy
* 인터페이스나 추상 클래스로 외부에서 동일한 방식으로 알고리즘을 호출하는 방법을 명시
 * Algorithm

> ConcreteStrategy
* 스트래티지 패턴에서 명시한 알고리즘을 실제로 구현한 클래스
 * BubbleSort,MergeSort,QuickSort
  
  
> Context
* 스트래티지 패턴을 이용하는 역할을 수행한다.
* 필요에 따라 동적으로 구체적인 전략을 바꿀 수 있도록 setter 메서드(‘집약 관계’)를 제공한다.
 * SortAlgorithm
