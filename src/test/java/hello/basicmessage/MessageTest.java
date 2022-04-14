package hello.basicmessage;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MessageTest {

    @Autowired
    MessageSource ms;

    @Test
    void 기본메시지테스트() {
        String hello = ms.getMessage("hello", null, null);
        assertThat(hello).isEqualTo("굳굳");
    }

    @Test
    void 영어메시지테스트() {
        String hello = ms.getMessage("hello", null, Locale.ENGLISH);
        assertThat(hello).isEqualTo("GoodGood");
    }

    @Test
    void 기본메시지파라미터() {
        String hi = ms.getMessage("hi", new Object[]{"쿵쿵따"}, null);
        assertThat(hi).isEqualTo("안녕 쿵쿵따");
    }

    @Test
    void 기본영어메시지파라미터() {
        String hi = ms.getMessage("hi", new Object[]{"tori"}, Locale.ENGLISH);
        assertThat(hi).isEqualTo("hiYo tori");

    }
}
