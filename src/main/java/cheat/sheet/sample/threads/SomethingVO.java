package cheat.sheet.sample.threads;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class SomethingVO {

    int value;

    public SomethingVO(int value) {
        this.value = value;
    }
}
