import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy


@Builder(builderStrategy = SimpleStrategy)
class FluentBuilder
{
    int a
    int b
    final int offset

    FluentBuilder(int offset)
    {
        this.offset = offset
    }

    void printSum()
    {
        println a + b + offset
    }

    static void main(String[] args)
    {
        new FluentBuilder(1).setA(2).setB(3).printSum()     // Pure Groovy: OK
    }
}
