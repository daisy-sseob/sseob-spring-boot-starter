# Spring boot User Custom AutoConfiguration Project.

- ⚡️Build : mvn install
- jar file이 생성 되었는지 확인한다.
- 이 프로젝트의 의존성을 추가한 프로젝트에서 `Seob` Bean이 @Autowired 어노테이션을 이용해 주입 가능한지 살펴본다.
- 정상적으로 주입 된다면 @ConditionalOnMissingBean 어노테이션 동작 여부를 확인하기 위해 해당 프로젝트에서 ComponentScan 범위에 해당하는 위치에서 `Seob` Bean을 재정의 해본다.
