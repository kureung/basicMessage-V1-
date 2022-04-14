# basicMessage-V1
V1 버전은 매우 기본적인 메시지 기능입니다.

## 메시지 기능
먼저 스프링부트는 messages 라는 이름이 기본적으로 등록이 되어있습니다. 
`messages.properties` 파일을 통해 메시지 파일을 만들었습니다.
만약에 메시지 파일명을 여러개 등록하고 싶을 경우 `application.properties`에서  `spring.messages.basename=[메시지파일명]` 이렇게 등록할 수 있습니다.

## 국제화 기능
먼저 스프링 부트를 통해 MessageSource 인터페이스를 사용하여 locale 정보에 따른 메시지 국제화 기능을 테스트 코드를 작성했습니다.
국제화 기능을 사용하기 위해 `messages_en.proeprties`를 작성하여 영어권일 경우 자동으로 인식되도록 했습니다.
이후 뷰를 통해서 구현했고 구글 언어 설정을 통해 영어와 한글이 자동적으로 나오도록 국제화 기능을 구현했습니다.


