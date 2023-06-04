package soild.test03lsp.after;

/**
 * 사각형 객체
 *
 * @author RWB
 * @since 2021.08.14 Sat 11:39:02
 */
public class Shape
{
    protected int width;
    protected int height;

    /**
     * 너비 반환 함수
     *
     * @return [int] 너비
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * 높이 반환 함수
     *
     * @return [int] 높이
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * 너비 할당 함수
     *
     * @param width: [int] 너비
     */
    public void setWidth(int width)
    {
        this.width = width;
    }

    /**
     * 높이 할당 함수
     *
     * @param height: [int] 높이
     */
    public void setHeight(int height)
    {
        this.height = height;
    }

    /**
     * 넓이 반환 함수
     *
     * @return [int] 넓이
     */
    public int getArea()
    {
        return width * height;
    }
}

