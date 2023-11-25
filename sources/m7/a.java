package m7;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f19746a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0445a f19747b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19748c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: m7.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0445a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0445a interfaceC0445a, Typeface typeface) {
        this.f19746a = typeface;
        this.f19747b = interfaceC0445a;
    }

    private void d(Typeface typeface) {
        if (!this.f19748c) {
            this.f19747b.a(typeface);
        }
    }

    @Override // m7.f
    public void a(int i10) {
        d(this.f19746a);
    }

    @Override // m7.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f19748c = true;
    }
}
