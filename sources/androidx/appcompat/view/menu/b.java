package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: f  reason: collision with root package name */
    protected Context f1060f;

    /* renamed from: m  reason: collision with root package name */
    protected Context f1061m;

    /* renamed from: p  reason: collision with root package name */
    protected g f1062p;

    /* renamed from: q  reason: collision with root package name */
    protected LayoutInflater f1063q;

    /* renamed from: r  reason: collision with root package name */
    protected LayoutInflater f1064r;

    /* renamed from: s  reason: collision with root package name */
    private m.a f1065s;

    /* renamed from: t  reason: collision with root package name */
    private int f1066t;

    /* renamed from: u  reason: collision with root package name */
    private int f1067u;

    /* renamed from: v  reason: collision with root package name */
    protected n f1068v;

    /* renamed from: w  reason: collision with root package name */
    private int f1069w;

    public b(Context context, int i10, int i11) {
        this.f1060f = context;
        this.f1063q = LayoutInflater.from(context);
        this.f1066t = i10;
        this.f1067u = i11;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        m.a aVar = this.f1065s;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    protected void b(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1068v).addView(view, i10);
    }

    public abstract void c(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z10) {
        i iVar;
        ViewGroup viewGroup = (ViewGroup) this.f1068v;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f1062p;
        int i10 = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList<i> E = this.f1062p.E();
            int size = E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i iVar2 = E.get(i12);
                if (q(i11, iVar2)) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof n.a) {
                        iVar = ((n.a) childAt).getItemData();
                    } else {
                        iVar = null;
                    }
                    View n10 = n(iVar2, childAt, viewGroup);
                    if (iVar2 != iVar) {
                        n10.setPressed(false);
                        n10.jumpDrawablesToCurrentState();
                    }
                    if (n10 != childAt) {
                        b(n10, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f1065s = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Context context, g gVar) {
        this.f1061m = context;
        this.f1064r = LayoutInflater.from(context);
        this.f1062p = gVar;
    }

    public n.a j(ViewGroup viewGroup) {
        return (n.a) this.f1063q.inflate(this.f1067u, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        m.a aVar = this.f1065s;
        r rVar2 = rVar;
        if (aVar != null) {
            if (rVar == null) {
                rVar2 = this.f1062p;
            }
            return aVar.b(rVar2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public m.a m() {
        return this.f1065s;
    }

    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a j10;
        if (view instanceof n.a) {
            j10 = (n.a) view;
        } else {
            j10 = j(viewGroup);
        }
        c(iVar, j10);
        return (View) j10;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f1068v == null) {
            n nVar = (n) this.f1063q.inflate(this.f1066t, viewGroup, false);
            this.f1068v = nVar;
            nVar.b(this.f1062p);
            d(true);
        }
        return this.f1068v;
    }

    public void p(int i10) {
        this.f1069w = i10;
    }

    public abstract boolean q(int i10, i iVar);
}
