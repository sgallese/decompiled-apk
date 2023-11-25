package v1;

import java.util.List;

/* compiled from: MultiParagraph.kt */
/* loaded from: classes.dex */
public final class k {
    public static final int a(List<n> list, int i10) {
        char c10;
        qc.q.i(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            n nVar = list.get(i12);
            if (nVar.f() > i10) {
                c10 = 1;
            } else if (nVar.b() <= i10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final int b(List<n> list, int i10) {
        char c10;
        qc.q.i(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            n nVar = list.get(i12);
            if (nVar.g() > i10) {
                c10 = 1;
            } else if (nVar.c() <= i10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final int c(List<n> list, float f10) {
        char c10;
        qc.q.i(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            n nVar = list.get(i11);
            if (nVar.h() > f10) {
                c10 = 1;
            } else if (nVar.a() <= f10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i10 = i11 + 1;
            } else if (c10 > 0) {
                size = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }
}
