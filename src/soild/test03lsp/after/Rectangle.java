package soild.test03lsp.after;

/**
 * 직사각형 클래스
 *
 * @author RWB
 * @since 2021.08.14 Sat 11:12:44
 */
class Rectangle extends Shape
{
    /**
     * Rectangle 생성자 함수
     *
     * @param width: [int] 너비
     * @param height: [int] 높이
     */
    public Rectangle(int width, int height)
    {
        setWidth(width);
        setHeight(height);
    }
}


