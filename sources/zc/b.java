package zc;

import java.text.DecimalFormat;

/* compiled from: DurationJvm.kt */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f26436a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<DecimalFormat>[] f26437b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f26437b = threadLocalArr;
    }

    public static final boolean a() {
        return f26436a;
    }
}
