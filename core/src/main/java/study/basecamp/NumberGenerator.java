package study.basecamp;

public interface NumberGenerator {

    void setMinNumber(int minNumber);

    void setMaxNumber(int maxNumber);

    int next();

    int getMinNumber();

    int getMaxNumber();

}
