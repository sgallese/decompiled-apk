package a1;

import a1.z3;

/* compiled from: RectangleShape.kt */
/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: a  reason: collision with root package name */
    private static final q4 f118a = new a();

    /* compiled from: RectangleShape.kt */
    /* loaded from: classes.dex */
    public static final class a implements q4 {
        a() {
        }

        @Override // a1.q4
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public z3.b a(long j10, j2.r rVar, j2.e eVar) {
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(eVar, "density");
            return new z3.b(z0.m.c(j10));
        }

        public String toString() {
            return "RectangleShape";
        }
    }

    public static final q4 a() {
        return f118a;
    }
}
