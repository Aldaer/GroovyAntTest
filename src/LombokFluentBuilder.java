import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Setter
class LombokFluentBuilder
{
    private int a;
    private int b;

    private final int offset;

    LombokFluentBuilder(int offset)
    {
        this.offset = offset;
    }

    void printSum()
    {
        System.out.println(a + b + offset);
    }

    public static void main(String[] args)
    {
        new LombokFluentBuilder(1).setA(2).setB(3).printSum();
    }
}
