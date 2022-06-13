package cheat.sheet.sample.annotation.lomboks;

import lombok.Value;


/*
* https://projectlombok.org/features/Value
*
* Immutable data class 생성용도
*
* 모든 필드는 private, final 이며 setter는 비활성화
*
* 아래 Annotations 의 shorthand
* @ToString
* @EqualsAndHashCode
* @AllArgsConstructor
* @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
* @Getter
*
* */
@Value(staticConstructor = "of")
public class ValueAnno {

    String something;

}
