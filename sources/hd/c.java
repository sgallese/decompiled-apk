package hd;

import ad.g0;
import fd.o;

/* compiled from: Dispatcher.kt */
/* loaded from: classes4.dex */
public final class c extends f {

    /* renamed from: u  reason: collision with root package name */
    public static final c f16629u = new c();

    private c() {
        super(l.f16642c, l.f16643d, l.f16644e, l.f16640a);
    }

    @Override // ad.g0
    public g0 F0(int i10) {
        o.a(i10);
        if (i10 >= l.f16642c) {
            return this;
        }
        return super.F0(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // ad.g0
    public String toString() {
        return "Dispatchers.Default";
    }
}
