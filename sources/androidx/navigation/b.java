package androidx.navigation;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;

/* compiled from: NavArgument.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final o<Object> f5134a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5135b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5136c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f5137d;

    /* compiled from: NavArgument.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private o<Object> f5138a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5139b;

        /* renamed from: c  reason: collision with root package name */
        private Object f5140c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5141d;

        public final b a() {
            o<Object> oVar = this.f5138a;
            if (oVar == null) {
                oVar = o.f5367c.c(this.f5140c);
                qc.q.g(oVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new b(oVar, this.f5139b, this.f5140c, this.f5141d);
        }

        public final a b(Object obj) {
            this.f5140c = obj;
            this.f5141d = true;
            return this;
        }

        public final a c(boolean z10) {
            this.f5139b = z10;
            return this;
        }

        public final <T> a d(o<T> oVar) {
            qc.q.i(oVar, TaskFormActivity.TASK_TYPE_KEY);
            this.f5138a = oVar;
            return this;
        }
    }

    public b(o<Object> oVar, boolean z10, Object obj, boolean z11) {
        boolean z12;
        qc.q.i(oVar, TaskFormActivity.TASK_TYPE_KEY);
        if (!oVar.c() && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            if ((!z10 && z11 && obj == null) ? false : true) {
                this.f5134a = oVar;
                this.f5135b = z10;
                this.f5137d = obj;
                this.f5136c = z11;
                return;
            }
            throw new IllegalArgumentException(("Argument with type " + oVar.b() + " has null value but is not nullable.").toString());
        }
        throw new IllegalArgumentException((oVar.b() + " does not allow nullable values").toString());
    }

    public final o<Object> a() {
        return this.f5134a;
    }

    public final boolean b() {
        return this.f5136c;
    }

    public final boolean c() {
        return this.f5135b;
    }

    public final void d(String str, Bundle bundle) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(bundle, "bundle");
        if (this.f5136c) {
            this.f5134a.h(bundle, str, this.f5137d);
        }
    }

    public final boolean e(String str, Bundle bundle) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(bundle, "bundle");
        if (!this.f5135b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f5134a.a(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !qc.q.d(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f5135b != bVar.f5135b || this.f5136c != bVar.f5136c || !qc.q.d(this.f5134a, bVar.f5134a)) {
            return false;
        }
        Object obj2 = this.f5137d;
        if (obj2 != null) {
            return qc.q.d(obj2, bVar.f5137d);
        }
        if (bVar.f5137d == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((this.f5134a.hashCode() * 31) + (this.f5135b ? 1 : 0)) * 31) + (this.f5136c ? 1 : 0)) * 31;
        Object obj = this.f5137d;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.getSimpleName());
        sb2.append(" Type: " + this.f5134a);
        sb2.append(" Nullable: " + this.f5135b);
        if (this.f5136c) {
            sb2.append(" DefaultValue: " + this.f5137d);
        }
        String sb3 = sb2.toString();
        qc.q.h(sb3, "sb.toString()");
        return sb3;
    }
}
