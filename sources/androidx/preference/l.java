package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.n0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;

/* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
@Deprecated
/* loaded from: classes.dex */
public class l extends w {

    /* renamed from: f  reason: collision with root package name */
    final RecyclerView f6334f;

    /* renamed from: g  reason: collision with root package name */
    final androidx.core.view.a f6335g;

    /* renamed from: h  reason: collision with root package name */
    final androidx.core.view.a f6336h;

    /* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            Preference i10;
            l.this.f6335g.g(view, n0Var);
            int childAdapterPosition = l.this.f6334f.getChildAdapterPosition(view);
            RecyclerView.h adapter = l.this.f6334f.getAdapter();
            if (!(adapter instanceof i) || (i10 = ((i) adapter).i(childAdapterPosition)) == null) {
                return;
            }
            i10.onInitializeAccessibilityNodeInfo(n0Var);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            return l.this.f6335g.j(view, i10, bundle);
        }
    }

    public l(RecyclerView recyclerView) {
        super(recyclerView);
        this.f6335g = super.n();
        this.f6336h = new a();
        this.f6334f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.w
    public androidx.core.view.a n() {
        return this.f6336h;
    }
}
