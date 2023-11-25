package jd;

import fd.g0;

/* compiled from: Mutex.kt */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final g0 f19100a = new g0("NO_OWNER");

    /* renamed from: b  reason: collision with root package name */
    private static final g0 f19101b = new g0("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z10) {
        return new b(z10);
    }

    public static /* synthetic */ a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
