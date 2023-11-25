package vc;

import ec.i0;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes4.dex */
public final class h extends i0 {

    /* renamed from: f  reason: collision with root package name */
    private final long f25129f;

    /* renamed from: m  reason: collision with root package name */
    private final long f25130m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f25131p;

    /* renamed from: q  reason: collision with root package name */
    private long f25132q;

    public h(long j10, long j11, long j12) {
        this.f25129f = j12;
        this.f25130m = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f25131p = z10;
        this.f25132q = z10 ? j10 : j11;
    }

    @Override // ec.i0
    public long a() {
        long j10 = this.f25132q;
        if (j10 == this.f25130m) {
            if (this.f25131p) {
                this.f25131p = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f25132q = this.f25129f + j10;
        }
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f25131p;
    }
}
