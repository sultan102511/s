package com.java.homework2ndmonth.inheritancehomework;

public class WorldCupMain {
    public static void main(String[] args) {
        GroupB countries = new GroupB();
        countries.GroupA(" 1.Netherlands","\n 2.Senegal","\n 3.Ecuador", "\n 4.Qatar" );

        countries.GroupB(" 1.England", "\n 2.Wales", "\n 3.USA", "\n 4.Iran" );

        GroupC c = new GroupC();
        c.GroupC(" 1.Argentina", "\n 2.Poland", "\n 3.Mexico", "\n 4.Saudi Arabia" );

        GroupD d = new GroupD();
        d.GroupD(" 1.France", "\n 2.Denmark", "\n 3.Tunisia", "\n 4.Australia" );

        GroupE e = new GroupE();
        e.GroupE(" 1.Costa Rica", "\n 2.Germany", "\n 3.Japan", "\n 4.Spain" );

        GroupF f = new GroupF();
        f.GroupF(" 1.Belgium", "\n 2.Canada", "\n 3.Croatia", "\n 4.Morocco" );

        GroupG g = new GroupG();
        g.GroupA(" 1.Brazil", "\n 2.Cameroon", "\n 3.Serbia", "\n 4.Switzerland" );

        GroupH h = new GroupH();
        h.GroupH(" 1.Ghana", "\n 2.South Korea", "\n 3.Portugal", "\n 4.Uruguay" );




    }
}
