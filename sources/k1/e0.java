package k1;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: PointerInputEvent.android.kt */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f19169a;

    /* renamed from: b  reason: collision with root package name */
    private final List<f0> f19170b;

    /* renamed from: c  reason: collision with root package name */
    private final MotionEvent f19171c;

    public e0(long j10, List<f0> list, MotionEvent motionEvent) {
        qc.q.i(list, "pointers");
        qc.q.i(motionEvent, "motionEvent");
        this.f19169a = j10;
        this.f19170b = list;
        this.f19171c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f19171c;
    }

    public final List<f0> b() {
        return this.f19170b;
    }
}
