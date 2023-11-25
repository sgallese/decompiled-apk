package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.n0;
import androidx.core.view.accessibility.q0;
import androidx.core.view.p0;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class w extends androidx.core.view.a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f6945d;

    /* renamed from: e  reason: collision with root package name */
    private final a f6946e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static class a extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        final w f6947d;

        /* renamed from: e  reason: collision with root package name */
        private Map<View, androidx.core.view.a> f6948e = new WeakHashMap();

        public a(w wVar) {
            this.f6947d = wVar;
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f6948e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public q0 b(View view) {
            androidx.core.view.a aVar = this.f6948e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f6948e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) n0 n0Var) {
            if (!this.f6947d.o() && this.f6947d.f6945d.getLayoutManager() != null) {
                this.f6947d.f6945d.getLayoutManager().X0(view, n0Var);
                androidx.core.view.a aVar = this.f6948e.get(view);
                if (aVar != null) {
                    aVar.g(view, n0Var);
                    return;
                } else {
                    super.g(view, n0Var);
                    return;
                }
            }
            super.g(view, n0Var);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f6948e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f6948e.get(viewGroup);
            if (aVar != null) {
                return aVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (!this.f6947d.o() && this.f6947d.f6945d.getLayoutManager() != null) {
                androidx.core.view.a aVar = this.f6948e.get(view);
                if (aVar != null) {
                    if (aVar.j(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.j(view, i10, bundle)) {
                    return true;
                }
                return this.f6947d.f6945d.getLayoutManager().r1(view, i10, bundle);
            }
            return super.j(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i10) {
            androidx.core.view.a aVar = this.f6948e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f6948e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.core.view.a n(View view) {
            return this.f6948e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(View view) {
            androidx.core.view.a n10 = p0.n(view);
            if (n10 != null && n10 != this) {
                this.f6948e.put(view, n10);
            }
        }
    }

    public w(RecyclerView recyclerView) {
        this.f6945d = recyclerView;
        androidx.core.view.a n10 = n();
        if (n10 != null && (n10 instanceof a)) {
            this.f6946e = (a) n10;
        } else {
            this.f6946e = new a(this);
        }
    }

    @Override // androidx.core.view.a
    public void f(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().T0(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.a
    public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) n0 n0Var) {
        super.g(view, n0Var);
        if (!o() && this.f6945d.getLayoutManager() != null) {
            this.f6945d.getLayoutManager().V0(n0Var);
        }
    }

    @Override // androidx.core.view.a
    public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (!o() && this.f6945d.getLayoutManager() != null) {
            return this.f6945d.getLayoutManager().p1(i10, bundle);
        }
        return false;
    }

    public androidx.core.view.a n() {
        return this.f6946e;
    }

    boolean o() {
        return this.f6945d.hasPendingAdapterUpdates();
    }
}
