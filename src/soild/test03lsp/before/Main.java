package soild.test03lsp.before;

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
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);

        System.out.println(rectangle.getArea());

        // 대체
        Rectangle square = new Square();
        square.setWidth(10);
        square.setHeight(5);

        System.out.println(square.getArea());
    }
}

