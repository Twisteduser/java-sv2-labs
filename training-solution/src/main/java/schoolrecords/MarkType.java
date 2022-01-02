package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private int mark;
    private String typeOfMark;

    MarkType(int mark, String typeOfMark) {
        this.mark = mark;
        this.typeOfMark = typeOfMark;
    }

    public int getMark() {
        return mark;
    }

    public String getTypeOfMark() {
        return typeOfMark;
    }
}
