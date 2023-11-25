package vc;

import ec.h0;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes4.dex */
public final class e extends h0 {

    /* renamed from: f  reason: collision with root package name */
    private final int f25119f;

    /* renamed from: m  reason: collision with root package name */
    private final int f25120m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f25121p;

    /* renamed from: q  reason: collision with root package name */
    private int f25122q;

    public e(int i10, int i11, int i12) {
        this.f25119f = i12;
        this.f25120m = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f25121p = z10;
        this.f25122q = z10 ? i10 : i11;
    }

    @Override // ec.h0
    public int a() {
        int i10 = this.f25122q;
        if (i10 == this.f25120m) {
            if (this.f25121p) {
                this.f25121p = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f25122q = this.f25119f + i10;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f25121p;
    }
}
