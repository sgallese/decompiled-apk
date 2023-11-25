package k3;

import android.os.Bundle;

/* compiled from: ActionOnlyNavDirections.kt */
/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    private final int f19299a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f19300b = new Bundle();

    public a(int i10) {
        this.f19299a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qc.q.d(a.class, obj.getClass()) && getActionId() == ((a) obj).getActionId()) {
            return true;
        }
        return false;
    }

    @Override // k3.k
    public int getActionId() {
        return this.f19299a;
    }

    @Override // k3.k
    public Bundle getArguments() {
        return this.f19300b;
    }

    public int hashCode() {
        return 31 + getActionId();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + getActionId() + ')';
    }
}
