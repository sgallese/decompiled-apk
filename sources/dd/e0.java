package dd;

import kotlin.coroutines.Continuation;

/* compiled from: SharedFlow.kt */
/* loaded from: classes4.dex */
public final class e0 extends ed.c<c0<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f13317a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Continuation<? super dc.w> f13318b;

    @Override // ed.c
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public boolean a(c0<?> c0Var) {
        if (this.f13317a >= 0) {
            return false;
        }
        this.f13317a = c0Var.Y();
        return true;
    }

    @Override // ed.c
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public Continuation<dc.w>[] b(c0<?> c0Var) {
        long j10 = this.f13317a;
        this.f13317a = -1L;
        this.f13318b = null;
        return c0Var.X(j10);
    }
}
