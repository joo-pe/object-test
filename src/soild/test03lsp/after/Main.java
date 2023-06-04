package soild.test03lsp.after;

/**
 * 메인 클래스
 *
 * @author RWB
 * @since 2021.06.14 Mon 00:06:32
 */
public class Main
{
    /**
     * 메인 함수
     *
     * @param args: [String[]] 매개변수
     */
    public static void main(String[] args)
    {
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(5);
        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
    }
}

