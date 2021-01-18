# REST?

- 웹에 존재하는 모든 자원에 고유한 URI를 부여해 활용하는것
- Restful API = REST 특징을 지키면서 API를 제공하는 것
- 구성 : 자원(Resource) - URI + 행위(Verb) - HTTP Method + 표현(Representations)
- 특징 : 
  - Uniform(유니폼 인터페이스) : 특정 언어나 기술에 종속되지 않고 모든 플랫폼에 사용이 가능, URI로 지정한 리소스에 대한 조작이 가능한 아키텍쳐 스타일
  - Stateless(무상태성) : 세션과 같은 컨텍스트 정보를 신경쓸 필요가 없어 구현이 단순함
  - Cacheable(캐시가능) : HTTP 기존의 웹 표준을 그대로 사용하므로, 웹에서 사용하는 기존의 인프라를 그대로 활용 가능함
  - Self-descriptiveness(자체 표현 구조) : 동사(Method) + 명사(URI)로 이루어져 있어 어떤 메서드에 무슨 행위를 하는지 알 수 있으며, 메시지 포맷 역시 JSON을 이용해서 직관적으로 이해가 가능한 구조로, REST API 메시지만 보고도 이를 쉽게 이해할 수 있다.
  - Client-Server 구조 : REST 서버는 API 제공, 클라이 언트는 사용자 인증이나 컨텍스트를 직접 관리하는 구조로 각각의 역할이 확실히 구분되기 때문에 클라이언트와 서버에서 개발해야 할 내용이 명확해지고 서로간 의존성이 줄어들게 된다.

#  REST API?

- HTTP를 효율적으로 사용하기 위한 아키텍쳐

# REST 인터페이스의 특징

- 자원을 URI로 구분한다.
- 메세지를 통해 resource를 조작한다. (HTTP method 사용)
- 각 메세지는 자기를 어떻게 처리해야 하는지에 대한 정보를 가지고 있다. (자기 PR)

# Retrofit?

- 서버에 Restful API에 맞는 요청을 보내기 위해 사용하는 통신 라이브러리
- AsyncTask와 HttpUrlConnection을 사용하여 구현이 가능하다. (Retrofit 추천!)

# Retrofit 구현 과정

- build.gradle 추가하기

>  ex)  implementation 'com.squareup.retrofit2:retrofit:2.6.1'
>
> ​    	implementation 'com.squareup.retrofit2:converter-gson:2.6.1' 

- Manifest Permission 등록

  - internet을 사용하으면 internet permission을 추가해준다.

- Data 객체 정의

  - server의 model에서 구성했던것과 동일하게 구성하기

- Retrofit Interface구성

  - Call을 통해서 웹서버에 요청을 보낼 수 있다.

    - Http요청을 어노테이션으로 명시

      > 요청 어노테이션은 5개가 있다. (GET(리소스 조회 및 휙득), POST(리소스 생성), PUT(리소스 수정), DELETE(리소스 삭제), HEAD(?))
      >
      > 정적 쿼리 인자는 URL에 명시할 수도 있다.

    - URL Parameter와 Query Parameter 사용이 가능하다

    - 객체는 Body로 json형태로 전달한다.

      > url끝에 / 를 빼먹으면 에러가 발생할 수 있으니 유의한다.

    - 멀티파트 요청 body와 파일 업로드가 가능하다.

- 동작 확인을 위한 초기와 및 간단한 동작 구현

# ConverterFactory 이용하기

- 대부분의 서버에서는 응답으로 json을 주로 이용한다.

- Converter가 초기화되지 않으면 오류가 발생한다

  > Retrofit에서 소개하고 있는 간단한 예제를 동작하면 오류가 발생하는데 이를 해결하려면 Converter를 초기화시켜야 한다.

# GsonConverterFactory 추가하기

- build.gradle에 추가한다.

  > compile 'com.squareup.retrofit2:converter-gson:(insert latest version)'

- retrofit 초기화 코드에 addConverterFactory를 추가한다.

# 참고할 사이트

- https://zzandoli.tistory.com/48
- https://gwi02379.tistory.com/3
- http://devflow.github.io/retrofit-kr/
- https://thdev.tech/androiddev/2016/11/13/Android-Retrofit-Intro/
- https://blog.naver.com/PostView.nhn?blogId=dododokim&logNo=221818558009&from=search&redirect=Log&widgetTypeCall=true&directAccess=false
- https://simplifyprocess.tistory.com/3 (로깅)

