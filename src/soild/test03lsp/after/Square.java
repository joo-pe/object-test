package soild.test03lsp.after;

/**
 * 정사각형 클래스
 *
 * @author RWB
 * @since 2021.08.14 Sat 11:19:07
 */
class Square extends Shape
{
    /**
     * Square 생성자 함수
     *
     * @param length: [int] 길이
     */
    public Square(int length)
    {
        setWidth(length);
        setHeight(length);
    }
}
