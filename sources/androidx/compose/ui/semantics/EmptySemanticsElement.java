package androidx.compose.ui.semantics;

import p1.u0;
import qc.q;
import t1.f;

/* compiled from: SemanticsModifier.kt */
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends u0<f> {

    /* renamed from: c  reason: collision with root package name */
    public static final EmptySemanticsElement f3011c = new EmptySemanticsElement();

    private EmptySemanticsElement() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public f e() {
        return new f();
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(f fVar) {
        q.i(fVar, "node");
    }
}
