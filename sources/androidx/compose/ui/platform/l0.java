package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ActionMode;
import android.view.View;

/* compiled from: AndroidTextToolbar.android.kt */
/* loaded from: classes.dex */
public final class l0 implements w3 {

    /* renamed from: a  reason: collision with root package name */
    private final View f2742a;

    /* renamed from: b  reason: collision with root package name */
    private ActionMode f2743b;

    /* renamed from: c  reason: collision with root package name */
    private final r1.d f2744c;

    /* renamed from: d  reason: collision with root package name */
    private a4 f2745d;

    /* compiled from: AndroidTextToolbar.android.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<dc.w> {
        a() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            l0.this.f2743b = null;
        }
    }

    public l0(View view) {
        qc.q.i(view, "view");
        this.f2742a = view;
        this.f2744c = new r1.d(new a(), null, null, null, null, null, 62, null);
        this.f2745d = a4.Hidden;
    }

    @Override // androidx.compose.ui.platform.w3
    public void a(z0.h hVar, pc.a<dc.w> aVar, pc.a<dc.w> aVar2, pc.a<dc.w> aVar3, pc.a<dc.w> aVar4) {
        ActionMode startActionMode;
        qc.q.i(hVar, "rect");
        this.f2744c.l(hVar);
        this.f2744c.h(aVar);
        this.f2744c.i(aVar3);
        this.f2744c.j(aVar2);
        this.f2744c.k(aVar4);
        ActionMode actionMode = this.f2743b;
        if (actionMode == null) {
            this.f2745d = a4.Shown;
            if (Build.VERSION.SDK_INT >= 23) {
                startActionMode = z3.f3008a.b(this.f2742a, new r1.a(this.f2744c), 1);
            } else {
                startActionMode = this.f2742a.startActionMode(new r1.c(this.f2744c));
            }
            this.f2743b = startActionMode;
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.w3
    public void b() {
        this.f2745d = a4.Hidden;
        ActionMode actionMode = this.f2743b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f2743b = null;
    }

    @Override // androidx.compose.ui.platform.w3
    public a4 getStatus() {
        return this.f2745d;
    }
}
