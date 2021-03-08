// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/8/2021 10:11:23 AM
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Gen.java


final class Gen extends Enum
{

    public static Gen[] values()
    {
        return (Gen[])$VALUES.clone();
    }

    public static Gen valueOf(String s)
    {
        return (Gen)Enum.valueOf(Gen, s);
    }

    private Gen(String s, int i)
    {
        super(s, i);
    }

    public static final Gen barbat;
    public static final Gen femeie;
    public static final Gen newLiteral;
    private static final Gen $VALUES[];

    static 
    {
        barbat = new Gen("barbat", 0);
        femeie = new Gen("femeie", 1);
        newLiteral = new Gen("newLiteral", 2);
        $VALUES = (new Gen[] {
            barbat, femeie, newLiteral
        });
    }
}
