package com.google.protobuf;

import java.io.IOException;

/* compiled from: MessageLite.java */
/* loaded from: classes3.dex */
public interface q0 extends r0 {

    /* compiled from: MessageLite.java */
    /* loaded from: classes3.dex */
    public interface a extends r0, Cloneable {
        q0 build();

        a m(q0 q0Var);

        q0 x();
    }

    a d();

    void e(CodedOutputStream codedOutputStream) throws IOException;

    h h();

    int k();

    a n();

    y0<? extends q0> o();
}
